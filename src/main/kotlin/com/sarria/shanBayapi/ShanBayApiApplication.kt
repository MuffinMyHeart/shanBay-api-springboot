package com.sarria.shanBayapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.io.FileNotFoundException

@SpringBootApplication
class ShanBayApiApplication

//val host = "http://localhost"
val host = "http://101.132.97.199"
val userDir = System.getProperty("user.dir") ?: throw FileNotFoundException()
val staticPath = "$userDir/static"

fun main(args: Array<String>) {
	runApplication<ShanBayApiApplication>(*args)
}
