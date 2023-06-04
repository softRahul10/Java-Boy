package Language.OOPs.MasterOOPs;

public class Q1 {
}

/* class 1 */
// class for Student
class Student{

}

/* class 2 */
// class for Subject
class Subject{

    // properties
    private String subjectID;
    private String subjectName;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subject, String id) {
        this.subjectName = subject;
        this.subjectID = id;
    }

    /* Getters */

    public String getSubjectID() {
        return subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    /* setters */

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }
}
