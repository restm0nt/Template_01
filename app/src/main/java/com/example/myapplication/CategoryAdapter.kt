package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class CategoryAdapter(private val clist : List<Category>) : RecyclerView.Adapter<CategoryAdapter.MyHolderViewer>() {

    lateinit var myListener : OnItemClickListener

    interface OnItemClickListener{
        fun OnClickListener(position: Int)
    }

    fun OnItemClickListener( listener: OnItemClickListener){
        myListener = listener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolderViewer {
        val MyHolder = LayoutInflater.from(parent.context).inflate(R.layout.activity_category_item, parent, false)
        return MyHolderViewer(MyHolder, myListener)
    }

    override fun getItemCount(): Int {
        return clist.size
    }

    override fun onBindViewHolder(holder: MyHolderViewer, position: Int) {
        val index = clist[position]
        holder.vhimg.setImageResource(index.img)
        holder.vhtxt.text = index.text
    }

    class MyHolderViewer(ItemView: View, myListener: OnItemClickListener) : RecyclerView.ViewHolder(ItemView) {
        val vhimg : ShapeableImageView = ItemView.findViewById(R.id.img)
        val vhtxt : TextView = ItemView.findViewById(R.id.text)
    init {
        itemView.setOnClickListener {
            myListener.OnClickListener(adapterPosition)
        }
    }}
}