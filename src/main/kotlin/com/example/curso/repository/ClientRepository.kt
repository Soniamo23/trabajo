package com.example.curso.repository;

import com.example.curso.model.Client
import com.example.curso.model.client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository;

@Repository
interface ClientRepository:JpaRepository<Client, Long> {
}
