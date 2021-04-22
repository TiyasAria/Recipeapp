package com.idn.smart.tiyas.recipeapp.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.idn.smart.tiyas.recipeapp.R
import com.idn.smart.tiyas.recipeapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var  signUpBinding: ActivitySignUpBinding
    companion object{
        fun getLaunchService (from: Context) = Intent(from, SignUpActivity::class.java).apply{
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        signUpBinding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(signUpBinding.root)
        supportActionBar?.hide()
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}