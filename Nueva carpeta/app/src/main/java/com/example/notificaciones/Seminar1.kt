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
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.notificaciones.databinding.ActivitySeminar1Binding
import java.util.concurrent.atomic.AtomicInteger

class Seminar1:AppCompatActivity() {

    private lateinit var binding: ActivitySeminar1Binding

    private lateinit var btnNotificacion: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeminar1Binding.inflate(layoutInflater)
        setContentView(binding.root)


        // Llama a createNotificationChannel() para inicializar el canal de notificación
        createNotificationChannel()
        btnNotificacion = binding.btnSendNotification

        btnNotificacion.setOnClickListener {
            sendNotification()
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

    private fun createNotificationChannel() {


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = CHANNEL_NAME
            val descriptionText = CHANNEL_DESCRIPTION
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }

            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)


        }


    }

    private fun sendNotification() {
        val notificationId = createNotificationId()

        val intent: Intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }

        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_MUTABLE)
        val seminar1 = PendingIntent.getActivity(
            this,
            0,
            Intent(this, Seminar1::class.java),
            PendingIntent.FLAG_MUTABLE
        )
        val bitmap = BitmapFactory.decodeResource(
            applicationContext.resources,
            R.drawable.steam
        )
        val bitmapLargeItem = BitmapFactory.decodeResource(
            applicationContext.resources,
            R.drawable.steam
        )

        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_foreground) // Establece el icono directamente
            .setContentTitle("Titulo")
            .setContentText("Ejercicio 1, mi id es $notificationId")
            .setLargeIcon(bitmapLargeItem)
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .addAction(
                android.R.drawable.ic_dialog_info, // Icono predeterminado de Android
                "Abrir Actividad",
                seminar1
            )



        with(NotificationManagerCompat.from(this)) {
            if (ActivityCompat.checkSelfPermission(
                    this@Seminar1,
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // TODO: Consider calling ActivityCompat#requestPermissions
                return
            }
            notify(notificationId, builder.build())
        }
    }
}