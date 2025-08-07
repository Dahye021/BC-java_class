package javabasic_02.day07.loop_array;

public class JavaBasic1 {
    public static void main(String[] args) {
        String grade = "B";

        int score1 = switch (grade){
            case "A" -> 100;
            case "B" -> 100 - 20;
            default -> 60;
        };
        System.out.println("점수 : " + score1);
    }
}
