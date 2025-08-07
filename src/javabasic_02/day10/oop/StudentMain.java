package javabasic_03.oop;

public class StudentMain {
    public static void main(String[] args) {
        // 학생 객체 생성
        Student student = new Student("홍길동", 20, "서울시 마포구", "202501");

        // 점수 입력
        student.setScores(90, 85, 92);

        // 정보 및 점수 출력
        student.printStudentInfo();
        student.printScores();
        student.printTotalAndAverage();
    }
}
