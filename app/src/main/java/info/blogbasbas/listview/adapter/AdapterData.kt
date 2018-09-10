package info.blogbasbas.listview.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import info.blogbasbas.listview.R


/**
 * Created by User on 09/09/2018.
 */
class AdapterData : RecyclerView.Adapter<AdapterData.MyViewHolder> {

    var namaGambar : Array<String>? = null
    var gambar : Array<Int>? = null
    var contex : Context? = null

    constructor(namaGambar: Array<String>?, gambar: Array<Int>?, contex: Context?) : super() {
        this.namaGambar = namaGambar
        this.gambar = gambar
        this.contex = contex
    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
       var view : View =LayoutInflater.from(contex).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return namaGambar?.size!!

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
         holder.tvNama.text = namaGambar?.get(position)
        holder.imgData.setImageResource(gambar?.get(position)!!)

    }

    class MyViewHolder(itemview :View): RecyclerView.ViewHolder(itemview)
    {

        var tvNama : TextView = itemview?.findViewById(R.id.tv_nama)
        var imgData : ImageView = itemview?.findViewById(R.id.img_data)
    }
}