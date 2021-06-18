package com.udaychugh.quizoid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Toast

class rate : AppCompatActivity() {

    lateinit var gotohome : ImageView
    lateinit var submit : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rate)
        supportActionBar?.hide()

        gotohome=findViewById(R.id.backbuttonofrate)
        submit=findViewById(R.id.submitfeedback)

        gotohome.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@rate, MainActivity::class.java)
                startActivity(intent)
            }
        })

        submit.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(applicationContext,"Thanks for your feedback",Toast.LENGTH_SHORT).show()
            }
        })

    }
}