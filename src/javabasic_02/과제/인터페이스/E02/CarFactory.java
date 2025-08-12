package javabasic_02.과제.인터페이스.E02;

public class CarFactory extends Factory implements IWorkingTogether {

    public CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        int skillValue;
        switch (skill) {
            case 'A': skillValue = 3; break;
            case 'B': skillValue = 2; break;
            case 'C': skillValue = 1; break;
            default: skillValue = 0;
        }
        return skillValue * getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        if (partner instanceof CarFactory) {
            // 파트너 공장의 기술력 'B' 기준
            return ((CarFactory) partner).makeProducts('B');
        }
        return 0;
    }
}
