package com.example.bankactivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import com.example.bankactivity.databinding.ActivityUserProfileBinding

class UserProfileActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityUserProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityUserProfileBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
    fun onRadioButtonClickedLeft(view: View) {
        if (bindingClass.rb1.isChecked) {
            bindingClass.rb2.isChecked = false
        }
    }
    fun onRadioButtonClickedRight(view: View){
        if (bindingClass.rb2.isChecked) {
            bindingClass.rb1.isChecked = false
        }
    }
    fun onClickActivityBrowser(view: View)
    {
        val intent = Intent(this, Browser_Activity::class.java)
        startActivity(intent)
    }
    }
