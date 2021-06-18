package com.udaychugh.quizoid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

class quizactivity : AppCompatActivity() {

    var time : Int = 10
    lateinit var texttimer : TextView

    var score : Int = 0
    var loop : Int = 1

    lateinit var question  :TextView
    lateinit var option1 : TextView
    lateinit var option2 : TextView
    lateinit var option3 : TextView
    lateinit var option4 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizactivity)
        supportActionBar?.hide()

        texttimer=findViewById(R.id.timertext)
        question=findViewById(R.id.question)
        option1=findViewById(R.id.option1text)
        option2=findViewById(R.id.option2text)
        option3=findViewById(R.id.option3text)
        option4=findViewById(R.id.option4text)



        while (loop<=11)
        {
            if (loop == 1)
            {
                question.text = "1. Who was the first Indian woman in Space?"
                option1.text = "A. Kalpana Chawla" //ans
                option2.text = "B. Sunita Williams"
                option3.text = "C. Koneru Humpy"
                option4.text = "D. None of the above"
                startTimer()
                rightanswer(option1)
                wronganswer(option2, option3,option4)

            }
            else if (loop == 2)
            {
                question.text = "2. Who was the first Indian in space?"
                option1.text = "A. Vikram Ambalal"
                option2.text = "B. Ravish Malhotra"
                option3.text = "C. Rakesh Sharma" //ans
                option4.text = "D. Nagapathi Bhat"
                startTimer()
                rightanswer(option3)
                wronganswer(option1, option2,option4)

            }
            else if (loop == 3)
            {
                question.text = "3. Who was the first Man to Climb Mount Everest Without Oxygen?"
                option1.text = "A. Junko Tabei"
                option2.text = "B. Reinhold Messner"
                option3.text = "C. Peter Habeler"
                option4.text = "D. Phu Dorji" //ans
                startTimer()
                rightanswer(option4)
                wronganswer(option1, option2,option3)

            }
            else if (loop == 4)
            {
                question.text = "4. Who built the Jama Masjid?"
                option1.text = "A. Jahangir"
                option2.text = "B. Akbar"
                option3.text = "C. Imam Bukhari"
                option4.text = "D. Shah Jahan" //ans
                startTimer()
                rightanswer(option4)
                wronganswer(option1, option2,option3)

            }
            else if (loop == 5)
            {
                question.text = "5. Who wrote the Indian National Anthem?"
                option1.text = "A. Bakim Chandra Chatterji"
                option2.text = "B. Rabindranath Tagore" //ans
                option3.text = "C. Swami Vivekanand"
                option4.text = "D. None of the above"
                startTimer()
                rightanswer(option2)
                wronganswer(option1, option3,option4)

            }
            else if (loop == 6)
            {
                question.text = "6. Who was the first Indian Scientist to win a Nobel Prize?"
                option1.text = "A. CV Raman" //ans
                option2.text = "B. Amartya Sen"
                option3.text = "C. Hargobind Khorana"
                option4.text = "D. Subramanian Chrandrashekar"
                startTimer()
                rightanswer(option1)
                wronganswer(option2, option3,option4)

            }
            else if (loop == 7)
            {
                question.text = "7. Who is the first Indian to win a Nobel Prize?"
                option1.text = "A. Rabindranath Tagore" //ans
                option2.text = "B. CV Raman"
                option3.text = "C. Mother Theresa"
                option4.text = "D. Hargobind Khorana"
                startTimer()
                rightanswer(option1)
                wronganswer(option2, option3,option4)

            }
            else if (loop == 8)
            {
                question.text = "8. Who was the first Indian woman to win the Miss World Title?"
                option1.text = "A. Aishwarya Rai"
                option2.text = "B. Sushmita Sen"
                option3.text = "C. Reita Faria" //ans
                option4.text = "D. Diya Mirza"
                startTimer()
                rightanswer(option3)
                wronganswer(option1, option2,option4)

            }
            else if (loop == 9)
            {
                question.text = "9. Who was the first President of India?"
                option1.text = "A. Abdul Kalam"
                option2.text = "B. Lal Bahadur Shastri"
                option3.text = "C. Dr. Rajendra Prasad" //ans
                option4.text = "D. Zakir Hussain"
                startTimer()
                rightanswer(option3)
                wronganswer(option1, option2,option4)

            }
            else if (loop == 10)
            {
                question.text = "10. Who was the first Indian to win the Booker Prize?"
                option1.text = "A. Dhan Gopal Mukerji"
                option2.text = "B. Nirad C. Chaudhuri"
                option3.text = "C. Arundhati Roy" //ans
                option4.text = "D. Aravind Adiga"
                startTimer()
                rightanswer(option3)
                wronganswer(option1, option2,option4)

            }
            else if (loop == 11)
            {
                sendscoreresult()
                val intent = Intent(this@quizactivity, resultactivity::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(applicationContext,"Error 404 not found", Toast.LENGTH_SHORT).show()
            }
        }//while close
    }

    private fun sendscoreresult() {
        val intent = Intent(this@quizactivity,resultactivity::class.java)
        intent.putExtra("score" , score)
    }

    private fun wronganswer(wrong1: TextView?, wrong2: TextView?, wrong3: TextView?) {
        wrong1?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@quizactivity, resultactivity::class.java)
                startActivity(intent)
                sendscoreresult()
            }
        })
        wrong2?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@quizactivity, resultactivity::class.java)
                startActivity(intent)
                sendscoreresult()
            }
        })
        wrong3?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@quizactivity, resultactivity::class.java)
                startActivity(intent)
                sendscoreresult()
            }
        })
    }

    private fun rightanswer(right1: TextView?) {
        right1?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                loop +=1
                score +=1
                sendscoreresult()
            }
        })
    }

    private fun startTimer() {
        val timer = object : CountDownTimer(10000, 1000){
            override fun onFinish() {
                // End Activity here
                Toast.makeText(applicationContext,"Time khatam bc",Toast.LENGTH_SHORT).show()
            }

            override fun onTick(millisUntilFinished: Long) {
                texttimer.text = (millisUntilFinished / 1000).toString()
            }
        }
        timer.start()
    }//start Timer function


}