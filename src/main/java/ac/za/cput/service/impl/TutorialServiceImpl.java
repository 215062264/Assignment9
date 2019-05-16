package ac.za.cput.service.impl;

import ac.za.cput.domain.people.Tutorial;
import ac.za.cput.repository.TutorialRepository;
import ac.za.cput.repository.impl.TutorialRepositoryImpl;
import ac.za.cput.service.TutorialService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class TutorialServiceImpl implements TutorialService {

    private TutorialServiceImpl service = null;
    private TutorialRepository repository;

    private TutorialServiceImpl(){
        this.repository = TutorialRepositoryImpl.getRepository();
    }

    public TutorialService getService(){
        if (service == null) service = new TutorialServiceImpl();
        return service;
    }


    @Override
    public Tutorial create(Tutorial tutorial) {
        return this.repository.create(tutorial);
    }

    @Override
    public Tutorial update(Tutorial tutorial) {
        return this.repository.update(tutorial);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Tutorial read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Tutorial> getAllP() {
        Set<Tutorial> tutorials = getAll();

        return null;
    }

    @Override
    public Set<Tutorial> getAll() {
        return this.repository.getAll();
    }
}
