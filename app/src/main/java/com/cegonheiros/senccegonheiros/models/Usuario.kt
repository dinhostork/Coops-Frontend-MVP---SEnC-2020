package com.cegonheiros.models

data class Usuario(
    val id: String,
    val enum: String,
    val name: String,
    val registration: String,
    val email: String,
    val password: String?,
    val id_university: Int,
    val points: Int
)