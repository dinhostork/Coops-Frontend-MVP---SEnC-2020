package com.cegonheiros.senccegonheiros.UIs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.cegonheiros.UIs.MateriasFragment
import com.cegonheiros.senccegonheiros.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val fragments = mutableMapOf<String, Fragment>()
    init{
        fragments["materias"] = MateriasFragment()
        fragments["eventos"] = EventosFragment()
        fragments["ranking"] = RankingFragment()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initBottomNavigation()
        supportFragmentManager.beginTransaction().replace(R.id.content_main, fragments["materias"]!!)
            .commitAllowingStateLoss()
    }

    private fun initBottomNavigation(){
        bottomAppBar.setOnNavigationItemReselectedListener{

        }
        bottomAppBar.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_evento -> {
                    toolbar.title = "Eventos"
                    supportFragmentManager.beginTransaction().replace(R.id.content_main, fragments["eventos"]!!)
                        .commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_home -> {
                    toolbar.title = "Matérias"
                    supportFragmentManager.beginTransaction().replace(R.id.content_main, fragments["materias"]!!)
                        .commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_ranking -> {
                    toolbar.title = "Ranking"
                    supportFragmentManager.beginTransaction().replace(R.id.content_main, fragments["ranking"]!!)
                        .commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }
                else -> return@setOnNavigationItemSelectedListener false
            }
        }
    }
}