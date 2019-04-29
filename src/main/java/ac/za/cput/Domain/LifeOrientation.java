package ac.za.cput.Domain;

public class LifeOrientation {

    private String subjectCode;
    private double mark;

    private LifeOrientation(){}

    private LifeOrientation(LifeOrientation.Builder builder) {
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

        public LifeOrientation.Builder subjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public LifeOrientation.Builder mark(Double mark) {
            this.mark = mark;
            return this;
        }

        public LifeOrientation build() {
            return new LifeOrientation(this);
        }

    }

    @Override
    public String toString() {
        return "Life Orientation{" +
                "subjectCode='" + subjectCode + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

}
