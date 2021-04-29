package com.idn.smart.tiyas.recipeapp.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.idn.smart.tiyas.recipeapp.R
import com.idn.smart.tiyas.recipeapp.databinding.ActivityForgetPasswordBinding

class ForgetPasswordActivity : AppCompatActivity(), View.OnClickListener{

 private lateinit var  forgetPasswordBinding: ActivityForgetPasswordBinding
 private lateinit var mAuth : FirebaseAuth


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
        mAuth = FirebaseAuth.getInstance()
        forgetPasswordBinding.btnForget.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_forget -> forgotPassword()
        }

    }

    private fun forgotPassword(){
        val email = forgetPasswordBinding.etEmailForgot.text.toString()
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, getString(R.string.not_empty), Toast.LENGTH_SHORT).show()
        }else{
            mAuth.sendPasswordResetEmail(email).addOnCompleteListener {
                if(it.isSuccessful) {
                    Toast.makeText(this, "check email", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(SignInActivity.getLaunchService(this)))
                }else{
                    Toast.makeText(this, "Failed reset pass", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}