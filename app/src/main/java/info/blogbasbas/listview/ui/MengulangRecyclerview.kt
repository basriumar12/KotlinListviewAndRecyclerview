package info.blogbasbas.listview.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import info.blogbasbas.listview.R
import info.blogbasbas.listview.adapter.AdapterData
import info.blogbasbas.listview.adapter.AdapterDataMengulang
import kotlinx.android.synthetic.main.activity_mengulang_recyclerview.*

class MengulangRecyclerview : AppCompatActivity() {
            var dataNama = arrayOf("Gambar logo",
                    "gambar Monas",
                    "Gambar Hp",
                    "Gambar Kotlin",
                    "gambar android",
                    "Gambar Orang"
                                        )

            var gambar = arrayOf(R.drawable.monas,
                    R.drawable.monas,
                    R.drawable.hp,
                    R.drawable.kotlin,
                    R.drawable.android,
                    R.drawable.orang)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mengulang_recyclerview)

        //buat objek dari adapter
        var adapterData = AdapterDataMengulang(dataNama, gambar, this)
        //objk dari layout
        var layout = LinearLayoutManager(this)

        //utk inisialisasi layout recyclerview
        rv_mengulang_recyclerview.layoutManager = layout
        //set adapter recylerview
        rv_mengulang_recyclerview.adapter = adapterData
    }
}
