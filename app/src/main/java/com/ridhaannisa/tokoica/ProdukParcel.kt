package com.ridhaannisa.tokoica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ridhaannisa.tokoica.Model.User
import kotlinx.android.synthetic.main.activity_produk.*
import kotlinx.android.synthetic.main.activity_produk.btn_kembali
import kotlinx.android.synthetic.main.activity_produk.nama_produk
import kotlinx.android.synthetic.main.activity_produk_parcel.*
import kotlinx.android.synthetic.main.activity_produk.deskripsi_produk as deskripsi_produk1
import kotlinx.android.synthetic.main.activity_produk.harga_produk as harga_produk1

class ProdukParcel : AppCompatActivity() {
    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk_parcel)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User
        nama_produk.text = user.Nama
        harga_produk.text = user.Harga

        btn_kembali.setOnClickListener {
            val kembali = Intent(this@ProdukParcel, MainActivity::class.java)
            startActivity(kembali)
        }
    }
}