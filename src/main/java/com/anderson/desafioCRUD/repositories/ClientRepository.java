package com.anderson.desafioCRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anderson.desafioCRUD.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
