package com.dev.cadastro_pets.controller;

import com.dev.cadastro_pets.entities.Pet;
import com.dev.cadastro_pets.service.PetsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/pets")
@RequiredArgsConstructor
public class PetsController {
    @Autowired
    public PetsService petsService;

    @PostMapping
    public ResponseEntity<Void> savePet(@RequestBody Pet pet) {
        petsService.savePet(pet);
        return ResponseEntity.ok().build();
    }

    @GetMapping//("{id}")
    public ResponseEntity<Pet> getPet(@RequestParam Long id, @RequestParam String name) {
        Pet thePet = petsService.getPet(id, name);
        return ResponseEntity.ok(thePet);
    }

    @PutMapping//("{id}")
    public ResponseEntity<Void> updatePet(@RequestBody Pet pet, @RequestParam Long id) {
        petsService.updatePet(pet, id);
        return ResponseEntity.ok().build();
    }
//    @PutMapping
//    public ResponseEntity<Void> atualizarUsuarioPorId(@RequestParam Integer id,
//                                                      @RequestBody Usuario usuario)
//    {
//        usuarioService.atualizarUsuarioPorId(id, usuario);
//        return ResponseEntity.ok().build();
//    }

    @DeleteMapping//("{id}")
    public ResponseEntity<Void> delete(@RequestParam Long id) {
        petsService.deletePet(id);
        return ResponseEntity.ok().build();
    }

}
