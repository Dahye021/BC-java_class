package javabasic_03.oop;

public class Student {

    // [1] 모든 필드는 private
    private String name;
    private int age;
    private String address;
    private String studentId;
    private int[] scores = new int[3]; // [0]=국어, [1]=영어, [2]=수학

    // [2] 생성자
    public Student(String name, int age, String address, String studentId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentId = studentId;
    }

    // [3] 점수 설정
    public void setScores(int korean, int english, int math) {
        scores[0] = korean;
        scores[1] = english;
        scores[2] = math;
    }

    // [4] 학생 정보 출력
    public void printStudentInfo() {
        System.out.println("학번: " + studentId);
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + address);
    }

    // [5] 과목 점수 확인
    public void printScores() {
        System.out.println("국어 점수: " + scores[0]);
        System.out.println("영어 점수: " + scores[1]);
        System.out.println("수학 점수: " + scores[2]);
    }

    // [6] 총점 구하기
    public int getTotalScore() {
        return scores[0] + scores[1] + scores[2];
    }

    // [7] 평균 구하기
    public double getAverageScore() {
        return getTotalScore() / 3.0;
    }

    // [8] 총점과 평균 출력
    public void printTotalAndAverage() {
        System.out.println("총점: " + getTotalScore());
        System.out.println("평균: " + getAverageScore());
    }
}
