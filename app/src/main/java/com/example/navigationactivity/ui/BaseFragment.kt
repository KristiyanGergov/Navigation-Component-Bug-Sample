package com.example.navigationactivity.ui

import androidx.fragment.app.Fragment
import com.example.navigationactivity.R

open class BaseFragment : Fragment() {


    fun instantiateFragment(className: String) {

        val fragment = fragmentManager!!.fragmentFactory.instantiate(
            context!!.classLoader,
            "com.example.navigationactivity.ui.".plus(className)
        )

        val transaction = fragmentManager!!.beginTransaction()

        transaction.replace(R.id.container, fragment)
        transaction.setReorderingAllowed(true)
        transaction.commit()
    }
}