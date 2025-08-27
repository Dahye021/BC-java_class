package java_advanced.day22.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;

public class CreateJsonEx {
    public static void main(String[] args) {
        //1. JSON 객체 생성
        JSONObject root = new JSONObject();

        //2. 속성 추가
        root.put("id","DH");
        root.put("name","김다혜");
        root.put("password","1234");

        //3. 복합 속성  추가
        JSONObject tel = new JSONObject();
        tel.put("home","010-1111-1414");
        tel.put("mobile","010-1255-1414");
        root.put("tel",tel);

        JSONArray skill = new JSONArray();
        skill.put("Java");
        skill.put("html");
        skill.put("JPA");
        root.put("skill",skill);

        //4. JSON 얻기
        String json = root.toString();

        //5. 콘솔에 출력
        System.out.println(json);

        //6. 파일에 출력
        try (Writer writer = new FileWriter("dh.json",Charset.forName("UTF-8"))){
            writer.write(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
