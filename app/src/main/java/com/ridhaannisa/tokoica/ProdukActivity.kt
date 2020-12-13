package com.ridhaannisa.tokoica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_produk.*

class ProdukActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_HARGA = "extra_harga"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk)

        nama_produk.text = intent.getStringExtra(EXTRA_NAMA)
        harga_produk.text = intent.getStringExtra(EXTRA_HARGA)

        btn_kembali.setOnClickListener {
            val kembali = Intent(this@ProdukActivity, MainActivity::class.java)
            startActivity(kembali)
        }
    }
}