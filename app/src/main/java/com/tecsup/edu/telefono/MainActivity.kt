package com.tecsup.edu.telefono

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, CallActivity::class.java)

        supportActionBar?.hide()

        val bottom = findViewById<Button>(R.id.btnLlamar)
        bottom.setOnClickListener {
            intent.putExtra("nombre", "Carlos Mendoza")
            intent.putExtra("numero", "985 919 866")
            startActivity(intent)

        }

    }
}