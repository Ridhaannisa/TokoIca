package com.ridhaannisa.tokoica

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ridhaannisa.tokoica.Model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val REQUEST_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_profil.setOnClickListener {
            val profil = Intent(this@MainActivity, ProfilActivity::class.java)
            startActivity(profil)
        }

        btn_produk.setOnClickListener {
            val produk = Intent(this@MainActivity, ProdukActivity::class.java)
            produk.putExtra(ProdukActivity.EXTRA_NAMA, "iPhone 12 Pro Max")
            produk.putExtra(ProdukActivity.EXTRA_HARGA, "Rp. 24.590.000 - Rp. 32.690.000")
            startActivity(produk)
        }

        btn_intent_with_parcelable.setOnClickListener {
            val parcelIntent = Intent(this@MainActivity, ProdukParcel::class.java)
            val user = User("iPhone 12 Pro Max","Rp. 24.590.000 - Rp. 32.690.000")
            parcelIntent.putExtra(ProdukParcel.EXTRA_USER, user)
            startActivity(parcelIntent)
        }

        btn_implicit_intent.setOnClickListener {
            val phoneNumber = "0895376962037"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(intent)
        }

        btn_intent_with_result.setOnClickListener {
            val resultIntent = Intent(this@MainActivity, ResultActivity::class.java)
            startActivityForResult(resultIntent, REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == 200){
            val color = data?.getStringExtra(ResultActivity.EXTRA_COLOR)
            Log.d("Color", color.toString())
            view_bg.setBackgroundColor(Color.parseColor(color.toString()))
        }
    }
}