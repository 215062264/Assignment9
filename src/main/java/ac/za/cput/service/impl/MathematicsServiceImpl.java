package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.Mathematics;
import ac.za.cput.repository.MathsRepository;
import ac.za.cput.repository.impl.MathsRepositoryImpl;
import ac.za.cput.service.MathematicsService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class MathematicsServiceImpl implements MathematicsService {

    private MathematicsServiceImpl service = null;
    private MathsRepository repository;

    private MathematicsServiceImpl(){
        this.repository = MathsRepositoryImpl.getRepository();
    }

    public MathematicsService getService(){
        if (service == null) service = new MathematicsServiceImpl();
        return service;
    }


    @Override
    public Mathematics create(Mathematics course) {
        return this.repository.create(course);
    }

    @Override
    public Mathematics update(Mathematics course) { return this.repository.update(course); }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Mathematics read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Mathematics> getAllMath() {
        Set<Mathematics> mathematics = getAll();

        return null;
    }

    @Override
    public Set<Mathematics> getAll() {
        return this.repository.getAll();
    }
}
