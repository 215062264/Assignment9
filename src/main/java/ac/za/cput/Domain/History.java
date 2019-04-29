package ac.za.cput.Domain;

public class History {

    private String subjectCode;
    private double mark;

    private History(){}

    private History(History.Builder builder) {
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

        public History.Builder subjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public History.Builder mark(Double mark) {
            this.mark = mark;
            return this;
        }

        public History build() {
            return new History(this);
        }

    }

    @Override
    public String toString() {
        return "History{" +
                "subjectCode='" + subjectCode + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

}
