package com.silveiradeveloper.crudkotlinspring.controllers

import com.silveiradeveloper.crudkotlinspring.models.User
import com.silveiradeveloper.crudkotlinspring.services.UserServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/user"])
class UserController {

    @Autowired
    lateinit var userServiceImpl: UserServiceImpl;

    @PostMapping
    fun create(@RequestBody user: User){
        userServiceImpl.create(user)
    }

    @GetMapping()
    fun getAll():List<User>{
        return userServiceImpl.getAll()
    }


}