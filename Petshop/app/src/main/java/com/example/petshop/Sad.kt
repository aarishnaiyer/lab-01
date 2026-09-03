package com.example.petshop

class Sad (val date: String): Mood(date){
    override fun mood():String{
        return "Sad"
    }
}
