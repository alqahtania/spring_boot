package com.abdull.springboot.springtut

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringTutApplication

fun main(args: Array<String>) {
	val appCtx = runApplication<SpringTutApplication>(*args)
	appCtx.beanDefinitionNames.forEach {
		println("--> $it")
	}
}
