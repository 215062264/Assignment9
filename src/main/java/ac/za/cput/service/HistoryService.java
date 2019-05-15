package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.History;

import java.util.Set;

public interface HistoryService extends IService<History, String> {
    Set<History> getAllHis();
    Set<History> getAll();
}
