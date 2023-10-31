package com.omarcomputer.fraguements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var btnFragment1 : Button
    lateinit var btnFragment2 : Button
    lateinit var view : View
    lateinit var txtI : TextView
    val fragment1 = Fragment1()
    val fragment2 = Fragment2()
    var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnFragment1 = findViewById(R.id.btnFraguement1)
        btnFragment2 = findViewById(R.id.btnFraguement2)
        txtI = findViewById(R.id.txtI)
        txtI.text = "i : $i"
        view = findViewById(R.id.fragments)
        Log.i("MylifeCyle","Main : onCreate() state : ${this.lifecycle.currentState}")

        Toast.makeText(applicationContext,"Created, i = $i",Toast.LENGTH_LONG).show()
       //loadFragment(fragment1)
        btnFragment1.setOnClickListener {
            loadFragment(fragment1)
            i++
            txtI.text = "i : $i"

        }
        btnFragment2.setOnClickListener {
            loadFragment(fragment2)
            i++
            txtI.text = "i : $i"
        }

    }



    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("i",i)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        i = savedInstanceState.getInt("i")
        txtI.text = "i : $i"
    }

    private fun loadFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragments,fragment)
            //addToBackStack(null)
            commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MylifeCyle","Main : onStart() state : ${this.lifecycle.currentState}")
    }
    override fun onResume() {
        super.onResume()

        Log.i("MylifeCyle","Main : onResume() state : ${this.lifecycle.currentState}")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MylifeCyle","Main : onRestart() state : ${this.lifecycle.currentState}")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MylifeCyle","Main : onStop() state : ${this.lifecycle.currentState}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MylifeCyle","Main : onDestroy() state : ${this.lifecycle.currentState}")
    }


}