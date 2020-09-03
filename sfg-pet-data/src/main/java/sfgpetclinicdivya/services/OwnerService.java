package sfgpetclinicdivya.services;

import sfgpetclinicdivya.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
