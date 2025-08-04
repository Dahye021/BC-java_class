package javabasic_03.oop;

public class StudentMain {
    public static void main(String[] args) {
        Student 다혜 = new Student();
        Student 예원 = new Student("전예원", "12345");
        Student 형근 = new Student("김형근", 27, "경기도 의정부시", "1234567");
        Student 기웅 = new Student("박기웅", 25, "서울시 강남구", "12345678");

        System.out.println(다혜.toString());
        System.out.println(예원.toString());
        System.out.println(형근.toString());
        System.out.println(기웅.toString());
        System.out.println(기웅.getStu_name());
        System.out.println(기웅.getAddress());
        String 기웅주소 = 기웅.getAddress();
        System.out.println(기웅주소 + "살고있습니다.");
    }
}
