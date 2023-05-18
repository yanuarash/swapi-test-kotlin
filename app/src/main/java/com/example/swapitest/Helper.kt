package com.example.swapitest

fun getFilmUrl(url: String): String {
    val startIndex = 28
    val substring = url.subSequence(startIndex, url.length)
    return substring.toString()
}