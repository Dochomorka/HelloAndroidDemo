package com.wozader.android.helloandroiddemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext, "Newly added thingy...", Toast.LENGTH_SHORT).show()


        // to commit to the git hub repo
        // steps
        // 1, please press 1
        // 2, please hit enter
        // 3, please add something to the editor and make commits


    }
}
