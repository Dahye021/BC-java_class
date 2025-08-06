package javabasic_02.testtest.세번째.삼;

public class Duck extends Bird {

    @Override
    public void fly() {
        System.out.println("오리(" + name + ")는 날지 않습니다.");
    }

    @Override
    protected String getSpeciesName() {
        return "오리";
    }
}
