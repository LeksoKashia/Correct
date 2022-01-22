package com.example.correct

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import java.util.*

class RegisterFragment: Fragment(R.layout.register_fragment) {
    private lateinit var editEmail2: EditText
    private lateinit var firstPassword: EditText
    private lateinit var secondPassword: EditText
    private lateinit var registerrationButton2: Button
    private lateinit var ed_username: EditText
    private lateinit var tv0: TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = Navigation.findNavController(view)


        init()

        registerrationButton2.setOnClickListener() {
            val firstpass = firstPassword.text.toString()
            val secondpass = secondPassword.text.toString()
            val maill = editEmail2.text.toString()
            val username = ed_username.text.toString()







            if (maill.isEmpty() || !(maill.contains("@")) || !(maill.length >9 ) ||  !(maill.matches(".*[.].*".toRegex()))) {


                editEmail2.error = "insert correct email"
                return@setOnClickListener
            } else if (firstpass.isEmpty() || !(firstpass.length >= 9)) {

                firstPassword.error = "insert password's correct length"
                return@setOnClickListener

            } else if (secondpass != firstpass) {
                secondPassword.error = "password must be identical"
                return@setOnClickListener
            } else if (!(firstpass.matches(".*[!@#$%^&*()?><`~].*".toRegex()))) {
                firstPassword.error = "password must consist of special symbols"
                return@setOnClickListener
            } else if (username.isEmpty() || !(username.length < 8) ) {
                ed_username.error = "password must consist of numbers"
                return@setOnClickListener
            }
            else if (!(firstpass.matches(".*[0-9].*".toRegex()))) {
                firstPassword.error = "password must consist of numbers"
                return@setOnClickListener
            }
            FirebaseAuth.getInstance()
                .createUserWithEmailAndPassword(maill,firstpass)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val action = RegisterFragmentDirections.actionRegisterFragmentToLoginFragment()
                        controller.navigate(action)

                        Toast.makeText(getActivity(),"good job", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(getActivity(), "problem occured", Toast.LENGTH_SHORT).show()
                    }


                }


        }


    }



    private fun init() {
        editEmail2 = requireView().findViewById(R.id.editEmail2)
        firstPassword = requireView().findViewById(R.id.firstPassword)
        secondPassword = requireView().findViewById(R.id.secondPassword)
        registerrationButton2 = requireView().findViewById(R.id.registerrationButton2)
        ed_username = requireView().findViewById(R.id.ed_username)

    }





}