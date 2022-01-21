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
                "Memory: 16GB",
                "Brand: Razer",
                "Storage: 512GB",
                "Rdate: 2020"
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
                "Memory: 32GB",
                "Brand: Dell",
                "Storage: 2TB",
                "Rdate: 2019"

            )


        )
        laptopList.add(
            Laptop(
                4,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/large_wm_brw/public/field/image/2021/04/surface-laptop-4-amd-2021-hero.jpg",
                "Price: $1,282",
                "Surface Laptop 4",
                "RAM: 8GB",
                "Core: I7",
                "Memory: 32GB",
                "Brand: Surface",
                "Storage: 1TB",
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
                "Core: I5",
                "Memory: 16GB",
                "Brand: Lenovo",
                "Storage: 256GB",
                "Rdate: 2022"
            )


        )
        laptopList.add(
            Laptop(
                6,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/large_wm_brb/public/field/image/2020/10/surface-laptop-go-hero3-logo.jpg",
                "Price: $619",
                "Microsoft Surface Laptop Go",
                "RAM: 8GB",
                "Core: I5",
                "Memory: 8GB",
                "Brand: Microsoft",
                "Storage: 1TB",
                "Rdate: 2020"
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
                "Memory: 16GB",
                "Brand: LG",
                "Storage: 1TB",
                "Rdate: 2021"
            )


        )
        laptopList.add(
            Laptop(
                8,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/xlarge/public/field/image/2020/10/hp-spectre-x360-14-press-1.jpg",
                "Price: $1,595",
                "HP Envy x360",
                "RAM: 16GB",
                "Core: I7",
                "Memory: 16GB",
                "Brand: HP",
                "Storage: 256GB",
                "Rdate: 2021"
            )


        )
        laptopList.add(
            Laptop(
                9,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/large_wm_brw/public/field/image/2019/09/xps-13-2in1-7390-1.jpg",
                "Price: $1,146",
                "Dell XPS 13",
                "RAM: 16GB",
                "Core: I7",
                "Memory: 32GB",
                "Brand: Dell",
                "Storage: 512GB",
                "Rdate: 2020"
            )


        )
        laptopList.add(
            Laptop(
                10,
                "https://wonderfulengineering.com/wp-content/uploads/2016/08/the-lg-gram-looks-better-than-the-macbook-air-768x384.jpg",
                "Price: $1,249",
                "The LG Gram",
                "RAM: 16GB",
                "Core: I5",
                "Memory: 8GB",
                "Brand: LG",
                "Storage: 1TB",
                "Rdate: 2022"
            )


        )
        laptopList.add(
            Laptop(
                11,
                "https://cdn.mos.cms.futurecdn.net/aZjmFcauafwCJw4NzgGEig.jpg",
                "Price: $379.99",
                "Asus VivoBook 15",
                "RAM: 16GB",
                "Core: I7",
                "Memory: 8GB",
                "Brand: Asus",
                "Storage: 512GB",
                "Rdate: 2021"
            )


        )
        laptopList.add(
            Laptop(
                12,
                "https://www.windowscentral.com/sites/wpcentral.com/files/styles/large_wm_brb/public/field/image/2021/08/hp-pavilion-aero-13-hero2.jpg",
                "Price: $749",
                "HP Pavilion Aero 13",
                "RAM: 16GB",
                "Core: I7",
                "Memory: 16GB",
                "Brand: HP",
                "Storage: 1TB",
                "Rdate: 2021"
            )


        )



        return laptopList

    }


}