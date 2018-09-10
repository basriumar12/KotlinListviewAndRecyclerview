package info.blogbasbas.listview.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import info.blogbasbas.listview.R
import info.blogbasbas.listview.adapter.AdapterData
import kotlinx.android.synthetic.main.activity_recyclerview.*

class RecyclerviewActivity : AppCompatActivity() {


    var dataNama = arrayOf("Gambar logo","gambar Monas","Gambar Hp")
    var gambar = arrayOf(R.drawable.monas,
            R.drawable.monas,
            R.drawable.hp)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        var adapterData = AdapterData(dataNama, gambar, this)
        var layout = LinearLayoutManager(this)
        rv_data.layoutManager= layout
        rv_data.adapter = adapterData


    }
}
