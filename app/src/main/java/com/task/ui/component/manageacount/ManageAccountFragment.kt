package com.task.ui.component.manageacount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.task.R
import com.task.databinding.ManageFragmentBinding
import com.task.ui.component.manageacount.aftersell.AfterSellFragment
import com.task.ui.component.manageacount.subscriberdevelopment.SubscriberDevelopmentFragment

/**
 * Created by TruyenDev on 14/07/2022.
 */
class ManageAccountFragment : Fragment() {
    private lateinit var binding: ManageFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = ManageFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    /**
     *
     */
    private fun initView() {
        replaceFragment(SubscriberDevelopmentFragment())
        hideLayoutChoose(true)
        binding.layoutSubDev.setOnClickListener {
            replaceFragment(SubscriberDevelopmentFragment())
            hideLayoutChoose(true)
        }
        binding.layoutAfterSell.setOnClickListener {
            replaceFragment(AfterSellFragment())
            hideLayoutChoose(false)
        }
    }

    /**
     *
     */
    private fun hideLayoutChoose(check: Boolean) {
        if (check) {
            binding.tvAfterSell.setTextColor(resources.getColor(R.color.text_manage))
            binding.tvSubDev.setTextColor(resources.getColor(R.color.colorAccent))
            binding.viewSubDev.visibility = View.VISIBLE
            binding.viewAfterSell.visibility = View.INVISIBLE
        } else {
            binding.tvSubDev.setTextColor(resources.getColor(R.color.text_manage))
            binding.tvAfterSell.setTextColor(resources.getColor(R.color.colorAccent))
            binding.viewSubDev.visibility = View.INVISIBLE
            binding.viewAfterSell.visibility = View.VISIBLE
        }
    }

    /**
     *
     */
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = childFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayoutManage, fragment)
        fragmentTransaction.commit()
    }
}
