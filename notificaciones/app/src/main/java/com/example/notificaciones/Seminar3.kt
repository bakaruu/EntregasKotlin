package com.example.notificaciones
import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.notificaciones.MainActivity
import com.example.notificaciones.R
import java.util.concurrent.atomic.AtomicInteger

class Seminar3 : AppCompatActivity() {

    private lateinit var etTitulo: EditText
    private lateinit var etTexto: EditText
    private lateinit var spinnerIcono: Spinner
    private lateinit var spinnerImagen: Spinner
    private lateinit var etNumeroBotones: EditText
    private lateinit var layoutBotones: LinearLayout
    private lateinit var btnEnviarNotificacion: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seminar3)

        etTitulo = findViewById(R.id.etTitulo)
        etTexto = findViewById(R.id.etTexto)
        spinnerIcono = findViewById(R.id.spinnerIcono)
        spinnerImagen = findViewById(R.id.spinnerImagen)
        etNumeroBotones = findViewById(R.id.etNumeroBotones)
        layoutBotones = findViewById(R.id.layoutBotones)
        btnEnviarNotificacion = findViewById(R.id.btnEnviarNotificacion)

        // Configuración de los spinners (reemplaza con tus datos reales)
        val iconos = arrayOf("Icono 1", "Icono 2", "Icono 3")
        val imagenes = arrayOf("Imagen 1", "Imagen 2", "Imagen 3")

        val adapterIcono = ArrayAdapter(this, android.R.layout.simple_spinner_item, iconos)
        val adapterImagen = ArrayAdapter(this, android.R.layout.simple_spinner_item, imagenes)

        spinnerIcono.adapter = adapterIcono
        spinnerImagen.adapter = adapterImagen

        btnEnviarNotificacion.setOnClickListener {
            enviarNotificacion()
        }
    }

    companion object {
        val CHANNEL_ID = "channel_id_example_01"
        val CHANNEL_NAME = "Channel Name"
        val CHANNEL_DESCRIPTION = "Channel Description"
        val id = AtomicInteger(0)

        fun createNotificationId(): Int {
            return id.incrementAndGet()
        }
    }

    private fun enviarNotificacion() {
        val notificationId = createNotificationId()

        val intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }

        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle(etTitulo.text.toString())
            .setContentText(etTexto.text.toString())
            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.steam)) // Reemplaza con tu imagen
            .setContentIntent(createPendingIntent(intent))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(this)) {
            if (ActivityCompat.checkSelfPermission(
                    this@Seminar3,
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return
            }
            notify(notificationId, builder.build())
        }
    }

    private fun createPendingIntent(intent: Intent) =
        PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)

    private fun createNotificationId() = id.incrementAndGet()
}
