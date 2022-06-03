package com.example.`Davaleba/6`

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var email : EditText
    private lateinit var password : EditText
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        email = findViewById(R.id.editTextEmail)
        password = findViewById(R.id.editTextPassword)
        button = findViewById(R.id.buttonLogin)

        button.setOnClickListener {

            val email = email.text.toString()
            val password = password.text.toString()

            if (email.isEmpty() || password.isEmpty()){
                Toast.makeText(this,"sheavse", Toast.LENGTH_SHORT).show()
            }

            else {
        }

        }

    }

}
