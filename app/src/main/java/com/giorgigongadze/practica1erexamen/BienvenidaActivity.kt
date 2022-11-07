package com.giorgigongadze.practica1erexamen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BienvenidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)
        var tvBienvenido = findViewById<TextView>(R.id.tvBienvenido)
        tvBienvenido.setText("Bienvenido " + intent.getStringExtra("nombre"))
    }
}