package javabasic_02.day17.mapEx;

public class Properties {
    public static void main(String[] args) {
        Properties p = new Properties();

        p.load(PropertiesEx.class.getResourceAsStream("databass.properties"));

        String driver = p.getProperty("driver");
        System.out.println(driver);
    }
}
