package Assignment.TeamProject.Sutdent03team;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.TreeSet;

public class SortedStudent {
    private HashMap<String, Student> students = new HashMap<>();
    private TreeSet<Student> sortedSet; //treeset 자동정렬되는 자료구조

    //1. student.dat읽기
    public void loadObjectFromFile() {
        File file = new File("C:/Temp/student.dat");

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        if (!file.exists()) {
            System.out.println("[오류] student.dat 파일이 존재하지 않습니다.");
            return;
        }

        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            Object obj = ois.readObject();
            //hashmap인지 확인 후 맞으면 저장
            if (obj instanceof HashMap) {
                students = (HashMap<String, Student>) obj;
            } else {
                System.out.println("[오류] 파일 내용이 올바르지 않습니다.");
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }

}
