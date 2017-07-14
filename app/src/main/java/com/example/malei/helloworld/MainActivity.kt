package com.example.malei.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = R.id.btn_kt as Button
        btn.setOnClickListener{ view -> toast("hello word from kotlin")}
    }

    fun AppCompatActivity.toast(message:CharSequence,duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(baseContext, message, duration).show()
    }
}
