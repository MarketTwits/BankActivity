package com.example.bankactivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.View.inflate
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.bankactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var canAddOperation = false
    private var canAddDecimal = true

    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


    }
    fun onClickActivity(view: View) {

        // if (bindingClass.tvPasswod.text.toString() == Constance.Password_Olga) {

            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        // }
    }
    fun onBrowserActivity(view: View){
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/"))
        startActivity(browserIntent)
    }

    fun numberAction(view: View)
    {
        if(view is Button)
        {
            if(view.text == ".")
            {
                if(canAddDecimal)
                    bindingClass.tvPasswod.append(view.text)

                canAddDecimal = false
            }
            else
                bindingClass.tvPasswod.append(view.text)

            canAddOperation = true
        }
    }
    fun tvClear(view: View){
        bindingClass.tvPasswod.text=""
    }



}