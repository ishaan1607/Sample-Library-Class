package com.ishaan.samplelibraryapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.ishaan.samplelibrary.LibraryClass
import com.ishaan.samplelibraryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClick.setOnClickListener {
            LibraryClass.init(this)

            Glide.with(this)
                .load("https://picfiles.alphacoders.com/253/thumb-1920-253859.jpg")
                .centerCrop()
                .into(binding.ivLoad)
        }
    }
}