package ac.za.cput.Domain;

public class Science {

    private String subjectCode;
    private double mark;

    private Science(){}

    private Science(Science.Builder builder) {
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

        public Science.Builder subjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public Science.Builder mark(Double mark) {
            this.mark = mark;
            return this;
        }

        public Science build() {
            return new Science(this);
        }

    }

    @Override
    public String toString() {
        return "Science{" +
                "subjectCode='" + subjectCode + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

}
