package com.example.sfgpetclinicdivya.services;

import com.example.sfgpetclinicdivya.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
