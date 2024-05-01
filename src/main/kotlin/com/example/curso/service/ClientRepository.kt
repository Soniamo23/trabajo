package com.example.curso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ClientService {
    @Autowired
    lateinit var ClientService: ClientRepository

    fun list(): List<client>{
        return clientService.findAll()
    }
}

