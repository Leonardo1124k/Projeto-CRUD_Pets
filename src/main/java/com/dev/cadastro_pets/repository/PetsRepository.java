package com.dev.cadastro_pets.repository;

import com.dev.cadastro_pets.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
//import org.springframework.data.repository.CrudRepository;


public interface PetsRepository extends JpaRepository<Pet, Long> {
    Optional<Pet> findByName(String name);
}
