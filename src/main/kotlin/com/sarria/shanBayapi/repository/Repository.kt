package com.sarria.shanBayapi.repository

import com.sarria.shanBayapi.staticPath
import java.io.File


val totalReads = listOf(9.3f, 18.2f, 32.1f, 21.5f, 45.2f)
val type = listOf("成长", "商业", "人文", "生活", "文娱","体育","历史","新闻")
val englishTitle = listOf(
    "Jetpack Compose Is A powerful Tool That Can Help App Developers Build Apps In A Far More Dynamic, Complex And Polished Way",
    "Build Better Apps Faster With Jetpack Compose",
    "Modern Declarative Way Of Creating UI In Android",
    "Jetpack Compose Is Now 1.0: Announcing Android's Modern Toolkit",
    "Understanding Jetpack Compose — part 1 of 2",
    "To-Do App with Jetpack Compose MVVM",
    "How To Use Compose With Other Popular Libraries: Coroutines, Retrofit",
    "Compose for Desktop UI Framework",
)

val chineseIntroduction = listOf(
    "使用Jetpack Compose更快的构建出色应用。",
    "Jetpack Compose现在已经发布1.0.0版本,这意味着安卓现代UI开发工具包已经到来！",
    "这是一个未完成的APP 使用Jetpack Compose MVVM架构！",
    "理解Jetpack Compose - 第二章 第一部分！",
    "在桌面端应用Jetpack Compose架构！",
    "如何在 Compose 应用中设置和使用状态 ?",
    "Jetpack Compose 是用于构建原生 Android 界面的新工具包 !",
    "Compose 它使用更少的代码、强大的工具和直观的 Kotlin API，可以帮助您简化并加快 Android 界面开发",
)

val level = listOf("初级（高考）", "中级 （四级）", "高级 （六级\\考研）")

val totalWords = listOf(432, 453, 537, 621, 475)

val totalComments = listOf(32, 47, 85, 12, 42)

val difficulty = listOf("难度适中", "较难", "简单")

val articleImageUrls = with(File("${staticPath}/images/articles")) {
        if (!isDirectory) return@with emptyArray()
        listFiles { file ->
            file.isFile && (with(file.name) { endsWith("jpeg") || endsWith("jpg") || endsWith("png") })
        }
    }.map {
        "${com.sarria.shanBayapi.host}/images/articles/${it.name}"
    }


val headImageUrls = with(File("${staticPath}/images/heads")) {
    if (!isDirectory) return@with emptyArray()
    listFiles { file ->
        file.isFile && (with(file.name) { endsWith("jpeg") || endsWith("jpg") || endsWith("png") })
    }
}.map {
    "${com.sarria.shanBayapi.host}/images/heads/${it.name}"
}

val todayPushMessage = listOf(
    listOf("中国立场，全球视野", "每晚 7:00 准时更新"),
    listOf("安卓课程, 不见不散","compose挑战，为你而来"),
    listOf("精品教程，免费呈现","美丽篇章，等你翻页")
)