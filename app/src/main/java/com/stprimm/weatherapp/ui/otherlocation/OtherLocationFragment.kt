package com.stprimm.weatherapp.ui.otherlocation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.stprimm.weatherapp.databinding.FragmentOtherlocationBinding

class OtherLocationFragment : Fragment() {

    private lateinit var otherLocationViewModel: OtherLocationViewModel
    private var _binding: FragmentOtherlocationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        otherLocationViewModel =
            ViewModelProvider(this).get(OtherLocationViewModel::class.java)

        _binding = FragmentOtherlocationBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textOtherlocation
        otherLocationViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}