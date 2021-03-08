package com.example.fragment_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mFragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mFragmentManager.beginTransaction().add(R.id.fragment,FragmentA()).commit()
        button.setOnClickListener{changeView()}

    }
    fun changeView(){
        val getTopFragment = supportFragmentManager.findFragmentById(R.id.fragment)
        val fragmentTransaction = mFragmentManager.beginTransaction()
        when(getTopFragment){
            is FragmentB -> {fragmentTransaction.replace(R.id.fragment,FragmentA()).commit()}
            is FragmentA -> {fragmentTransaction.replace(R.id.fragment,FragmentB()).commit()}
        }
    }
}