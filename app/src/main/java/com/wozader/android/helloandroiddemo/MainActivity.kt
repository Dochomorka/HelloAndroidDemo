package com.wozader.android.helloandroiddemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //onGit
        // show message on the screen
        Toast.makeText(applicationContext,"Newly added thingy...",Toast.LENGTH_SHORT).show()

        // make some changes as well
    }
}
