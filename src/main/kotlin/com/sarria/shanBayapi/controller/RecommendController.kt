package com.sarria.shanBayapi.controller

import com.sarria.shanBayapi.model.Article
import com.sarria.shanBayapi.model.ClockOnCardInfo
import com.sarria.shanBayapi.repository.*
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/recommend")
class RecommendController {

    @GetMapping("/articles/{userId}")
    fun recommendArticles(@PathVariable("userId") userId: String, nums: Int?) = MutableList(nums ?: 5) {
        Article(
            id = it,
            imageUrl = articleImageUrls.random(),
            totalReads = totalReads.random(),
            type = type.random(),
            englishTitle = englishTitle.random(),
            chineseIntroduction = chineseIntroduction.random(),
            level = level.random(),
            totalWords = totalWords.random(),
            totalComments = totalComments.random(),
            difficulty = difficulty.random()
        )
    }

    @GetMapping("/clockOnCardInfo/{userId}")
    fun clockOnCardInfo(@PathVariable("userId") userId: String): ClockOnCardInfo = ClockOnCardInfo(
        todayReads = (1..3).random(),
        totalDays = (50..150).random(),
        totalJoiner = (66666..88888).random(),
        headerUrls = listOf(headImageUrls.random(), headImageUrls.random(), headImageUrls.random())
    )

    @GetMapping("/todayPushMessage")
    fun todayPushMessage(): List<String> = todayPushMessage.random()

}
