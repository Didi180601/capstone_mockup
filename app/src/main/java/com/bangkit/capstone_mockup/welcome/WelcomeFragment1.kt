package com.bangkit.capstone_mockup.welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.capstone_mockup.databinding.FragmentWelcome1Binding

class WelcomeFragment1 : Fragment() {
    private var _fragmentWelcomeBinding: FragmentWelcome1Binding? = null

    private val _binding get() = _fragmentWelcomeBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _fragmentWelcomeBinding =
            FragmentWelcome1Binding.inflate(inflater, container, false)

        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity?)?.supportActionBar?.hide()
    }

    override fun onDestroy() {
        super.onDestroy()

        _fragmentWelcomeBinding = null
    }
}