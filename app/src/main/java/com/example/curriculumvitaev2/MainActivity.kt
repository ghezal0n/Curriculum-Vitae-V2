package com.example.curriculumvitaev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var fNameTextLayout: TextInputLayout
    private lateinit var emailTextLayout: TextInputLayout
    private lateinit var ageTextLayout: TextInputLayout
    private lateinit var profileImage: ImageView
    private lateinit var radioGroup: RadioGroup
    private lateinit var nextBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fNameTextLayout = findViewById(R.id.name)
        emailTextLayout = findViewById(R.id.email)
        ageTextLayout = findViewById(R.id.age)

        radioGroup = findViewById(R.id.radioGroup)
        nextBtn = findViewById(R.id.next)
        profileImage = findViewById(R.id.GfG_logo)



    }
}