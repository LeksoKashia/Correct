package com.example.correct

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
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

        var login_fragment : LinearLayout = view.findViewById(R.id.loginFragment)

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
                        val customSnackbar = Snackbar.make(login_fragment,"Try Again My Friend!", Snackbar.LENGTH_LONG).setAction("Retry"){}
                        customSnackbar.setBackgroundTint(Color.RED)
                        customSnackbar.setActionTextColor(Color.WHITE)
                        customSnackbar.show()
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