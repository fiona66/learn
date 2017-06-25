package org.six.util;

/**
 * Created by yanglu on 6/25/17.
 */
public class StudentInformation {
    private int id;
    private int sid;
    private String name;
    private String gender;
    private String subject;
    private String grade;
    private String birth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "StudentInformation{" +
                "id=" + id +
                ", sid=" + sid +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", subject='" + subject + '\'' +
                ", grade='" + grade + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}
