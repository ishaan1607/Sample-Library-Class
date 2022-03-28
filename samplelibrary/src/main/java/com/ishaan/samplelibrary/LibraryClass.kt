package com.ishaan.samplelibrary

import android.content.Context
import android.util.Log
import android.widget.Toast

object LibraryClass {

    fun init(context: Context) {
        Log.d("SDK", "init called")
        Toast.makeText(context, "Library init", Toast.LENGTH_LONG).show()
    }

}