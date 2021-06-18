package com.udaychugh.quizoid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var startquiz : RelativeLayout
    lateinit var rateus : RelativeLayout
    lateinit var aboutus : RelativeLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        startquiz=findViewById(R.id.startquiz)
        rateus=findViewById(R.id.rateapp)
        aboutus=findViewById(R.id.aboutapp)

        startquiz.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, quizactivity::class.java)
                startActivity(intent)
            }
        })

        rateus.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, rate::class.java)
                startActivity(intent)
            }
        })

        aboutus.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, about::class.java)
                startActivity(intent)
            }
        })

        fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
        }

        fun onBackPressed() {
            AlertDialog.Builder(this)
                .setTitle("Alert")
                .setMessage("Do you want to exit this app?")
                .setPositiveButton(android.R.string.ok){ dialog, whichButton ->
                    super.onBackPressed()
                }
                .setNegativeButton(android.R.string.cancel) {dialog, whichButton ->

                }
                .show()
        }



    }
}