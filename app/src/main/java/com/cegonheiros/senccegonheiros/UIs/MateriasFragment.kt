package com.cegonheiros.UIs

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.cegonheiros.senccegonheiros.R
import com.cegonheiros.senccegonheiros.UIs.MateriaActivity

class MateriasFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_materias, container, false)
        val linearLayout: LinearLayout = view.findViewById(R.id.content_materias)
        linearLayout.setOnClickListener{
            startActivity(Intent(requireContext(), MateriaActivity::class.java))
        }
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = MateriasFragment()
    }
}