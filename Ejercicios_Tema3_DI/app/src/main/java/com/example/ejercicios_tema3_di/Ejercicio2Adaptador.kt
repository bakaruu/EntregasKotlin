package com.example.ejercicios_tema3_di

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicios_tema3_di.databinding.ItemEjer2Binding

class Ejercicio2Adaptador(
    var listaFichas: MutableList<Ejercicio2Ficha>,
    private val listener: Ejercicio2
) : RecyclerView.Adapter<Ejercicio2Adaptador.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemEjer2Binding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_ejer2, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaFichas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ficha = listaFichas[position]

        holder.binding.tvNombre.text = ficha.nombre
        holder.binding.ivAvatar.setImageResource(ficha.fotoResId)
    }
}
