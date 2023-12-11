import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.formulario.Ejercicio1
import com.example.formulario.Ejercicio2
import com.example.formulario.Ejercicio3
import com.example.formulario.R

class MainActivity : AppCompatActivity() {

    private lateinit var formulario1Button: Button
    private lateinit var formulario2Button: Button
    private lateinit var formulario3Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        formulario1Button = findViewById(R.id.formulario1)
        formulario2Button = findViewById(R.id.formulario2)
        formulario3Button = findViewById(R.id.formulario3)

        formulario1Button.setOnClickListener {
            startActivity(Intent(this, Ejercicio1::class.java))
        }

        formulario2Button.setOnClickListener {
            startActivity(Intent(this, Ejercicio2::class.java))
        }

        formulario3Button.setOnClickListener {
            startActivity(Intent(this, Ejercicio3::class.java))
        }
    }
}