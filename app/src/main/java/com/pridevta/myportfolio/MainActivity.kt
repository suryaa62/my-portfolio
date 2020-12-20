package com.pridevta.myportfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gitButton : FloatingActionButton = findViewById(R.id.github_button)
        gitButton.setOnClickListener { goToGithub() }
        val callButton : FloatingActionButton = findViewById(R.id.call_button)
        callButton.setOnClickListener{ goToPhonecall()}
    }

    private fun goToPhonecall() {
        val uri : Uri = Uri.parse("tel:+917828369492")
        val intent : Intent = Intent(Intent.ACTION_DIAL,uri)
        startActivity(intent)
    }

    private fun goToGithub() {
        val uri : Uri = Uri.parse("https://github.com/suryaa62")
        val intent : Intent = Intent(Intent.ACTION_VIEW,uri)
        startActivity(intent)
    }
}