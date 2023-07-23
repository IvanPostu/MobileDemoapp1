package com.example.demoapp1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.demoapp1.dto.CourseInfo

class MainActivity : AppCompatActivity() {
    private lateinit var spinnerCourses: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinnerCourses = findViewById(R.id.spinnerCourses)

        val dataManager = DataManager()
        val adapterCourses = ArrayAdapter<CourseInfo>(
            this,
            android.R.layout.simple_spinner_item,
            dataManager.coursesById.values.toList()
        )
        adapterCourses.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerCourses.adapter = adapterCourses
    }
}