package com.cegonheiros.senccegonheiros.UIs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cegonheiros.senccegonheiros.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button_entrar.setOnClickListener{
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }
}