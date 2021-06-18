package com.udaychugh.quizoid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

class resultactivity : AppCompatActivity() {

    lateinit var scoreshow : TextView
    lateinit var sign : ImageView
    lateinit var restart : RelativeLayout
    lateinit var showAns : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultactivity)
        supportActionBar?.hide()

        scoreshow=findViewById(R.id.score)
        sign=findViewById(R.id.sign)
        restart=findViewById(R.id.restart)
        showAns=findViewById(R.id.showans)

        showAns.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(applicationContext,"Asnwers sheet is not available, Stay tune with us",Toast.LENGTH_SHORT).show()
            }
        })

        restart.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                var intent = Intent(this@resultactivity, quizactivity::class.java)
                startActivity(intent)
            }
        })

        val getscoreresult = intent.getStringExtra("score")
        val finalscore = getscoreresult?.toInt()

        if (finalscore != null) {
            if (finalscore <= 6)
            {
                sign.setImageResource(R.drawable.cross)
                scoreshow.text = finalscore.toString()
            }
        }

    }
}