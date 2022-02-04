package com.example.weatherapplication

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}