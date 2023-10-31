package com.omarcomputer.fraguements

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner


class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("MylifeCyle","Fragment1 : onStart() state : ${this.lifecycle.currentState}")
    }
    override fun onStart() {
        super.onStart()
        Log.i("MylifeCyle","Fragment1 : onStart() state : ${this.lifecycle.currentState}")
    }
    override fun onResume() {
        super.onResume()

        Log.i("MylifeCyle","Fragment1 : onResume() state : ${this.lifecycle.currentState}")
    }



    override fun onStop() {
        super.onStop()
        Log.i("MylifeCyle","Fragment1 : onStop() state : ${this.lifecycle.currentState}")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("MylifeCyle","Fragment1 : onDestroy() state : ${this.lifecycle.currentState}")
    }

}