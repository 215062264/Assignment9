package ac.za.cput.domain.people;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Lecture {

    private String professor;
    private int hours;

    private Lecture(){}

    private Lecture(Lecture.Builder builder) {
        this.professor = builder.professor;
        this.hours = builder.hours;
    }

    public String getProfessor() {
        return professor;
    }

    public int getHours() {
        return hours;
    }


    public static class Builder{

        private String professor;
        private int hours;

        public Lecture.Builder professor(String professor) {
            this.professor = professor;
            return this;
        }

        public Lecture.Builder hours(int hours) {
            this.hours = hours;
            return this;
        }

        public Builder copy(Lecture lecture){
            this.professor = lecture.professor;
            this.hours = lecture.hours;
            return this;
        }

        public Lecture build() {
            return new Lecture(this);
        }

    }

    @Override
    public String toString() {
        return "Lecture{" +
                "professor='" + professor + '\'' +
                ", hours='" + hours + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecture lecture = (Lecture) o;
        return professor.equals(lecture.professor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(professor);
    }

}
