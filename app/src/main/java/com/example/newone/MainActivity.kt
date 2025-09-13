package com.example.newone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var studentBtn : Button
    private lateinit var techerBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        studentBtn = findViewById(R.id.studentBtn)
        techerBtn = findViewById(R.id.teacherBtn)

        studentBtn.setOnClickListener {
            startActivity(Intent(this, StudentSingInActivity::class.java))
        }

        techerBtn.setOnClickListener {
            startActivity(Intent(this, TeacherSingInActivity::class.java0))
        }

}
}