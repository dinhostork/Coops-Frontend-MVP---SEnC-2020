package com.cegonheiros.models

data class Room(
    val number: String, 
    val description: String?,
    val free: Boolean,
    val id_group: Int?
)
