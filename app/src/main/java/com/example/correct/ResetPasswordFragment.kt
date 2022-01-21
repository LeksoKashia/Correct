package com.example.correct

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth

class ResetPasswordFragment:Fragment(R.layout.reset_password_fragment) {
    private lateinit var editEmail3: EditText
    private lateinit var sendEmailButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = Navigation.findNavController(view)

        init()
        sendEmailButton.setOnClickListener() {
            val email = editEmail3.text.toString()
            if (email.isEmpty() || !(email.contains("@")) || !(email.length > 9) || !(email.matches(".*[.].*".toRegex()))){




                editEmail3.error = "insert correct email"
                return@setOnClickListener
            }
            FirebaseAuth.getInstance().sendPasswordResetEmail(email)
                .addOnCompleteListener() { task ->
                    if (task.isSuccessful) {
                        val action = ResetPasswordFragmentDirections.actionResetPasswordFragmentToLoginFragment()
                        controller.navigate(action)

                        Toast.makeText(getActivity(), "good job", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(getActivity(), "Problem!", Toast.LENGTH_SHORT).show()

                    }
                }
        }


    }

    private fun init() {
        editEmail3 = requireView().findViewById(R.id.editEmail3)
        sendEmailButton = requireView().findViewById(R.id.sendEmailButton)
    }



}