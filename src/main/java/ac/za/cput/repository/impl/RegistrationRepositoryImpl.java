package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Registration;
import ac.za.cput.repository.RegistrationRepository;
import java.util.HashSet;
import java.util.Set;

public class RegistrationRepositoryImpl implements RegistrationRepository {

    private static RegistrationRepositoryImpl repository = null;
    private Set<Registration> registrations;

    private RegistrationRepositoryImpl() {
        this.registrations = new HashSet<>();
    }

    public static RegistrationRepository getRepository(){
        if(repository == null) repository = new RegistrationRepositoryImpl();
        return repository;
    }

    public Registration create(Registration registrations){
        this.registrations.add(registrations);
        return registrations;
    }

    public Registration read(String regNum){
        //find the student in the set and return it if it exist
        return null;
    }

    public Registration update(Registration registrations) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String regNum) {
        //find the student and delete it if it exists

    }

    public Set<Registration> getAll(){
        return this.registrations;
    }


}
