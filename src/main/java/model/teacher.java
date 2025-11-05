package model;

public class teacher {
    private int teacherID;
    private String name;
    private String email;
    private String course;
    private String tlfNr;

    public teacher(String name, String email, String course, String tlfNr) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.tlfNr = tlfNr;
    }

    // Getters and setters
    public int getTeacherID() { return teacherID; }
    public void setTeacherID(int teacherID) { this.teacherID = teacherID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getTlfNr() { return tlfNr; }
    public void setTlfNr(String tlfNr) { this.tlfNr = tlfNr; }
}
