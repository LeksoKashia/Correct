package com.example.correct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class ChangePasswordActivity : AppCompatActivity() {
    private lateinit var changePass : EditText
    private lateinit var changePassButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)
        init()
        changePassListeneres()


    }
    private fun init(){
        changePass = findViewById(R.id.changePass)
        changePassButton = findViewById(R.id.changePassButton)
    }
    private fun changePassListeneres(){
        changePassButton.setOnClickListener(){
            val password = changePass.text.toString()
            if(password.isEmpty() || password.length < 6){
                Toast.makeText(this,"insert correct password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            FirebaseAuth.getInstance().currentUser?.updatePassword(password)
                ?.addOnCompleteListener(){ task ->
                    if(task.isSuccessful){
                        startActivity(Intent(this,MainActivity::class.java))
                        Toast.makeText(this,"Success!", Toast.LENGTH_SHORT).show()


                    }else
                        Toast.makeText(this,"Failed!", Toast.LENGTH_SHORT).show()



                }

        }


    }
}