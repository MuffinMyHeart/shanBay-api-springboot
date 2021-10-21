package com.sarria.shanBayapi.config

import com.sarria.shanBayapi.staticPath
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.io.FileNotFoundException
import java.util.*

@Configuration
class InterceptorConfig : WebMvcConfigurer {
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/**").addResourceLocations("file://$staticPath/")
    }
}

