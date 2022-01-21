package com.example.correct

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth

class LoginFragment: Fragment(R.layout.login_fragment) {

    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var loginButton: Button
    private lateinit var tv_registration: TextView
    private lateinit var forgotpassword: TextView
    private lateinit var tv_noacc: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = Navigation.findNavController(view)

        init()

        forgotpassword.setOnClickListener(){
            val action = LoginFragmentDirections.actionLoginFragmentToResetPasswordFragment()
            controller.navigate(action)
        }


        tv_registration.setOnClickListener(){
            val action = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
            controller.navigate(action)


        }
        loginButton.setOnClickListener(){

            val email = editEmail.text.toString()
            val password = editPassword.text.toString()

            if (email.isEmpty() || !(email.contains("@")) || !(email.length > 9) || !(email.matches(".*[.].*".toRegex()))){
                editEmail.error = "insert correct email"
                return@setOnClickListener
            }
            else if (password.isEmpty() || !(password.length >= 9)) {

                editPassword.error = "insert password's correct length"
                return@setOnClickListener

            }
            FirebaseAuth.getInstance()
                .signInWithEmailAndPassword(email,password)
                .addOnCompleteListener{task ->
                    if(task.isSuccessful){
                        val Intent = Intent(activity,InsideAppActivity::class.java)
                        startActivity(Intent)

                    }else{
                        Toast.makeText(getActivity(), "problem occured", Toast.LENGTH_SHORT).show()
                    }
                }



        }






    }

    private fun init(){
        editEmail = requireView().findViewById(R.id.editEmail)
        editPassword = requireView().findViewById(R.id.editPassword)
        loginButton = requireView().findViewById(R.id.loginButton)
        forgotpassword  = requireView().findViewById(R.id.forgotpassword)
        tv_registration = requireView().findViewById(R.id.tv_registration)
        tv_noacc = requireView().findViewById(R.id.tv_noacc)
    }

}