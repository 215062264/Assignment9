package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.History;
import ac.za.cput.repository.HistoryRepository;
import ac.za.cput.repository.impl.HistoryRepositoryImpl;
import ac.za.cput.service.HistoryService;
import java.util.Set;

public class HistoryServiceImpl implements HistoryService {

    private HistoryServiceImpl service = null;
    private HistoryRepository repository;

    private HistoryServiceImpl(){
        this.repository = HistoryRepositoryImpl.getRepository();
    }

    public HistoryService getService(){
        if (service == null) service = new HistoryServiceImpl();
        return service;
    }


    @Override
    public History create(History course) {
        return this.repository.create(course);
    }

    @Override
    public History update(History course) { return this.repository.update(course); }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public History read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<History> getAllHis() {
        Set<History> histories = getAll();

        return null;
    }

    @Override
    public Set<History> getAll() {
        return this.repository.getAll();
    }
}
