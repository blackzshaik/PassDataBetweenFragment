package com.madtutorialz.fragmetdataexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class ProductListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_product_list, container, false)

        val buttonMeat = rootView.findViewById<Button>(R.id.p1)
        val buttonRice = rootView.findViewById<Button>(R.id.p2)
        val buttonBread = rootView.findViewById<Button>(R.id.p3)
        val buttonMilk = rootView.findViewById<Button>(R.id.p4)
        val buttonEggs = rootView.findViewById<Button>(R.id.p5)


        buttonMeat.setOnClickListener{
            val fm = fragmentManager
            fm!!.beginTransaction()
                .replace(R.id.fragmentContainer,
                    ProductDetailFragment.newInstance(getString(R.string.p1),getString(R.string.p1_details))
                    ,"ProductDetail").addToBackStack(null).commit()
        }

        buttonRice.setOnClickListener{

            val fm = fragmentManager
            fm!!.beginTransaction()
                .replace(R.id.fragmentContainer,
                    ProductDetailFragment.newInstance(getString(R.string.p2),getString(R.string.p2_details))
                    ,"ProductDetail").addToBackStack(null).commit()
        }

        buttonBread.setOnClickListener {
            val fm = fragmentManager
            fm!!.beginTransaction()
                .replace(R.id.fragmentContainer,
                    ProductDetailFragment.newInstance(getString(R.string.p3),getString(R.string.p3_details))
                    ,"ProductDetail").addToBackStack(null).commit()
        }

        buttonMilk.setOnClickListener {
            val fm = fragmentManager
            fm!!.beginTransaction()
                .replace(R.id.fragmentContainer,
                    ProductDetailFragment.newInstance(getString(R.string.p4),getString(R.string.p4_details))
                    ,"ProductDetail").addToBackStack(null).commit()
        }

        buttonEggs.setOnClickListener {
            val fm = fragmentManager
            fm!!.beginTransaction()
                .replace(R.id.fragmentContainer,
                    ProductDetailFragment.newInstance(getString(R.string.p5),getString(R.string.p5_details))
                    ,"ProductDetail").addToBackStack(null).commit()
        }



        return rootView
    }

}