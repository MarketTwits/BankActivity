package com.example.bankactivity

import android.R
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.example.bankactivity.databinding.ActivityBrowserBinding


class Browser_Activity : AppCompatActivity() {
    lateinit var bindingClass : ActivityBrowserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityBrowserBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val myWebView = bindingClass.wbView as WebView
        myWebView.loadUrl("https://developer.android.com")



    }

}