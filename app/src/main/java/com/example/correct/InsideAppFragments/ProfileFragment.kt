package com.example.correct.InsideAppFragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.correct.ChangePasswordActivity
import com.example.correct.MainActivity
import com.example.correct.R

class ProfileFragment: Fragment(R.layout.profile_fragment) {
    private lateinit var changePasswordButton: Button
    private lateinit var logoutButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()

        logoutButton.setOnClickListener(){
            val Intent = Intent(activity, MainActivity::class.java)
            startActivity(Intent)

        }
        changePasswordButton.setOnClickListener(){
            val Intent = Intent(activity, ChangePasswordActivity::class.java)
            startActivity(Intent)

        }
    }




    private fun init() {
        changePasswordButton = requireView().findViewById(R.id.changePasswordButton)
        logoutButton = requireView().findViewById(R.id.logoutButton)
    }


}