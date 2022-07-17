package com.task.ui.component.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.task.databinding.HomeFragmentBinding
import com.task.utils.clickutils.LibClickAnimUtils
import com.task.utils.clickutils.OnCustomClickListener

/**
 * Created by TruyenDev on 14/07/2022.
 */
class HomeFragment : Fragment() {
    private lateinit var binding: HomeFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = HomeFragmentBinding.inflate(inflater, container,false)
        return binding.root
    }
    /**
     *
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    /**
     *
     */
    private fun onClick() {
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutRegisterVas, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutTransfers, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutHistory, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })


    }
}