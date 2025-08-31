package Assignment.TeamProject.Sutdent03team;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class StudentOutput {
    private HashMap<String, Student> students = new HashMap<> ();
    private ArrayList<Student> datas = new ArrayList<> ();

    public void loadObjectFromFile(){
        //파일 읽어오기
        File file = new File("C:\\Temp\\student.dat");

        if (!file.exists()){
            System.out.println("[오류] 데이터 파일이 존재하지 않습니다.");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object obj = ois.readObject();

            if (obj instanceof HashMap){
                students = (HashMap<String, Student>) obj;
            } else {
                System.out.println("[오류] 파일 내용이 올바르지 않습니다.");
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("[오류] 파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("[오류] 파일 읽기 중 문제 발생 : " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("[오류] 클래스 정의를 찾을 수 없습니다.");
        }
    }

    //오름차순 정렬
    public void rearrangeData() {
        if (students == null || students.isEmpty()) {
            System.out.println("[알림] 등록된 학생 정보가 없습니다.");
            return;
        }

        datas = new ArrayList<>(students.values());

        datas.sort((s1, s2) -> {
            int cmp = Double.compare(s1.getAverage(), s2.getAverage());
            if (cmp == 0) return s1.getName().compareTo(s2.getName());
            return cmp;
        });
    }

    public void printInfo() {

    }

    public static void main(String[] args) {
        StudentOutput output = new StudentOutput();
        output.loadObjectFromFile();
        output.rearrangeData();
        output.printInfo();
    }
}
