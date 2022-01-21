package com.example.correct

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class StartingPointFragment: Fragment(R.layout.starting_point_fragment) {
    private lateinit var tv_click : TextView
    private lateinit var tv_welcome : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val controller = Navigation.findNavController(view)

        tv_click = view.findViewById(R.id.tv_click)
        tv_welcome = view.findViewById(R.id.tv_welcome)

        tv_click.setOnClickListener(){
            val action = StartingPointFragmentDirections.actionStartingPointFragmentToLoginFragment()
            controller.navigate(action)
        }


    }

}