package com.task.ui.component.manageacount.subscriberdevelopment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.task.databinding.SubdevFragmentBinding
import com.task.utils.clickutils.LibClickAnimUtils
import com.task.utils.clickutils.OnCustomClickListener

/**
 * Created by TruyenDev on 17/07/2022.
 */
class SubscriberDevelopmentFragment : Fragment() {
    private lateinit var binding: SubdevFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = SubdevFragmentBinding.inflate(inflater, container, false)
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
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutChooseNumber, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
         LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutPrepaidConnection, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
         LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutRegisterInformation, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
         LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutPostpaidConnection, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
         LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutHistory, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
         LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutSupportHistory, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
         LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutSupportReport, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
         LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutEsimConnection, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })


    }
}