package com.fadhel.gridmuhamadfadhel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var gridView : GridView
    lateinit var gridList : List<GridModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridView=findViewById(R.id.gridView)
        gridList=ArrayList<GridModel>()
        gridList=gridList+GridModel("L1 Biru",R.drawable.mobil1,"Rp.100.000.000","Automotif Impact")
        gridList=gridList+GridModel("Mitsubishi Hitam",R.drawable.mobil2,"Rp.200.000.000","Motor City Workshop")
        gridList=gridList+GridModel("Xpander Coklat",R.drawable.mobil3,"Rp.300.000.000","Auto Force Elite")
        gridList=gridList+GridModel("BMW",R.drawable.mobil4,"Rp.400.000.000","Pistons Up")
        gridList=gridList+GridModel("XL7 Putih",R.drawable.mobil5,"Rp.500.000.000","Auto Total Speed")
        gridList=gridList+GridModel("EURO 4",R.drawable.mobil6,"Rp.600.000.000","Moto Valley")
        gridList=gridList+GridModel("IGNIS",R.drawable.mobil7,"Rp.700.000.000","Automatic Impulse")
        gridList=gridList+GridModel("Alphard Putih",R.drawable.mobil8,"Rp.800.000.000","Great  Automotive")
        gridList=gridList+GridModel("Nisan Putih",R.drawable.mobil9,"Rp.900.000.000","Unlimited Repair Shop")
        gridList=gridList+GridModel("ERTIGA",R.drawable.mobil10,"Rp.1.100.000.000","Auto Gear Shop")

        val gridAdapter=GridAdapter(gridList, this)
        gridView.adapter=gridAdapter
        gridView.onItemClickListener=AdapterView.OnItemClickListener{
            adapterView, view, i, l ->
            Toast.makeText(applicationContext,"Pilihan Mobil Anda : "+gridList[i].name,Toast.LENGTH_LONG).show()
        }
    }
}