package com.silveiradeveloper.crudkotlinspring.repositories

import com.silveiradeveloper.crudkotlinspring.models.User
import org.springframework.data.repository.CrudRepository
import org.springframework.security.access.prepost.PreAuthorize

interface UserRepository: CrudRepository<User,Long> {
}