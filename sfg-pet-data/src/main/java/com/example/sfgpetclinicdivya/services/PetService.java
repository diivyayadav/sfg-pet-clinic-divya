package com.example.sfgpetclinicdivya.services;



import com.example.sfgpetclinicdivya.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
