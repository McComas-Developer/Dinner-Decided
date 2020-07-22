package com.example.dinnerdecider.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.NavHostFragment
import com.example.dinnerdecider.R

class StartFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val v :View = inflater.inflate(R.layout.fragment_start, container, false)
        val btnCategories: Button? = v.findViewById(R.id.btn_byCategories)
        val btnCustom: Button? = v.findViewById(R.id.btn_byCustom)
        val btnSettings: ImageButton? = v.findViewById(R.id.btn_settings)

        btnCategories!!.setOnClickListener{
            NavHostFragment.findNavController(this)
                .navigate(R.id.action_startFragment_to_chooseCategories)
        }
        btnCustom!!.setOnClickListener{
            NavHostFragment.findNavController(this)
                .navigate(R.id.action_startFragment_to_customCategories)
        }
        btnSettings!!.setOnClickListener {
            NavHostFragment.findNavController(this)
                .navigate(R.id.action_startFragment_to_settings)
        }
        return v
    }
}