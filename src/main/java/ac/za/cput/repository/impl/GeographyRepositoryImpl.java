package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Geography;
import ac.za.cput.repository.GeographyRepository;
import java.util.HashSet;
import java.util.Set;

public class GeographyRepositoryImpl implements GeographyRepository {

    private static GeographyRepositoryImpl repository = null;
    private Set<Geography> geographies;

    private GeographyRepositoryImpl() {
        this.geographies = new HashSet<>();
    }

    public static GeographyRepository getRepository(){
        if(repository == null) repository = new GeographyRepositoryImpl();
        return repository;
    }

    public Geography create(Geography geographies){
        this.geographies.add(geographies);
        return geographies;
    }

    public Geography read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public Geography update(Geography geographies) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<Geography> getAll(){
        return this.geographies;
    }


}
