package ac.za.cput.repository.impl;

import ac.za.cput.domain.schoolSubjects.Mathematics;
import ac.za.cput.repository.MathsRepository;
import java.util.HashSet;
import java.util.Set;

public class MathsRepositoryImpl implements MathsRepository {

    private static MathsRepositoryImpl repository = null;
    private Set<Mathematics> mathematics;

    private MathsRepositoryImpl() {
        this.mathematics = new HashSet<>();
    }

    private Mathematics findMath(String subjectCode) {
        return this.mathematics.stream()
                .filter(mathematics -> mathematics.getSubjectCode().trim().equals(subjectCode))
                .findAny()
                .orElse(null);
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
        Mathematics mathematics = findMath(subjectCode);
        return mathematics;
    }

    public Mathematics update(Mathematics mathematics) {
        Mathematics toDelete = findMath(mathematics.getSubjectCode());
        if(toDelete != null) {
            this.mathematics.remove(toDelete);
            return create(mathematics);
        }
        return null;
    }

    public void delete(String subjectCode) {
        Mathematics mathematics = findMath(subjectCode);
        if (mathematics != null) this.mathematics.remove(mathematics);
    }

    public Set<Mathematics> getAll(){
        return this.mathematics;
    }

}
