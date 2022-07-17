package com.task.ui.component.manageacount.aftersell

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.task.databinding.AftersellFragmentBinding
import com.task.utils.clickutils.LibClickAnimUtils
import com.task.utils.clickutils.OnCustomClickListener

/**
 * Created by TruyenDev on 17/07/2022.
 */
class AfterSellFragment : Fragment() {
    private lateinit var binding: AftersellFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = AftersellFragmentBinding.inflate(inflater, container, false)
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
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutChangeSim, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutChangeInfo, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutRegisterKM, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutHistory, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutOpenSub, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutStandardize, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutNetworkTransfer, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutsupportNetworkTransfer, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })


    }
}