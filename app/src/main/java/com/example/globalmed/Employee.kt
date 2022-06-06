package com.example.globalmed

/*
* Model class
* Map table fields as class members
* Each row is treated as an object with the help of this class
* */
class Employee(
    val id: String,
    val name: String,
    val dob: Long,
    val designation: String,
)