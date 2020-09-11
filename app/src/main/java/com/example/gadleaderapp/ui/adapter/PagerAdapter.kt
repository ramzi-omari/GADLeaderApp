package com.example.gadleaderapp.ui.adapter

import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.gadleaderapp.R
import com.example.gadleaderapp.ui.fragment.LeadersFragment

class PagerAdapter(fm: FragmentManager, context: Context) : FragmentStatePagerAdapter(fm) {
    val tabTitles = context.resources.getStringArray(R.array.tabBar)
    override fun getCount() = 2

    override fun getItem(position: Int) = when (position) {
        0 -> LeadersFragment.newInstance()
        else -> LeadersFragment.newInstance(LeadersFragment.FLAG_SKILL)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position]
    }
}