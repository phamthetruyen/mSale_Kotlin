package com.task.ui.component.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.viewModels
import com.task.databinding.SplashLayoutBinding
import com.task.ui.base.BaseActivity
import com.task.ui.component.login.LoginActivity
import com.task.SPLASH_DELAY
import com.task.databinding.SplashActivityBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by TruyenDev
 */
@AndroidEntryPoint
class SplashActivity : BaseActivity(){

    private lateinit var binding: SplashActivityBinding

    override fun initViewBinding() {
        binding = SplashActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigateToMainScreen()
    }

    override fun observeViewModel() {
    }

    private fun navigateToMainScreen() {
        Handler().postDelayed({
            val nextScreenIntent = Intent(this, LoginActivity::class.java)
            startActivity(nextScreenIntent)
            finish()
        }, SPLASH_DELAY.toLong())
    }
}
