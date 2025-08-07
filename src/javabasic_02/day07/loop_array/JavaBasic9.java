package javabasic_02.day07.loop_array;

import java.util.Scanner;

public class JavaBasic9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = null;
        int studentCount = 0;
        boolean run = true;

        while (run) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------------");
            System.out.print("선택> ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("학생수> ");
                    try {
                        studentCount = Integer.parseInt(scanner.nextLine());
                        if (studentCount <= 0) {
                            System.out.println("학생 수는 1명 이상이어야 합니다.");
                        } else {
                            scores = new int[studentCount];
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("올바른 숫자를 입력하세요.");
                    }
                    break;

                case "2":
                    if (scores == null) {
                        System.out.println("먼저 학생 수를 입력하세요.");
                        break;
                    }
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]> ");
                        try {
                            scores[i] = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("숫자를 입력하세요.");
                        }
                    }
                    break;

                case "3":
                    if (scores == null) {
                        System.out.println("점수가 입력되지 않았습니다.");
                        break;
                    }
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]> " + scores[i]);
                    }
                    break;

                case "4":
                    if (scores == null) {
                        System.out.println("점수가 입력되지 않았습니다.");
                        break;
                    }
                    int max = scores[0];
                    int sum = 0;
                    for (int score : scores) {
                        if (score > max) max = score;
                        sum += score;
                    }
                    double avg = (double) sum / scores.length;
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + avg);
                    break;

                case "5":
                    System.out.println("프로그램 종료");
                    run = false;
                    break;

                default:
                    System.out.println("1~5 사이의 숫자를 입력하세요.");
            }
        }
    }
}