package com.stprimm.weatherapp.ui.currentlocation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.stprimm.weatherapp.databinding.FragmentCurrentlocationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CurrentLocationFragment : Fragment() {

    private lateinit var currentLocationViewModel: CurrentLocationViewModel
    private var _binding: FragmentCurrentlocationBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        currentLocationViewModel =
            ViewModelProvider(this).get(CurrentLocationViewModel::class.java)

        _binding = FragmentCurrentlocationBinding.inflate(inflater, container, false)
        val root: View = binding.root
        //val textView: TextView = binding.textDashboard
       /* currentLocationViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}