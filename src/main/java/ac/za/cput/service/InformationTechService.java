package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.InformationTech;

import java.util.Set;

public interface InformationTechService extends IService<InformationTech, String> {
    Set<InformationTech> getAllIt();
    Set<InformationTech> getAll();
}
