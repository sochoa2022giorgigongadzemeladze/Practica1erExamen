package com.giorgigongadze.practica1erexamen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btVerificar_onClick(view: View) {
        var etNombre = findViewById<EditText>(R.id.etNombre).text
        var etClave = findViewById<EditText>(R.id.etClave).text
        if (!etClave.toString().equals("abcdef*")) {
            Toast.makeText(this, "Clave errónea!!!", Toast.LENGTH_LONG)
            return
        }
        var intent = Intent(this, BienvenidaActivity::class.java)
        intent.putExtra("nombre", etNombre.toString())
        startActivity(intent)
    }
}