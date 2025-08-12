package javabasic_02.과제.인터페이스.E02;

public class TVFactory extends Factory implements IWorkingTogether {

    public TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        int skillValue;
        switch (skill) {
            case 'A': skillValue = 8; break;
            case 'B': skillValue = 5; break;
            case 'C': skillValue = 3; break;
            default: skillValue = 0;
        }
        return skillValue * getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        if (partner instanceof TVFactory) {
            // 파트너 공장의 기술력 'C' 기준
            return ((TVFactory) partner).makeProducts('C');
        }
        return 0;
    }
}
