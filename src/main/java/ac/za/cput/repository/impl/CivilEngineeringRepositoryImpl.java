package ac.za.cput.repository.impl;

import ac.za.cput.Domain.CivilEngineering;
import ac.za.cput.repository.CivilEngineeringRepository;
import java.util.HashSet;
import java.util.Set;

public class CivilEngineeringRepositoryImpl implements CivilEngineeringRepository {

    private static CivilEngineeringRepositoryImpl repository = null;
    private Set<CivilEngineering> civilEngineerings;

    private CivilEngineeringRepositoryImpl() {
        this.civilEngineerings = new HashSet<>();
    }

    public static CivilEngineeringRepository getRepository(){
        if(repository == null) repository = new CivilEngineeringRepositoryImpl();
        return repository;
    }

    public CivilEngineering create(CivilEngineering civilEngineerings){
        this.civilEngineerings.add(civilEngineerings);
        return civilEngineerings;
    }

    public CivilEngineering read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public CivilEngineering update(CivilEngineering civilEngineerings) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<CivilEngineering> getAll(){
        return this.civilEngineerings;
    }


}
