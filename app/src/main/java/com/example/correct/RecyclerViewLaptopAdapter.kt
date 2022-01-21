package com.example.correct

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class RecyclerViewLaptopAdapter(private val list: List<Laptop>): RecyclerView.Adapter<RecyclerViewLaptopAdapter.LaptopViewHolder>(){
    class LaptopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){



        val imageView1: ImageView
        val textView1: TextView
        val textView2: TextView
        val tv5:TextView
        val tv6: TextView
        val tv7: TextView
        val tv8: TextView
        val tv9: TextView
        val tv10: TextView




        init{
            imageView1 = itemView.findViewById(R.id.imageView10)
            textView1 = itemView.findViewById(R.id.textView1)
            textView2 = itemView.findViewById(R.id.textView2)
            tv5 = itemView.findViewById(R.id.tv5)
            tv6 = itemView.findViewById(R.id.tv6)
            tv7 = itemView.findViewById(R.id.tv7)
            tv8 = itemView.findViewById(R.id.tv8)
            tv9 = itemView.findViewById(R.id.tv9)
            tv10 = itemView.findViewById(R.id.tv10)









        }


        fun setData(laptop: Laptop){
            Glide.with(itemView).load(laptop.imageUrl).into(imageView1)
            textView1.text = laptop.price
            textView2.text = laptop.name
            tv5.text = laptop.ram
            tv6.text = laptop.core
            tv7.text = laptop.memory
            tv8.text = laptop.brand
            tv9.text = laptop.storage
            tv10.text = laptop.rdate


        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaptopViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_laptop,parent,false)
        return LaptopViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LaptopViewHolder, position: Int) {
        var laptop = list[position]
        holder.setData(laptop)
    }

    override fun getItemCount() = list.size


}