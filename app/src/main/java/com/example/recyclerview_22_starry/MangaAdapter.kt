package com.example.recyclerview_22_starry

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MangaAdapter(private val context: Context, private val manga: List<Manga>, val listener: (Manga) -> Unit)
    : RecyclerView.Adapter<MangaAdapter.MangaViewHolder>(){
    class MangaViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgManga = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameManga = view.findViewById<TextView>(R.id.tv_item_name)
        val descManga = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(manga: Manga, listener: (Manga) -> Unit) {
            imgManga.setImageResource(manga.imgManga)
            nameManga.text = manga.nameManga
            descManga.text = manga.descManga

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaViewHolder {
        return MangaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_manga, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MangaViewHolder, position: Int) {
        holder.bindView(manga[position], listener)
    }

    override fun getItemCount(): Int = manga.size
    }