package com.idn.smart.tiyas.recipeapp.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.idn.smart.tiyas.recipeapp.R
import com.idn.smart.tiyas.recipeapp.databinding.ActivityForgetPasswordBinding

class ForgetPasswordActivity : AppCompatActivity() {

 private lateinit var  forgetPasswordBinding: ActivityForgetPasswordBinding

 companion object{
     fun getLaunchService (from: Context) = Intent(from, ForgetPasswordActivity::class.java).apply {
         addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
     }
 }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        forgetPasswordBinding = ActivityForgetPasswordBinding.inflate(layoutInflater)
        setContentView(forgetPasswordBinding.root)
        supportActionBar?.hide()
    }
}