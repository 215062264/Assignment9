package ac.za.cput.repository;

import ac.za.cput.domain.schoolSubjects.InformationTech;

import java.util.Set;

public interface InformationTechRepository extends IRepository<InformationTech, String> {
    Set<InformationTech> getAll();

}
