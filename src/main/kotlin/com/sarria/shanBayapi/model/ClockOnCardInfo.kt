package com.sarria.shanBayapi.model

data class ClockOnCardInfo(
    val totalDays: Int,
    val todayReads: Int,
    val totalJoiner: Int,
    val headerUrls: List<String>
)