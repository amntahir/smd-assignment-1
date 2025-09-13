package com.example.smd_a1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class gallery : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        // (safe) system insets
        val root = findViewById<View?>(R.id.main)
        root?.let {
            ViewCompat.setOnApplyWindowInsetsListener(it) { v, insets ->
                val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(bars.left, bars.top, bars.right, bars.bottom)
                insets
            }
        }

        // Cancel → just close Gallery and return to whoever opened it
        findViewById<TextView>(R.id.tvCancel).setOnClickListener {
            finish()
        }

        // Next → go to Story (keep back stack so back returns to Gallery)
        findViewById<TextView>(R.id.tvNext).setOnClickListener {
            startActivity(Intent(this, story::class.java))
        }
    }
}
