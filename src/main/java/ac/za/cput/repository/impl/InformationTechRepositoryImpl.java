package ac.za.cput.repository.impl;

import ac.za.cput.Domain.InformationTech;
import ac.za.cput.repository.InformationTechRepository;
import java.util.HashSet;
import java.util.Set;

public class InformationTechRepositoryImpl implements InformationTechRepository {

    private static InformationTechRepositoryImpl repository = null;
    private Set<InformationTech> informationTeches;

    private InformationTechRepositoryImpl() {
        this.informationTeches = new HashSet<>();
    }

    public static InformationTechRepositoryImpl getRepository(){
        if(repository == null) repository = new InformationTechRepositoryImpl();
        return repository;
    }

    public InformationTech create(InformationTech informationTeches){
        this.informationTeches.add(informationTeches);
        return informationTeches;
    }

    public InformationTech read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public InformationTech update(InformationTech informationTeches) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<InformationTech> getAll(){
        return this.informationTeches;
    }


}
