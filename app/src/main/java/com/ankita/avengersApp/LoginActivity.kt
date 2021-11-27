package com.ankita.avengersApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var etMobileNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var txtForgotPasswored: TextView
    lateinit var txtRegister: TextView
    val validMobileNumber = "0123456789"
    val validPassword = arrayOf("tony", "steve", "bruce", "thanos")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        title = "Log In"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtRegister = findViewById(R.id.txtRegister)
        txtForgotPasswored = findViewById(R.id.txtForgotPassword)

        btnLogin.setOnClickListener {

            val mobileNumber = etMobileNumber.text.toString()
            val password = etPassword.text.toString()

            var nameOfAvenger = "Avenger"
            val intent = Intent(this@LoginActivity, MainActivity::class.java)

            if (mobileNumber == validMobileNumber) {
                if (password == validPassword[0]) {

                    nameOfAvenger = "Iron Man"
                    intent.putExtra("Name", nameOfAvenger)
                    startActivity(intent)

                } else if (password == validPassword[1]) {

                    nameOfAvenger = "Captain America"
                    intent.putExtra("Name", nameOfAvenger)
                    startActivity(intent)

                } else if (password == validPassword[2]) {

                    nameOfAvenger = "The Hulk"
                    intent.putExtra("Name", nameOfAvenger)
                    startActivity(intent)

                } else if (password == validPassword[3]) {

                    nameOfAvenger = "The Avengers"
                    intent.putExtra("Name", nameOfAvenger)
                    startActivity(intent)

                }

            } else {
                Toast.makeText(
                    this@LoginActivity,
                    "Incorrect Credentials",
                    Toast.LENGTH_LONG
                ).show()
            }

        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}

