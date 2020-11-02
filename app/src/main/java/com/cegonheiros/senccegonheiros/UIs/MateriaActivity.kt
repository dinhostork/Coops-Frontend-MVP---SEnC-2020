package com.cegonheiros.senccegonheiros.UIs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.cegonheiros.senccegonheiros.R
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_materia.*

class MateriaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materia)
        val fragments = arrayListOf(ForumFragment(), GruposFragment())
        viewPager2.adapter = StateFragment(supportFragmentManager, lifecycle, fragments)
        TabLayoutMediator(tabLayout, viewPager2){tab, position ->
            tab.text = resources.getStringArray(R.array.materias_tabs)[position]
            viewPager2.setCurrentItem(tab.position, true)
        }.attach()
    }

    class StateFragment(fragmentManager: FragmentManager, lifeCycle: Lifecycle, val fragments: ArrayList<Fragment>): FragmentStateAdapter(fragmentManager, lifeCycle){
        override fun getItemCount() = fragments.size

        override fun createFragment(position: Int) = fragments[position]
    }
}