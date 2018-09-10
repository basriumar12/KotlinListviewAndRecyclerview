package info.blogbasbas.listview.listview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import info.blogbasbas.listview.R
import kotlinx.android.synthetic.main.activity_list_view.*
import java.util.*

class ListViewActivity : AppCompatActivity() {

            //buat objek array
            var dataArray = arrayOf(1,10,9,20,30,80,100,40)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        Arrays.sort(dataArray)
        //buat objek adapter
        var adapterData = ArrayAdapter(ListViewActivity@this,android.R.layout.simple_list_item_1, dataArray)

        //set adapternya
        lv_data.adapter = adapterData
        lv_data.setOnItemClickListener { adapterView, view, posisi, l ->

            Toast.makeText(this,"Data klik $posisi",Toast.LENGTH_LONG).show()
            //kiirim data pakai intent
            var kirimData = Intent(ListViewActivity@this, Detail::class.java)
            kirimData.putExtra("data",dataArray.get(posisi).toString())
            startActivity(kirimData)


        }



    }
}
