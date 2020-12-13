package com.ridhaannisa.tokoica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val btn_kembali = findViewById<Button>(R.id.btn_kembali)

        btn_kembali.setOnClickListener {
            val kembali = Intent(this@ProfilActivity, MainActivity::class.java)
            startActivity(kembali)
        }
    }
}