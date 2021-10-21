package com.sarria.shanBayapi.model


data class Article(
    var id: Int,
    var userId: String = "sarria",
    val imageUrl: String,
    val totalReads: Float,
    val type: String,
    val englishTitle: String,
    val chineseIntroduction: String,
    val level: String,
    val totalWords: Int,
    val totalComments: Int,
    val difficulty: String
)