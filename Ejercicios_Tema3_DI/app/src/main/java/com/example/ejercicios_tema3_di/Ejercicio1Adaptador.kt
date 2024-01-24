package com.example.ejercicios_tema3_di

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicios_tema3_di.databinding.ItemEjer1Binding


class Ejercicio1Adaptador(var listaContactos: MutableList<Ejercicio1Contacto>,var listaFotos : List<Int>,
                          private val listener: Ejercicio1): RecyclerView.Adapter<Ejercicio1Adaptador.ViewHolder>() {

    inner class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemEjer1Binding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_ejer1, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaContactos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contacto = listaContactos.get(position)
        val foto = listaFotos.get(position)
        holder.binding.tvNombre.text = contacto.nombre
        holder.binding.tvEmail.text = contacto.correo
        holder.binding.tvTelefono.text = contacto.telefono
        holder.binding.ivAvatar.setImageResource(foto)
    }
}