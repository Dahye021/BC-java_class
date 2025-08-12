package javabasic_02.과제.인터페이스.E02;

public abstract class Factory {
    private String name;
    private int openHour;
    private int closeHour;

    public Factory(String name, int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    public String getFactoryName() {
        return name;
    }

    public int getWorkingTime() {
        return closeHour - openHour;
    }

    public abstract int makeProducts(char skill);
}
