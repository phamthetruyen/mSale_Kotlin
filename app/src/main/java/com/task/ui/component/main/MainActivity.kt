package com.task.ui.component.main

import android.content.Intent
import android.view.MenuItem
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.task.R
import com.task.databinding.MainActivityBinding
import com.task.ui.base.BaseActivity
import com.task.ui.component.home.HomeFragment
import com.task.ui.component.login.LoginActivity
import com.task.ui.component.manageacount.ManageAccountFragment
import com.task.ui.component.sell.SellFragment
import com.task.ui.component.supportstore.SupportFragment
import com.task.utils.clickutils.LibClickAnimUtils
import com.task.utils.clickutils.OnCustomClickListener
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by TruyenDev on 14/07/2022.
 */
@AndroidEntryPoint
class MainActivity : BaseActivity() {
    private lateinit var binding: MainActivityBinding

    /**
     *
     */
    override fun observeViewModel() {

    }

    /**
     *
     */
    override fun initViewBinding() {
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        replaceFragment(HomeFragment())
        initView()
        initDrawer()
    }

    /**
     *
     */
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }

    /**
     *
     */
    private fun initView() {
        binding.bottomNavigationView.itemIconTintList = null
        binding.bottomNavigationView.setOnNavigationItemSelectedListener {

            when (it.itemId) {

                R.id.home -> {
                    replaceFragment(HomeFragment())
                    binding.tvTitleToolbar.text = "Trang chủ"
                }
                R.id.sell -> {
                    replaceFragment(SellFragment())
                    binding.tvTitleToolbar.text = "Bán hàng"
                }
                R.id.support -> {
                    replaceFragment(SupportFragment())
                    binding.tvTitleToolbar.text = "Chăm sóc ĐBH"
                }
                R.id.manage -> {
                    replaceFragment(ManageAccountFragment())
                    binding.tvTitleToolbar.text = "Quản lý thuê bao"
                }
                else -> {

                }

            }

            true

        }
    }

    /**
     *
     */
    override fun onBackPressed() {
        if (binding.drawer.isDrawerOpen(GravityCompat.START)) {
            binding.drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    /**
     *
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        return when (item.itemId) {
            android.R.id.home -> {
                binding.drawer.openDrawer(GravityCompat.START)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    /**
     *
     */
    private fun initDrawer() {
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.menuLeft, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
                binding.drawer.openDrawer(GravityCompat.START)
            }
        })
        LibClickAnimUtils.setOnCustomTouchViewScaleNotOther(binding.ivNoti, object : OnCustomClickListener {
            override fun onCustomClick(v: View?, event: MotionEvent?) {
            }
        })
        binding.navigationView.itemIconTintList = null
        binding.navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.nav_home -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                    replaceFragment(HomeFragment())
                    binding.tvTitleToolbar.text = "Trang chủ"
                    binding.drawer.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_sell -> {
                    replaceFragment(SellFragment())
                    binding.tvTitleToolbar.text = "Bán hàng"
                    binding.drawer.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_support -> {
                    replaceFragment(SupportFragment())
                    binding.tvTitleToolbar.text = "Chăm sóc ĐBH"
                    binding.drawer.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_manage -> {
                    replaceFragment(ManageAccountFragment())
                    binding.tvTitleToolbar.text = "Quản lý thuê bao"
                    binding.drawer.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_logout -> {
                    Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
                    binding.drawer.closeDrawer(GravityCompat.START)
                    logout()
                    true
                }
            }
            true
        }

        val drawerToggle = ActionBarDrawerToggle(this, binding.drawer, R.string.open, R.string.close)
        binding.drawer.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
    }

    /**
     *
     */
    private fun logout() {
        val nextScreenIntent = Intent(this, LoginActivity::class.java)
        startActivity(nextScreenIntent)
        finish()
    }
}