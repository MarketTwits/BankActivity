package com.example.bankactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickActivity(view: View)
    {
        val intent = Intent(this, UserProfileActivity::class.java)
        startActivity(intent)

    }
}