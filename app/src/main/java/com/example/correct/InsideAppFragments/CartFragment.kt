package com.example.correct.InsideAppFragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.correct.*

class CartFragment:Fragment(R.layout.cart_fragment) {
    private lateinit var recyclerViewMouseAdapter: RecyclerViewMouseAdapter
    private lateinit var recyclerView1: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView1 = view.findViewById(R.id.recyclerView1)
        recyclerViewMouseAdapter = RecyclerViewMouseAdapter(getData1())
        recyclerView1.layoutManager = LinearLayoutManager(requireContext())
        recyclerView1.adapter = recyclerViewMouseAdapter

    }
    private fun getData1(): List<Mouse>{
        val mouseList =  arrayListOf<Mouse>()
        mouseList.add(
            Mouse(
                1,
                "https://onlinegaminggear.com/wp-content/uploads/2017/11/design-for-game.jpg",
                "Price: $23.50",
                "Razer DeathAdder",
                "DPI: 6500",
                "Brand: Razer",
                "Movement: optical",
                "Conectivity: Optical"

            )


        )
        mouseList.add(
            Mouse(
                2,
                "https://onlinegaminggear.com/wp-content/uploads/2017/11/design-for-game.jpg",
                "Price: $23.50",
                "Razer DeathAdder",
                "DPI: 6500",
                "Brand: Razer",
                "Movement: optical",
                "Conectivity: Optical"

            )


        )
        mouseList.add(
            Mouse(
                3,
                "https://onlinegaminggear.com/wp-content/uploads/2017/11/design-for-game.jpg",
                "Price: $23.50",
                "Razer DeathAdder",
                "DPI: 6500",
                "Brand: Razer",
                "Movement: optical",
                "Conectivity: Optical"

            )


        )
        mouseList.add(
            Mouse(
                4,
                "https://onlinegaminggear.com/wp-content/uploads/2017/11/design-for-game.jpg",
                "Price: $23.50",
                "Razer DeathAdder",
                "DPI: 6500",
                "Brand: Razer",
                "Movement: optical",
                "Conectivity: Optical"

            )


        )
        mouseList.add(
            Mouse(
                5,
                "https://onlinegaminggear.com/wp-content/uploads/2017/11/design-for-game.jpg",
                "Price: $23.50",
                "Razer DeathAdder",
                "DPI: 6500",
                "Brand: Razer",
                "Movement: optical",
                "Conectivity: Optical"

            )


        )







        return mouseList

    }


}