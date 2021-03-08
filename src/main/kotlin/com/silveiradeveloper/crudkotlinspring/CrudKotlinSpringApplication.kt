package com.silveiradeveloper.crudkotlinspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudKotlinSpringApplication

fun main(args: Array<String>) {
    runApplication<CrudKotlinSpringApplication>(*args)
}
