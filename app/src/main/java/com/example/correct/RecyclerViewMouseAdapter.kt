package com.example.correct

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerViewMouseAdapter(private val list: List<Mouse>): RecyclerView.Adapter<RecyclerViewMouseAdapter.MouseViewHolder>(){
    class MouseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){



        val imageView10: ImageView
        val tv20: TextView
        val tv21: TextView
        val tv22: TextView
        val tv23: TextView
        val tv26: TextView
        val tv27: TextView





        init{
            imageView10 = itemView.findViewById(R.id.imageView10)
            tv20 = itemView.findViewById(R.id.tv20)
            tv21 = itemView.findViewById(R.id.tv21)
            tv22 = itemView.findViewById(R.id.tv22)
            tv23 = itemView.findViewById(R.id.tv23)
            tv26 = itemView.findViewById(R.id.tv26)
            tv27 = itemView.findViewById(R.id.tv27)









        }


        fun setData1(mouse: Mouse){
            Glide.with(itemView).load(mouse.imageUrl).into(imageView10)
            tv27.text = mouse.price
            tv26.text = mouse.name
            tv20.text = mouse.dpi
            tv21.text = mouse.connectivity
            tv22.text = mouse.name
            tv23.text = mouse.brand


        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MouseViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_mouse,parent,false)
        return MouseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MouseViewHolder, position: Int) {
        var mouse = list[position]
        holder.setData1(mouse)
    }

    override fun getItemCount() = list.size


}