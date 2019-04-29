package ac.za.cput.Domain;

public class TechnicalDrawings {

    private String subjectCode;
    private double mark;

    private TechnicalDrawings(){}

    private TechnicalDrawings(TechnicalDrawings.Builder builder) {
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

        public TechnicalDrawings.Builder subjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public TechnicalDrawings.Builder mark(Double mark) {
            this.mark = mark;
            return this;
        }

        public TechnicalDrawings build() {
            return new TechnicalDrawings(this);
        }

    }

    @Override
    public String toString() {
        return "Technical Drawings{" +
                "subjectCode='" + subjectCode + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

}
