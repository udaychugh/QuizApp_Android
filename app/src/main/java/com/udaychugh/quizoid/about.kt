package com.udaychugh.quizoid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class about : AppCompatActivity() {

    lateinit var gotohome : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.hide()

        gotohome=findViewById(R.id.backbutton)

        gotohome.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@about, MainActivity::class.java)
                startActivity(intent)
            }
        })
    }
}