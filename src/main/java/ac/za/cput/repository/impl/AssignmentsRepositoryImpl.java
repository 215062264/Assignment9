package ac.za.cput.repository.impl;

import ac.za.cput.domain.academicResults.Assignments;
import ac.za.cput.repository.AssignmentsRepository;
import java.util.HashSet;
import java.util.Set;

public class AssignmentsRepositoryImpl implements AssignmentsRepository {

    private static AssignmentsRepositoryImpl repository = null;
    private Set<Assignments> assignments;

    private AssignmentsRepositoryImpl() {
        this.assignments = new HashSet<>();
    }

    private Assignments findE(String studentNum) {
        return this.assignments.stream()
                .filter(assignments -> assignments.getStudentNum().trim().equals(studentNum))
                .findAny()
                .orElse(null);
    }

    public static AssignmentsRepository getRepository(){
        if(repository == null) repository = new AssignmentsRepositoryImpl();
        return repository;
    }

    public Assignments create(Assignments assignments){
        this.assignments.add(assignments);
        return assignments;
    }

    public Assignments read(final String studentId){
        Assignments assignments = findE(studentId);
        return assignments;
    }

    public void delete(String studentId) {
        Assignments assignments = findE(studentId);
        if (assignments != null) this.assignments.remove(assignments);
    }

    public Assignments update(Assignments assignments){
        Assignments toDelete = findE(assignments.getStudentNum());
        if(toDelete != null) {
            this.assignments.remove(toDelete);
            return create(assignments);
        }
        return null;
    }

    public Set<Assignments> getAll(){
        return this.assignments;
    }

}
