package javabasic_02.day18.Class;
//연산식을 추상화한 인터페이스
@FunctionalInterface
public interface Operate {
    int operate(int a, int b);
}
