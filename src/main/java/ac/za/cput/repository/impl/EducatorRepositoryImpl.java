package ac.za.cput.repository.impl;

import ac.za.cput.domain.people.Educator;
import ac.za.cput.repository.EducatorRepository;
import java.util.HashSet;
import java.util.Set;

public class EducatorRepositoryImpl implements EducatorRepository {

    private static EducatorRepositoryImpl repository = null;
    private Set<Educator> educators;

    private EducatorRepositoryImpl() {
        this.educators = new HashSet<>();
    }

    private Educator findEducator(String educatorID) {
        return this.educators.stream()
                .filter(educator -> educator.getEducatorId().trim().equals(educatorID))
                .findAny()
                .orElse(null);
    }

    public static EducatorRepository getRepository(){
        if(repository == null) repository = new EducatorRepositoryImpl();
        return repository;
    }

    public Educator create(Educator educators){
        this.educators.add(educators);
        return educators;
    }

    public Educator read(final String educatorID){
        Educator educator = findEducator(educatorID);
        return educator;
    }

    public void delete(String studentId) {
        Educator educator = findEducator(studentId);
        if (educator != null) this.educators.remove(educator);
    }

    public Educator update(Educator educator){
        Educator toDelete = findEducator(educator.getEducatorId());
        if(toDelete != null) {
            this.educators.remove(toDelete);
            return create(educator);
        }
        return null;
    }

    public Set<Educator> getAll(){
        return this.educators;
    }

}
