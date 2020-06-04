package com.phis.fragment_practice_20200604

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import com.phis.fragment_practice_20200604.adapters.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_my_view_pager.*

class MyViewPagerActivity : BaseActivity() {

    lateinit var myPagerAdapter: FragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_view_pager)

        setValues()

    }

    override fun setValues() {
        myPagerAdapter = MyPagerAdapter(supportFragmentManager)
        myViewPager.adapter = myPagerAdapter
    }

    override fun setEvents() {

    }

}
