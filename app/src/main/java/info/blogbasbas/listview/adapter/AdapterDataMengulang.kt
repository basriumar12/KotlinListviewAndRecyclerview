package info.blogbasbas.listview.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import info.blogbasbas.listview.R
import info.blogbasbas.listview.ui.DetailActivity


/**
 * Created by User on 09/09/2018.
 */
class AdapterDataMengulang : RecyclerView.Adapter<AdapterDataMengulang.MyViewHolder> {


    //objek data array
    var namaGambar : Array<String>? = null
    var gambar : Array<Int>? = null
    var contex : Context? = null


    //constructor
    constructor(namaGambar: Array<String>?, gambar: Array<Int>?, contex: Context?) : super() {
        this.namaGambar = namaGambar
        this.gambar = gambar
        this.contex = contex
    }

    // fungsi method ini utk templating layout
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
       var view : View =LayoutInflater.from(contex).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(view)
    }

    //panjang data pada list recyclerview
    override fun getItemCount(): Int {
        return namaGambar?.size!!

    }
    //set data dilist
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
         holder.tvNama.text = namaGambar?.get(position)
        holder.imgData.setImageResource(gambar?.get(position)!!)

        //event klik
        holder?.itemView?.setOnClickListener {
            //coba pakai toast posisi yang di klik
            Toast.makeText(contex,"posisi $position",Toast.LENGTH_LONG).show()
            //ngrim data dan berpindah activity
            var intent = Intent(contex,DetailActivity::class.java)
            print("test ")
            //kirim data pakai puteextra
            intent.putExtra("NAMA",namaGambar?.get(position))
            intent.putExtra("GMB",gambar?.get(position)!!)

            contex?.startActivity(intent)

        }

    }

    //utk inisialisasi id pada layout yang d templating
    class MyViewHolder(itemview :View): RecyclerView.ViewHolder(itemview)
    {

        var tvNama : TextView = itemview?.findViewById(R.id.tv_nama)
        var imgData : ImageView = itemview?.findViewById(R.id.img_data)
    }
}