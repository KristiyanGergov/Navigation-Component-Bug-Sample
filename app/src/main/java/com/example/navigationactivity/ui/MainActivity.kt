package com.example.navigationactivity.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationactivity.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()

        val frag = supportFragmentManager.fragmentFactory.instantiate(applicationContext!!.classLoader, "com.example.navigationactivity.ui.FirstFragment")

        transaction.replace(R.id.container, frag)
        transaction.commit()
    }
}
