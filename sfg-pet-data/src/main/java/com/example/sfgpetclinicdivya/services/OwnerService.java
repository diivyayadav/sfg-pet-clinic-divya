package com.example.sfgpetclinicdivya.services;

import com.example.sfgpetclinicdivya.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
