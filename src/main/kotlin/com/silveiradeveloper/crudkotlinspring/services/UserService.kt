package com.silveiradeveloper.crudkotlinspring.services

import com.silveiradeveloper.crudkotlinspring.models.User
import org.springframework.security.access.prepost.PreAuthorize

interface UserService {
    @PreAuthorize("permitAll")
    fun create(user: User)
    fun getAll(): List<User>
    fun getById(id: Long): User ?
    fun update(user: User)
    fun delete(id: Long)
}