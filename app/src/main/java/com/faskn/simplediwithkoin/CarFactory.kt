package com.faskn.simplediwithkoin

import android.content.Context
import android.widget.Toast



class CarFactory(private val context: Context){

    fun displayToast(){
        Toast.makeText(context,"Araba çalışmaya başladı.",Toast.LENGTH_LONG).show()
    }
}