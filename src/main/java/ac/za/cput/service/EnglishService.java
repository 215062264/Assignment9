package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.English;

import java.util.Set;

public interface EnglishService extends IService<English, String> {
    Set<English> getAllEng();
    Set<English> getAll();
}
