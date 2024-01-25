package com.example.ejercicios_tema9_pmd

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStream

class Ejercicio3 : AppCompatActivity() {

    private lateinit var profileImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        profileImageView = findViewById(R.id.profileImageView)
        profileImageView.setOnClickListener {
            showImagePicker()
        }
    }

    private fun showImagePicker() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICKER_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                IMAGE_PICKER_REQUEST_CODE -> {
                    data?.data?.let { uri ->
                        val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri)
                        profileImageView.setImageBitmap(bitmap)
                        saveImageToInternalStorage(this, "profile_image.jpg", bitmap)
                    }
                }
            }
        }
    }

    private fun saveImageToInternalStorage(context: Context, fileName: String, bitmap: Bitmap) {
        val fileOutputStream: FileOutputStream
        try {
            // Crea un archivo en el almacenamiento interno
            val file = File(context.filesDir, fileName)

            // Abre un flujo de salida al archivo
            fileOutputStream = FileOutputStream(file)

            // Guarda el bitmap en el archivo de salida
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream)

            // Cierra el flujo de salida
            fileOutputStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    companion object {
        private const val IMAGE_PICKER_REQUEST_CODE = 1
    }
}
