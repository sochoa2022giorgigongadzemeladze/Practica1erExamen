package com.giorgigongadze.practica1erexamen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btVerificar_onClick(view: View) {
        var etNombre = findViewById<EditText>(R.id.etNombre).text
        var etClave = findViewById<EditText>(R.id.etClave).text
    }
}