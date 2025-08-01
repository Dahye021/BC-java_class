package javabasic_02.day08;

public class RefEx01 {
    public static void main(String[] args) {
        String refVar1 = null;
        String refVar2 = null;
        
        refVar1 = new String("자바");
        refVar2 = "자바";
        String refvar3 = "자바";
        String refVar4 = null;

        System.out.println(refVar1 == refVar2);         //번지수가 같은지 비교
        System.out.println(refVar1 == refvar3);
        System.out.println(refVar2 == refvar3);
        System.out.println(refVar1.equals(refVar2)); //.equals() = 안에 들어가있는 값 비교

        System.out.println(refVar4);
        System.out.println(refVar4.length());
    }
}
