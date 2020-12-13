package com.ridhaannisa.tokoica.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    val Nama: String,
    val Harga: String,
) : Parcelable