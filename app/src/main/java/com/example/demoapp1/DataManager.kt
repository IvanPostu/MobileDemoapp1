package com.example.demoapp1

import com.example.demoapp1.dto.CourseInfo
import com.example.demoapp1.dto.NoteInfo

class DataManager {
    val coursesById: HashMap<String, CourseInfo> = HashMap()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("id_1", "Android course 1")
        coursesById.put(course.courseId, course)

        course = CourseInfo("id_2", "Android course 2")
        coursesById.put(course.courseId, course)

        course = CourseInfo("id_3", "Android course 3")
        coursesById.put(course.courseId, course)

        course = CourseInfo(title = "Android course 4", courseId = "id_4")
        coursesById.put(course.courseId, course)

    }
}