package javabasic_02.testtest.세번째.삼;

public class Bird {
    protected String name;
    protected int legs;
    protected int length;

    public void setName(String name) {

        this.name = name;
    }

    public void fly() {
    }

    public void sing() {

        System.out.println(getSpeciesName() + "(" + name + ")가 소리칩니다.");
    }

    @Override
    public String toString() {

        return getSpeciesName() + "의 이름은 " + name + " 입니다.";
    }

    protected String getSpeciesName() {

        return "조류";
    }
}
