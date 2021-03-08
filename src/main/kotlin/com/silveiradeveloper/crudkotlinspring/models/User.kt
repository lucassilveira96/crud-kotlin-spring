package com.silveiradeveloper.crudkotlinspring.models

import javax.persistence.*

@Entity
@Table(name="users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String="",
    val password: String=""
)