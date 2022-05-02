package com.example.bankactivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.View.inflate
import androidx.appcompat.app.AppCompatActivity
import com.example.bankactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val myArray = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "0")
    val arr = arrayOfNulls<String>(5)

    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.tvPasswod.text = myArray[0].toString()

        for (i in 1 until myArray.size){
            bindingClass.tvPasswod.append(myArray[i].toString())
            bindingClass.tvPasswod.text = myArray.joinToString(separator = " ")
        }
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