package com.cegonheiros.models

data class Subjects(
    val id: String, 
    val id_university: Int, 
    val id_course: Int,
    val name: String,
    val professores: ArrayList<Usuario>
)
