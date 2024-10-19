package com.elmajuelopmdm.practica2saludo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tvTitle = findViewById<TextView>(R.id.tvTitulo)
        val etName = findViewById<EditText>(R.id.etNombre)
        val btSaludo = findViewById<Button>(R.id.btSaludar)

        btSaludo.setOnClickListener(){
            //Capturamos y guardamos el valor de nombre que introduce el usuario
            val name: String = etName.text.toString()

            if(name.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("NAME", name)
                startActivity(intent)
            }
        }
    }


}