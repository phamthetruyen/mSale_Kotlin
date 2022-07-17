package com.task.ui.component.supportstore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.task.databinding.SupportFragmentBinding
import com.task.utils.clickutils.LibClickAnimUtils
import com.task.utils.clickutils.OnCustomClickListener

/**
 * Created by TruyenDev on 14/07/2022.
 */
class SupportFragment : Fragment() {
    private lateinit var binding: SupportFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = SupportFragmentBinding.inflate(inflater, container,false)
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
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutListStore, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutCarePlan, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutFastSupport, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutVisitStore, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutHistory, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutSupportResult, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.layoutCaringStaff, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })



    }
}