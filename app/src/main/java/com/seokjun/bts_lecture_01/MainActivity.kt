package com.seokjun.bts_lecture_01

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭되었다는 것을 알아야 함(프로그램이)
        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면 다음 화면으로 넘어가서 사진을 크게 보여줌
            val intent = Intent(this, Bts1Activity::class.java) // option + Enter로 intent 클래스 임포트
            startActivity(intent)
        }
        // 7개 이미지들의 이름을 붙이고, 각각을 클릭할 때 다른 액티비티로 이동

        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        val image3 = findViewById<ImageView>(R.id.bts_image_3)
        val image4 = findViewById<ImageView>(R.id.bts_image_4)
        val image5 = findViewById<ImageView>(R.id.bts_image_5)
        val image6 = findViewById<ImageView>(R.id.bts_image_6)
        val image7 = findViewById<ImageView>(R.id.bts_image_7)

        image2.setOnClickListener {
            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {
            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener {
            val intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)
        }

        image7.setOnClickListener {
            val intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }
    }
}
