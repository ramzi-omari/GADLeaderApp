package com.example.gadleaderapp.data

data class User(
    var name: String = "",
    var hours: Int? = null,
    var score: Int? = null,
    var country: String = "",
    var badgeUrl: String = ""
)