package ac.za.cput.Domain;

public class Physics {

    private String subjectCode;
    private double mark;

    private Physics(){}

    private Physics(Physics.Builder builder) {
        this.subjectCode = builder.subjectCode;
        this.mark = builder.mark;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public Double getMark() {
        return mark;
    }


    public static class Builder{

        private String subjectCode;
        private double mark;

        public Physics.Builder subjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public Physics.Builder mark(Double mark) {
            this.mark = mark;
            return this;
        }

        public Physics build() {
            return new Physics(this);
        }

    }

    @Override
    public String toString() {
        return "Physics{" +
                "subjectCode='" + subjectCode + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

}
