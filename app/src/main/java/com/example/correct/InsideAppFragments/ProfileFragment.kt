package com.example.correct.InsideAppFragments

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.correct.ChangePasswordActivity
import com.example.correct.MainActivity
import com.example.correct.R
import com.example.correct.UserInfo
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.FirebaseDatabaseKtxRegistrar
import com.google.firebase.ktx.Firebase

class ProfileFragment: Fragment(R.layout.profile_fragment) {
    private lateinit var changePasswordButton: Button
    private lateinit var logoutButton: Button
    private lateinit var imageView9: ImageView
    private lateinit var saveBtn: Button
    private lateinit var editPhoto: EditText
    private lateinit var appearName: TextView
    private lateinit var etFirstName: EditText

    private val auth = FirebaseAuth.getInstance()
    private val db = FirebaseDatabase.getInstance().getReference("UserInfo")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        saveInformation()
        db.child(auth.currentUser?.uid!!).addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val userInfo = snapshot.getValue(UserInfo::class.java)?: return
                appearName.text = userInfo.name
                Glide.with(this@ProfileFragment).load(userInfo.photo).placeholder(R.drawable.ic_launcher_foreground).into(imageView9)


            }

            override fun onCancelled(error: DatabaseError) {

            }

        })

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
        imageView9 = requireView().findViewById(R.id.imageView9)
        saveBtn = requireView().findViewById(R.id.saveBtn)
        etFirstName = requireView().findViewById(R.id.etFirstName)
        appearName = requireView().findViewById(R.id.appearName)
        editPhoto = requireView().findViewById(R.id.editPhoto)

    }
    private fun saveInformation(){

        saveBtn.setOnClickListener(){
            var savedName = etFirstName.text.toString()
            var savedPhoto = editPhoto.text.toString()
            val userInfo = UserInfo(savedName,savedPhoto)
            db.child(auth.currentUser?.uid!!).setValue(userInfo)
        }
    }


}