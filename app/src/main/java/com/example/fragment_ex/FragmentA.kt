package com.example.fragment_ex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentA :Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return if (inflater != null) {
            inflater.inflate(R.layout.fragment_a, container, false)
        } else {
            return super.onCreateView(inflater, container, savedInstanceState)
        }
    }
}