package ac.za.cput.repository.impl;

import ac.za.cput.Domain.LifeOrientation;
import ac.za.cput.repository.LifeOrientationRepository;
import java.util.HashSet;
import java.util.Set;

public class LifeOrientationRepositoryImpl implements LifeOrientationRepository {

    private static LifeOrientationRepositoryImpl repository = null;
    private Set<LifeOrientation> lifeOrientations;

    private LifeOrientationRepositoryImpl() {
        this.lifeOrientations = new HashSet<>();
    }

    public static LifeOrientationRepository getRepository(){
        if(repository == null) repository = new LifeOrientationRepositoryImpl();
        return repository;
    }

    public LifeOrientation create(LifeOrientation lifeOrientations){
        this.lifeOrientations.add(lifeOrientations);
        return lifeOrientations;
    }

    public LifeOrientation read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public LifeOrientation update(LifeOrientation lifeOrientations) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<LifeOrientation> getAll(){
        return this.lifeOrientations;
    }


}
