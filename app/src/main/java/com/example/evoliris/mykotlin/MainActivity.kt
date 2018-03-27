package com.example.evoliris.mykotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decreaser.setOnClickListener{ v -> count--; updateValue()}
        increase.setOnClickListener{v -> count++; updateValue()}
        newScreen.setOnClickListener{v -> val nextScreen = Intent(this, MyList::class.java); nextScreen.putExtra("Counter",count); startActivity(nextScreen)}


    }
    fun updateValue(){
        display.text = count.toString();
    }
}
