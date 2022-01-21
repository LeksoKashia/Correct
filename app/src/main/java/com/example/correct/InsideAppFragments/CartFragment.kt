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
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKl9t4jaONDoqoK19p-ALr6sLeZWSbW9esurP1L7P5Po9v1Mn-W-Ob11RWnL1iDqvTkfI&usqp=CAU",
                "Price: $23.50",
                "Ironclaw RGB",
                "DPI: 18,000",
                "Brand: Corsair",
                "Movement: optical",
                "Conectivity: Wireless, Wired"

            )


        )
        mouseList.add(
            Mouse(
                3,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/large_wm_brw/public/field/image/2017/08/steelseries-rival-310-4.jpg?itok=JKzqN3Xx",
                "Price: $69.99",
                "rival 310",
                "DPI: 12,000",
                "Brand: steelseries",
                "Movement: optical",
                "Conectivity: Wireless"

            )


        )
        mouseList.add(
            Mouse(
                4,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRK9f0IRY2i3CCKuANC8LW0CgcSBy9LIe0lzQ&usqp=CAU",
                "Price: $34.99 ",
                " LOGITECH G305 LIGHTSPEED",
                "DPI: 12,000",
                "Brand: LOGITECH",
                "Movement: optical",
                "Conectivity: Wireless"

            )


        )
        mouseList.add(
            Mouse(
                5,
                "https://m.media-amazon.com/images/I/51n+5srvaUL.jpg",
                "Price: $49.99",
                "Razer Basilik Essential",
                "DPI: 18,000",
                "Brand: Razer",
                "Movement: optical",
                "Conectivity: Wired"

            )


        )
        mouseList.add(
            Mouse(
                6,
                "https://static.wixstatic.com/media/f1db3a_cf0b8759f27c43f7a5e0d2e27c8e65e6~mv2.jpg/v1/fill/w_4240,h_2400,al_c,q_85/f1db3a_cf0b8759f27c43f7a5e0d2e27c8e65e6~mv2.jpg",
                "Price: $49.99",
                "HyperX Pulsefire Haste",
                "DPI: 3,200",
                "Brand: HyperX",
                "Movement: optical",
                "Conectivity: Wired"

            )


        )
        mouseList.add(
            Mouse(
                7,
                "https://sm.ign.com/ign_me/screenshot/default/fk-4_mrqe.jpg",
                "Price: $114.00",
                "Zowie FK series",
                "DPI: 6500",
                "Brand: Zowie",
                "Movement: optical",
                "Conectivity: Wired"

            )


        )





        return mouseList

    }


}