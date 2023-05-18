package com.example.swapitest

fun getUrl(url: String, startIndex: Int): String {
    val substring = url.subSequence(startIndex, url.length)
    return substring.toString()
}
