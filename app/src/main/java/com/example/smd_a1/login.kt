package com.example.smd_a1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Back arrow -> Register
        findViewById<ImageButton>(R.id.btnBack).setOnClickListener {
            startActivity(Intent(this@login, register::class.java))
            finish()
        }

        findViewById<TextView>(R.id.tvSignUp).setOnClickListener {
            startActivity(Intent(this@login, register::class.java))
            finish()
        }

        // Login button -> Cred page
        // Login button -> Cred page
        findViewById<Button>(R.id.btnlogin).setOnClickListener {
            startActivity(Intent(this@login, cred::class.java))
            finish() // ✅ remove Login from stack
            // (optional) overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

    }
}
