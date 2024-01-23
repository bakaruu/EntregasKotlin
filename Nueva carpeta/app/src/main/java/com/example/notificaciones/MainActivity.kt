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
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.notificaciones.databinding.ActivityMainBinding
import java.util.concurrent.atomic.AtomicInteger


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        btn1 = binding.btnTest1
        btn2 = binding.btnTest2
        btn3 = binding.btnTest3

        btn1.setOnClickListener {
            val intent = Intent(this, Seminar1::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, Seminar2::class.java)
            startActivity(intent)
        }


        btn3.setOnClickListener {
            val intent = Intent(this, Seminar3::class.java)
            startActivity(intent)
        }



    }



}