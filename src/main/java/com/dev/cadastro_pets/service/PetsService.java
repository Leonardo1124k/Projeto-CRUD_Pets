package com.dev.cadastro_pets.service;

import com.dev.cadastro_pets.entities.Pet;
import com.dev.cadastro_pets.repository.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetsService {
    @Autowired
    private PetsRepository petsRepository;

    public void savePet(Pet pet) {
        petsRepository.save(pet);
    }

//    public Pet getById(Long id) {
//        return petsRepository.findById(id).orElseThrow();
//    }

    public Pet getPet(Long id, String name) {
        Long x = id;
        if (x != null){
            return petsRepository.findById(id).orElseThrow();
        } else {
            return petsRepository.findByName(name).orElseThrow();
        }
    }

//    public Pet getPet(Long id) {
//        Long x = id;
//        return petsRepository.findById(id).orElseThrow();
//    }


    public void updatePet(Pet pet, Long id) {
        Pet petEntity = petsRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Pet não encontrado"));
        Pet petAtualizado = Pet.builder().name(pet.getName() != null ? pet.getName() :
                        petEntity.getName())
                .age(pet.getAge() != null ? pet.getAge() :
                        petEntity.getAge())
                .species(pet.getSpecies() != null ? pet.getSpecies() :
                        petEntity.getSpecies())
                .breed(pet.getBreed() != null ? pet.getBreed() :
                        petEntity.getBreed())
                .id(petEntity.getId())
                .build();
        petsRepository.save(petAtualizado);
    }

    public void deletePet(Long id) {
        petsRepository.deleteById(id);
    }
}