package com.example.brendaproject1.domain

data class HomeListItems(
    //Cambia a String para conexión en base de datos
    val imageURL: Int,
    val title: String,
    val description: String,
    val pricePerNight: Int
)