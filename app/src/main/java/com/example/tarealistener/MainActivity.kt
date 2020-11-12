package com.example.tarealistener

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.boton)
        val editarTexto = findViewById<EditText>(R.id.editText)
        var contador=0

        boton.setOnClickListener {

            if (contador == 0) {
                editarTexto.isInvisible = false
                boton.text = "Finalizar"
                contador++
            } else
                editarTexto.isInvisible = true



        }



            editarTexto.setOnFocusChangeListener { v, hasFocus ->

                var cadena: String = editarTexto.text.toString()

                if (hasFocus)
                    editarTexto.text = null
               // else
                // editarTexto.text=cadena


            }




        }



}