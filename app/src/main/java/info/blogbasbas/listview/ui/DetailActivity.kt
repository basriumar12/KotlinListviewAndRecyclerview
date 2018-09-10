package info.blogbasbas.listview.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import info.blogbasbas.listview.R
import kotlinx.android.synthetic.main.activity_detail2.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)

        //objek utk tangkap data
        var tangkapData = intent
        tv_nama_detail.text = tangkapData?.getStringExtra("NAMA")

        var tangkapGambar = intent.getIntExtra("GMB",2)
        img_detail_gambar.setImageResource(tangkapGambar)

    }
}
