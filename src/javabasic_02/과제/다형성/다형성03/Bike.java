package javabasic_02.과제.다형성.다형성03;

public class Bike extends Wheeler {

    public Bike(String carName, int velocity, int wheelNumber) {
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        velocity += speed;
        if (velocity > 40) {
            velocity = 40;
        }
        System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");
    }

    @Override
    public void speedDown(int speed) {
        velocity -= speed;
        if (velocity < 10) {
            velocity = 10;
        }
        System.out.println(carName + "의 최저속도유지로 속도를 " + velocity + "으로 올립니다.");
    }
}