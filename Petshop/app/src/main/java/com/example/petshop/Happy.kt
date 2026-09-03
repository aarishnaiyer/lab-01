package com.example.petshop

class Happy (val date: String) : Mood(date) {
    override fun mood(): String{
        return "Happy"
    }
}