package com.example.correct.InsideAppFragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.correct.R
import com.example.correct.RecyclerViewLaptopAdapter
import com.example.correct.Laptop

class HomeFragment: Fragment(R.layout.home_fragment) {
    private lateinit var recyclerViewLaptopAdapter: RecyclerViewLaptopAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerViewLaptopAdapter = RecyclerViewLaptopAdapter(getData())
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = recyclerViewLaptopAdapter






    }
    private fun getData(): List<Laptop>{
        val laptopList =  arrayListOf<Laptop>()
        laptopList.add(
            Laptop(
                1,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/large_wm_brb/public/field/image/2021/01/hp-spectre-x360-14-hero3.jpg",
                "Price: $2,699",
                "HP Spectre x360 14",
                "RAM: 16GB",
                "Core: I7",
                "Memory: 8GB",
                "Brand: HP",
                "Storage: 512GB",
                "Rdate: 2021"
            )


        )
        laptopList.add(
            Laptop(
                2,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/large_wm_brb/public/field/image/2020/12/razer-book-13-2020-1.jpg",
                "Price: $1,399",
                "Razer Book 13",
                "RAM: 16GB",
                "Core: I7",
                "Memory: 8GB",
                "Brand: HP",
                "Storage: 512GB",
                "Rdate: 2021"
            )


        )
        laptopList.add(
            Laptop(
                3,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/large_wm_brb/public/field/image/2020/04/dell-xps-13-9300-hero2.jpg",
                "Price: $2,400",
                "Dell XPS 13 (9310)",
                "RAM: 16GB",
                "Core: I7",
                "Memory: 8GB",
                "Brand: HP",
                "Storage: 512GB",
                "Rdate: 2021"

            )


        )
        laptopList.add(
            Laptop(
                4,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/large_wm_brw/public/field/image/2021/04/surface-laptop-4-amd-2021-hero.jpg",
                "Price: $1,282",
                "Surface Laptop 4",
                "RAM: 16GB",
                "Core: I7",
                "Memory: 8GB",
                "Brand: HP",
                "Storage: 512GB",
                "Rdate: 2021"
            )


        )
        laptopList.add(
            Laptop(
                5,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/large_wm_brb/public/field/image/2021/07/lenovo-thinkpad-x1-nano-hero.jpg",
                "Price: $1,700",
                "Lenovo ThinkPad X1 Nano",
                "RAM: 16GB",
                "Core: I7",
                "Memory: 8GB",
                "Brand: HP",
                "Storage: 512GB",
                "Rdate: 2021"
            )


        )
        laptopList.add(
            Laptop(
                6,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/large_wm_brb/public/field/image/2020/10/surface-laptop-go-hero3-logo.jpg",
                "Price: $619",
                "Microsoft Surface Laptop Go",
                "RAM: 16GB",
                "Core: I7",
                "Memory: 8GB",
                "Brand: HP",
                "Storage: 512GB",
                "Rdate: 2021"
            )


        )
        laptopList.add(
            Laptop(
                7,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/large_wm_brw/public/field/image/2021/03/lg-gram-17-2021-hero.jpg",
                "Price: $1,595",
                "LG gram 17",
                "RAM: 16GB",
                "Core: I7",
                "Memory: 8GB",
                "Brand: HP",
                "Storage: 512GB",
                "Rdate: 2021"
            )


        )



        return laptopList

    }


}