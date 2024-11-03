package com.example.blogging_app.register

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.blogging_app.SignInAndRegistrationActivity
import com.example.blogging_app.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private val binding:ActivityWelcomeBinding by lazy {
        ActivityWelcomeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.loginbutton.setOnClickListener {
            val intent = Intent(this,SignInAndRegistrationActivity::class.java)
            intent.putExtra("action" , "login")
            startActivity(intent)
        }

        binding.registerbutton.setOnClickListener {
            val intent = Intent(this,SignInAndRegistrationActivity::class.java)
            intent.putExtra("action" , "register")
            startActivity(intent)
        }


    }

}