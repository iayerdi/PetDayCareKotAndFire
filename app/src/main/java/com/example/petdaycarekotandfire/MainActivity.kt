package com.example.petdaycarekotandfire

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonIniciar = findViewById<Button>(R.id.buttonIniciar)

        buttonIniciar.setOnClickListener {
            var i = Intent(this,Login::class.java)
            startActivity(i)
        }

    }

}