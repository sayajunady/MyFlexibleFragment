package com.sayajunady.myflexiblefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentSatu = FragmentSatu()
        val fragment:Fragment? = supportFragmentManager.findFragmentByTag(fragmentSatu::class.java.simpleName)

        if(fragment !is FragmentSatu){
            supportFragmentManager.beginTransaction()
                .add(R.id.frame_container, fragmentSatu, FragmentSatu::class.java.simpleName)
                .commit()
        }
    }
}