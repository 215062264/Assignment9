package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Mathematics;
import ac.za.cput.repository.MathsRepository;
import java.util.HashSet;
import java.util.Set;

public class MathsRepositoryImpl implements MathsRepository {

    private static MathsRepositoryImpl repository = null;
    private Set<Mathematics> mathematics;

    private MathsRepositoryImpl() {
        this.mathematics = new HashSet<>();
    }

    public static MathsRepository getRepository(){
        if(repository == null) repository = new MathsRepositoryImpl();
        return repository;
    }

    public Mathematics create(Mathematics mathematics){
        this.mathematics.add(mathematics);
        return mathematics;
    }

    public Mathematics read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public Mathematics update(Mathematics mathematics) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists
        if(mathematics.contains(subjectCode)){
            mathematics.remove(mathematics);
        }
    }

    public Set<Mathematics> getAll(){
        return this.mathematics;
    }

}
