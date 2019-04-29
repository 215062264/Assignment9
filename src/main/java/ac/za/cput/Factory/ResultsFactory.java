package ac.za.cput.Factory;

import ac.za.cput.Domain.Results;

public class ResultsFactory {

    public static Results getResults(String studentNum, double mark) {
        return new Results.Builder()
                .studentNum(studentNum)
                .mark(mark)
                .build();
    }

}
