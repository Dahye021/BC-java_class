package Assignment.TeamProject.Sutdent03team;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StudentInput implements Serializable {
    //student.dat에 HashMap<String, Student>형태로 직렬화 해서 저장
    HashMap<String, Student> studentInfo = new HashMap<>();
    File file = new File("C:Temp/student.dat");

    private class Helper {

        //파일 확인, 불러오기 - 다시 이해
        void loadCheck() {
            try {
                if (file.exists()) {
                    //파일 열기
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    //파일 안에 있던 HashMap을 꺼내서 메모리로 가져오기
                    studentInfo = (HashMap<String, Student>) ois.readObject();
                    ois.close();
                    fis.close();
                } else{
                    //파일 없으면 새 HashMap생성
                    studentInfo = new HashMap<>();
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                studentInfo = new HashMap<>();
            }
        }

        //사용법 안내
        void printUsage() {
            System.out.println("이름을 입력하세요.");
            System.out.println("점수는 0~100만 가능합니다.");
            System.out.println("q,Q 입력시 종료");
        }

        //입력한 데이터 검증
        void checkkeyAndInputData() {
            Scanner in = new Scanner(System.in);

            while (true) {
                String name = in.nextLine();
                if (name.equalsIgnoreCase("q")) {
                    break;
                }
                if (studentInfo.containsKey(name)) {
                    System.out.println("이미 존재하는 이름입니다. 다시 입력하세요.");
                    continue;
                }
                List<Integer> scores = new ArrayList<>();
                String[] subjects = {"국어", "영어" ,"수학", "과학"};

                for (String subject : subjects) {
                    int score;
                    while (true) {
                        System.out.print(subject + "점수 입력 (0~100) : ");
                        score = in.nextInt();
                        in.nextLine();

                        if (score < 0 || score > 100) {
                            scores.add(score);
                            break;
                        } else {
                            System.out.println("점수는 0~100 범위만 가능합니다. 다시 입력하세요.");
                        }
                    }
                }
                Student student = new Student(name, scores);

                studentInfo.put(name, student);

                System.out.println("학생 정보 저장 완료 = " + student);
            }
        }

        //HashMap 저장
        void saveData() {

        }
    }

}
