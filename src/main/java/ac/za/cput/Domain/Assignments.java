package ac.za.cput.Domain;

public class Assignments {

    private String dueDate, studentNum;
    private double mark;

    private Assignments(){}

    private Assignments(Assignments.Builder builder) {
        this.dueDate = builder.dueDate;
        this.studentNum = builder.studentNum;
        this.mark = builder.mark;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public double getAssignmentMark() {
        return mark;
    }


    public static class Builder {

        private String dueDate, studentNum;
        private double mark;

        public Assignments.Builder dueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Assignments.Builder studentNum(String studentNum) {
            this.studentNum = studentNum;
            return this;
        }

        public Assignments.Builder mark(double mark) {
            this.mark = mark;
            return this;
        }



        public Assignments build() {
            return new Assignments(this);
        }

    }

    @Override
    public String toString() {
        return "Assignments{" +
                "dueDate='" + dueDate + '\'' +
                ", studentNum='" + studentNum + '\'' +
                ", Mark='" + mark + '\'' +
                '}';
    }

}
