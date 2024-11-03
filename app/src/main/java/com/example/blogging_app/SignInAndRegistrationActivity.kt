package com.example.blogging_app

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.blogging_app.databinding.ActivitySignInAndRegistrationBinding

class SignInAndRegistrationActivity : AppCompatActivity() {
    private val binding:ActivitySignInAndRegistrationBinding by lazy {
        ActivitySignInAndRegistrationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val action = intent.getStringExtra("action")

        if (action == "login"){
            binding.editTextTextEmailAddress.visibility = View.VISIBLE
            binding.editTextTextPassword.visibility = View.VISIBLE
            binding.loginbutton.visibility = View.VISIBLE

            binding.registerbutton.isEnabled = false
            binding.registerbutton.alpha = 0.5f
            binding.cardView.visibility = View.GONE
            binding.editTextText.visibility = View.GONE
            binding.editTextTextEmailAddress2.visibility = View.GONE
            binding.editTextTextPassword2.visibility = View.GONE
            binding.textView3.isEnabled = false
            binding.textView3.alpha = 0.5f

        }else if (action == "register"){
            binding.loginbutton.isEnabled = false
            binding.loginbutton.alpha = 0.5f


        }

    }
}