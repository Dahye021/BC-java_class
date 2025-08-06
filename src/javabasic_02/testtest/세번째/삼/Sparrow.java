package javabasic_02.testtest.세번째.삼;

public class Sparrow extends Bird {

    @Override
    public void fly() {
        System.out.println("참새(" + name + ")가 날아갑니다.");
    }

    @Override
    protected String getSpeciesName() {
        return "참새";
    }
}
