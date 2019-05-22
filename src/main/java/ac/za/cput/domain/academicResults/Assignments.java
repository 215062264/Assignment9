package ac.za.cput.domain.academicResults;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
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

        public Builder copy(Assignments assignments){
            this.studentNum = assignments.studentNum;
            this.dueDate = assignments.dueDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignments assignments = (Assignments) o;
        return studentNum.equals(assignments.studentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }

}
