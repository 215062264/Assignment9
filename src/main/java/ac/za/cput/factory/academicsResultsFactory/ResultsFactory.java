package ac.za.cput.factory.academicsResultsFactory;

import ac.za.cput.domain.academicResults.Results;

public class ResultsFactory {

    public static Results getResults(String studentNum, double mark) {
        return new Results.Builder()
                .studentNum(studentNum)
                .mark(mark)
                .build();
    }

}
