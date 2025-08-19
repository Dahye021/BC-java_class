package javabasic_02.day18.class05;

public interface Operate {
    //추상메서드
    int operate(int a, int b);
    //디폴트 메서드
    default void print(){
        System.out.println("print");
    }
}
