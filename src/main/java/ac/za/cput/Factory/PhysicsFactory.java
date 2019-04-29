package ac.za.cput.Factory;

import ac.za.cput.Domain.Physics;

public class PhysicsFactory {

    public static Physics getPhysics(String subjectCode, double mark) {
        return new Physics.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
