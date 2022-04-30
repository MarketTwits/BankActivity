package com.example.bankactivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.View.inflate
import androidx.appcompat.app.AppCompatActivity
import com.example.bankactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
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