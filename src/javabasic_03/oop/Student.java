package javabasic_03.oop;

public class Student {
    private String stu_name;
    private Integer stu_age;
    private String address;
    private String stu_ssn;

    Student(){ }
    Student (String Stu_name, String Stu_ssn){
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
    }

    Student(String stu_name, Integer stu_age, String address, String stu_ssn){
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
        this.stu_age = stu_age;
        this.address = address;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public String getStu_name() {
        return stu_name;
    }

    public String getAddress() {
        return address;
    }

    public String getStu_ssn() {
        return stu_ssn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", address='" + address + '\'' +
                ", stu_ssn='" + stu_ssn + '\'' +
                '}';
    }
}
