package com.example.smd_a1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class internshala : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_internshala)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ✅ Tap on "internshala" text -> go to Chat page
        findViewById<TextView>(R.id.tvAccountInternshala).setOnClickListener {
            startActivity(Intent(this, chat::class.java))
        }


        findViewById<ImageView>(R.id.btnsearch).setOnClickListener {
            startActivity(Intent(this, feedpage::class.java))
        }
        findViewById<TextView>(R.id.btnClear1).setOnClickListener {
            startActivity(Intent(this, feedpage::class.java))
        }




    }
}
