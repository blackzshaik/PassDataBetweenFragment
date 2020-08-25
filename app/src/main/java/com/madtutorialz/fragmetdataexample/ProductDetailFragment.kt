package com.madtutorialz.fragmetdataexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


private const val HEADING = "param1"
private const val DESCRIPTION = "param2"

class ProductDetailFragment : Fragment() {

    private var headingText: String? = null
    private var descriptionText: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            headingText = it.getString(HEADING)
            descriptionText = it.getString(DESCRIPTION)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_product_detail, container, false)
        rootView.findViewById<TextView>(R.id.heading).text = headingText
        rootView.findViewById<TextView>(R.id.description).text = descriptionText

        return rootView
    }

    companion object {
        @JvmStatic
        fun newInstance(heading: String, description: String) =
            ProductDetailFragment().apply {
                arguments =  Bundle().apply {
                    putString(HEADING, heading)
                    putString(DESCRIPTION, description)
                }
            }
    }
}