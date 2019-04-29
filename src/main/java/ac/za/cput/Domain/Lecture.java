package ac.za.cput.Domain;

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

}
