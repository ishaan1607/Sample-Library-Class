package com.ishaan.samplelibraryapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ishaan.samplelibrary.LibraryClass
import com.ishaan.samplelibraryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClick.setOnClickListener {
            LibraryClass.init(this)
        }
    }
}