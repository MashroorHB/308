package bodies;

public class Script {
    private Student student;
    private int marks;
    private Boolean rescrutinized;
    private Boolean marksUpdated;

    public int getMarks() {
        return marks;
    }

    public Student getStudent() {
        return student;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Boolean getMarksUpdated() {
        return marksUpdated;
    }

    public Boolean getRescrutinized() {
        return rescrutinized;
    }

    public void setMarksUpdated(Boolean marksUpdated) {
        this.marksUpdated = marksUpdated;
    }

    public void setRescrutinized(Boolean rescrutinized) {
        this.rescrutinized = rescrutinized;
    }

}
