package com.example.webview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentPagerAdapter(activity : FragmentActivity) : FragmentStateAdapter(activity) {
    val fragment : List<Fragment>
    init {
        fragment = listOf(TabOneFragment(), TabTwoFragment(), TabThreeFragment())
    }
    override fun createFragment(position: Int): Fragment {
        return fragment[position]

    }

    override fun getItemCount(): Int = fragment.size
}