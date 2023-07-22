package com.example.demoapp1

class Person(name: String, weightLbs: Double) {
    val name: String = name;
    var weightLbs: Double = weightLbs;
    var weightKilos: Double
        get() = weightLbs / 2.2
        set(value) {
            weightLbs = value * 2.2
        }

    fun eatDessert(addedIdeCream: Boolean = true) {
        weightLbs += if (addedIdeCream) 4.0 else 2.0
    }

    fun calcGoalWeightLbs(lbsToLose: Double = 10.0): Double {
        return weightLbs - lbsToLose
    }
}
