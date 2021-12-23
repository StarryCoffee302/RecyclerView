package com.example.recyclerview_22_starry

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Manga(
    val imgManga: Int,
    val nameManga: String,
    val descManga: String,
) : Parcelable