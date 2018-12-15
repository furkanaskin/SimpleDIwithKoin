package com.faskn.simplediwithkoin

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.inject

@SuppressLint("Registered")
open class BaseActivity:AppCompatActivity(){

    val carFactory :CarFactory by inject()


}