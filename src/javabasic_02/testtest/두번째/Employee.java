package javabasic_02.testtest.두번째;

public class Employee extends Person {
    private String name;
    private int age;
    private String dept;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    public void print() {
        System.out.println("이 름 : " + name + "\t나 이 : " + age + "\t부 서 : " + dept);
    }
}
