package com.example.curriculumvitaev2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


private const val NAME_ARG = "Name"
private const val EMAIL_ARG = "email"
private const val AGE_ARG = "age"
private const val GENDER_ARG = "gender"


class BasicInfoFragment : Fragment() {

    private lateinit var name: TextView
    private lateinit var age: TextView
    private lateinit var gender: TextView
    private lateinit var email: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val e = inflater.inflate(R.layout.resume, container, false)

        name = e.findViewById(R.id.name)!!
        age = e.findViewById(R.id.age)!!
        gender = e.findViewById(R.id.gender)!!
        email = e.findViewById(R.id.email)!!

        return e
    }


}