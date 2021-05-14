package com.example.pesoideal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private var altura: TextView? = null
    private var peso: TextView? = null
    private var resultado: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

        this.altura = findViewById(R.id.altura)
        this.peso = findViewById(R.id.peso)
        this.resultado = findViewById(R.id.resultado)


        btn.setOnClickListener {
            val altura = altura?.text.toString()
            val peso = peso?.text.toString()

            

            // Check if the fields are not null
            if (altura.isEmpty() || peso.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT)
                        .show()
                return@setOnClickListener


            }

        }

    }
}
