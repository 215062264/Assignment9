package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Assignments;
import ac.za.cput.repository.AssignmentsRepository;
import java.util.HashSet;
import java.util.Set;

public class AssignmentsRepositoryImpl implements AssignmentsRepository {

    private static AssignmentsRepositoryImpl repository = null;
    private Set<Assignments> assignments;

    private AssignmentsRepositoryImpl() {
        this.assignments = new HashSet<>();
    }

    public static AssignmentsRepository getRepository(){
        if(repository == null) repository = new AssignmentsRepositoryImpl();
        return repository;
    }

    public Assignments create(Assignments assignments){
        this.assignments.add(assignments);
        return assignments;
    }

    public Assignments read(String studentNum){
        //find the student in the set and return it if it exist
        return null;
    }

    public Assignments update(Assignments assignments) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentNum) {
        //find the student and delete it if it exists

    }

    public Set<Assignments> getAll(){
        return this.assignments;
    }

}
