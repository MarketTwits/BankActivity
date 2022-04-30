package com.example.bankactivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

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
    fun onBrowserActivity(view: View){
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/"))
        startActivity(browserIntent)
    }
}