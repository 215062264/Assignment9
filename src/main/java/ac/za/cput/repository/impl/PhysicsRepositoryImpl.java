package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Physics;
import ac.za.cput.repository.PhysicsRepository;
import java.util.HashSet;
import java.util.Set;

public class PhysicsRepositoryImpl implements PhysicsRepository {

    private static PhysicsRepositoryImpl repository = null;
    private Set<Physics> physics;

    private PhysicsRepositoryImpl() {
        this.physics = new HashSet<>();
    }

    public static PhysicsRepository getRepository(){
        if(repository == null) repository = new PhysicsRepositoryImpl();
        return repository;
    }

    public Physics create(Physics physics){
        this.physics.add(physics);
        return physics;
    }

    public Physics read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public Physics update(Physics physics) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<Physics> getAll(){
        return this.physics;
    }


}
