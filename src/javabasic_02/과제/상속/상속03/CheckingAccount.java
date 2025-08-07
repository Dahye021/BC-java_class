package javabasic_02.과제.상속.상속03;

public class CheckingAccount extends Account {
    private String cardNo;

    // 생성자
    public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
        super(accId, balance, ownerName);
        this.cardNo = cardNo;
    }

    // pay 메서드
    public void pay(String cardNo, long amount) {
        if (this.cardNo.equals(cardNo)) {
            if (getBalance() >= amount) {
                withdraw(amount);
            } else {
                System.out.println("지불이 불가능합니다.");
            }
        } else {
            System.out.println("지불이 불가능합니다.");
        }
    }

    // 추상 메서드 구현 (내용은 비워도 OK)
    @Override
    public void calcRate() {
        // CheckingAccount는 이자 계산 없음
    }

    // getter / setter for cardNo
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}