package com.cegonheiros.models

data class Question(
    val id: String, 
    val id_subject: Int,
    val id_creator: Int,
    val description: String?,
    val title: String,
    val difficult: Float
)
