package roni.putra.materipraktek

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterGaleri()
    : RecyclerView.Adapter<AdapterGaleri.ViewAdapter>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterGaleri.ViewAdapter {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.list_item_galeri,parent,false)
        return ViewAdapter(view)
    }

    override fun onBindViewHolder(holder: AdapterGaleri.ViewAdapter, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ViewAdapter(view: View): RecyclerView.ViewHolder(view) {
        val tvNama= view.findViewById<TextView>(R.id.tvNama)
    }

}