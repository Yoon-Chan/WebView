package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.webview.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private  lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val tabLayout = binding.tabLayout
        val viewPager = binding.viewPager

        viewPager.adapter = FragmentPagerAdapter(this)

        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
            tab.text = "cartoon${position+1}"
        }.attach()


    }
}