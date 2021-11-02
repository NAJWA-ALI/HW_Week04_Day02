package com.example.week4dayviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


class InstaAdapter(fragment:FragmentManager):FragmentStatePagerAdapter(fragment) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return HomeFragment()
            1 -> return ProfileFragment()
            2 -> return ExploreFragment()
        }
        return HomeFragment()
    }
}
