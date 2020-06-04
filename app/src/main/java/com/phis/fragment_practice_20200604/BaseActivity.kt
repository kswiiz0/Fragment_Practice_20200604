package com.phis.fragment_practice_20200604

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setValues()
    abstract fun setEvents()

}