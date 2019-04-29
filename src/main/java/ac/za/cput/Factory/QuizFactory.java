package ac.za.cput.Factory;

import ac.za.cput.Domain.Quiz;

public class QuizFactory {

    public static Quiz getQuiz(String dueDate, String studentNum, double mark) {
        return new Quiz.Builder()
                .dueDate(dueDate)
                .studentNum(studentNum)
                .mark(mark)
                .build();
    }

}
