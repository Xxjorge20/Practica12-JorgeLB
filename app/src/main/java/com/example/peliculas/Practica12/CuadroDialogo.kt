package com.example.peliculas.Practica12

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.os.Process
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class CuadroDialogo: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity.let {
            val title = "Confirmación"
            val content = "¿Estas seguro que deseas salir de la App?"
            val builder: AlertDialog.Builder=AlertDialog.Builder(requireActivity())
            builder.setTitle(title).setMessage(content)
                .setPositiveButton(android.R.string.ok)  {dialog, which ->
                    Toast.makeText(requireActivity().applicationContext,"Se esta cerrando la app", Toast.LENGTH_SHORT).show()
                    android.os.Process.killProcess(android.os.Process.myPid());
                }
                .setNegativeButton(android.R.string.cancel) {dialog, which ->
                    Toast.makeText(requireActivity().applicationContext, "No se ha cerrado la app", Toast.LENGTH_SHORT).show()
                }
            //Devuelve un AlertDialog
            //tal y como lo hemos definido en el builder
            return builder.create()
        } ?: throw IllegalStateException("El fragmento no está asociado a ninguna actividad")
    }
}


