package com.example.evoliris.mykotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_list.*

class MyList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_list)
        fab.setOnClickListener{v->var intent = Intent(this, AddItem::class.java); startActivityForResult(intent, 1);}
    }
}
