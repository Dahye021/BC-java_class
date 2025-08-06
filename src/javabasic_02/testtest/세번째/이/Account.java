package javabasic_02.testtest.세번째.이;

public class Account {
    private String accNo;   // 계좌번호
    private int balance;    // 잔고 (단위: 만원)

    // 계좌번호 설정
    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.println(accNo + " 계좌가 개설되었습니다.");
    }

    // 계좌번호 반환
    public String getAccNo() {
        return accNo;
    }

    // 잔고 반환
    public int getBalance() {
        return balance;
    }

    // 입금
    public void save(int amount) {
        balance += amount;
        System.out.println(accNo + " 계좌에 " + amount + "만원이 입금되었습니다.");
    }

    // 출금
    public void deposit(int amount) {
        balance -= amount;
        System.out.println(accNo + " 계좌에 " + amount + "만원이 출금되었습니다.");
    }
}
