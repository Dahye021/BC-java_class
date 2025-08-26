package javabasic_04.day22.serialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

class User {
    private String name;
    private int age;
}
@NoArgsConstructor
@AllArgsConstructor
@Data
class Product {
    private String pname;
    private int price;
}

public class ObjectInOutEx {
    public static void main(String[] args) throws Exception {
        //1. C:/Temp/object.dat 에 파일 객체에 파일입력스트림 객체를 생성해주세요
        FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
        //2. 생성된 파일 입력 스트림 객체에 객체 출력 스트림 객체를 끼워(연결)주세요
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //3. 객체 생성
        User user = new User("신세계", 20);
        Product product = new Product ("삼성노트북", 150000000);
        int[] arr1 = {10,20,30};
        List<Product> products = Arrays.asList(product);

        //4. 위 4개의 객체를 object.dat파일에 저장
        oos.writeObject(products);
        oos.writeObject(arr1);
        oos.writeObject(user);
        oos.writeObject(product);

        //5.
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        //파일에서 읽어서 객체를 복원시켜주세요.  ObjectInputStream
        FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        try{
            while(true){
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        } catch (EOFException e){
            System.out.println("파일의 끝");
        } finally {
            ois.close();
            fis.close();
        }


//        List<Product> products2 = (List<Product>) ois.readObject();
//        int[] readArr = (int[]) ois.readObject();
//        User[] readUsers = (User[]) ois.readObject();
//        Product[] readProducts = (Product[]) ois.readObject();
//
//        ois.close();
//        fis.close();
    }
}
