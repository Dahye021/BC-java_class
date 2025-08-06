package javabasic_02.testtest.세번째.삼;

public class Bird {
    protected String name;
    protected int legs;
    protected int length;

    public void setName(String name) {
        this.name = name;
    }

    public void fly() {
        // 자식 클래스에서 override
    }

    public void sing() {
        System.out.println(getSpeciesName() + "(" + name + ")가 소리칩니다.");
    }

    @Override
    public String toString() {
        return getSpeciesName() + "의 이름은 " + name + " 입니다.";
    }

    // 자식 클래스에서 종 이름 제공
    protected String getSpeciesName() {
        return "조류";
    }
}
