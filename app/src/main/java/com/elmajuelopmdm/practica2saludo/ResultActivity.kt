package com.elmajuelopmdm.practica2saludo

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Creamos valor con el mismo nombre del text
        val tv_result = findViewById<TextView>(R.id.tvResultado)
        //Creamos variable para almacenar el contenido del intent de clave NAME
        val name: String = intent.extras?.getString("NAME").orEmpty()
        tv_result.text = "Hola $name"
    }
}