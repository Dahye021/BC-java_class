package javabasic_02.과제.상속.상속01.E02;

public class Student {
    // 필드 (정보 은닉)
    private String name;
    private String subject;
    private int fee;
    private double returnFee;

    // 생성자
    public Student(String name, String subject, int fee) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;
    }

    // 환급금 계산 메서드
    public void calcReturnFee() {
        if(subject.equalsIgnoreCase("javaprogram")) {
            returnFee = fee * 0.25;
        } else if(subject.equalsIgnoreCase("jspprogram")) {
            returnFee = fee * 0.20;
        } else {
            System.out.println("그런 과정명은 없습니다");
            return;
        }
    }

    // 출력 메서드
    public void print() {
        System.out.println(name + " 씨의 과정명은 " + subject + " 이고 교육비는 "
                + fee + " 이며 환급금은 " + (int)returnFee + " 입니다.");
    }

    // main 메서드
    public static void main(String args[]) {
        Student stu = new Student("장동건", "jspprogram", 500000);
        stu.calcReturnFee();
        stu.print();
    }
}