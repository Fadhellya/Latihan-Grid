package com.fadhel.gridmuhamadfadhel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter (private val gridListMobil : List<GridModel>,
                   private val context : Context) : BaseAdapter(){

    private  var layoutInflater: LayoutInflater?=null
    private lateinit var name:TextView
    private lateinit var image:ImageView
    private lateinit var price:TextView
    private lateinit var toko : TextView


    override fun getCount(): Int {
        return gridListMobil.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
       var view = p1
        if(layoutInflater==null ){
            layoutInflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if(view ==null){
            view= layoutInflater!!.inflate(R.layout.grid_mobile,null)
        }
        price = view!!.findViewById(R.id.mobilprice)
        toko = view!!.findViewById(R.id.tokomobil)
        name = view!!.findViewById(R.id.mobilname)
        image = view!!.findViewById(R.id.mobileimage)
        image.setImageResource(gridListMobil.get(p0).image)
        name.setText(gridListMobil.get(p0).name)
        price.setText(gridListMobil.get(p0).price)
        toko.setText(gridListMobil.get(p0).toko)

        return view
    }
}