package com.silveiradeveloper.crudkotlinspring.services

import com.silveiradeveloper.crudkotlinspring.models.User
import com.silveiradeveloper.crudkotlinspring.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class UserServiceImpl: UserService {

    @Autowired
    lateinit var userRepository: UserRepository;

    override fun create(user: User) {
        userRepository.save(user)
    }

    override fun getAll(): List<User> {
        return userRepository.findAll().toList()
    }

    override fun getById(id: Long): User? {
        return userRepository.findById(id).orElseGet(null)
    }

    override fun update(user: User) {
        create(user)
    }

    override fun delete(id: Long) {
        userRepository.deleteById(id)
    }
}