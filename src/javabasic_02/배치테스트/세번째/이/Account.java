package javabasic_02.testtest.세번째.이;

public class Account {
    private String accNo;
    private int balance;


    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.println(accNo + " 계좌가 개설되었습니다.");
    }

    public String getAccNo() {
        return accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void save(int amount) {
        balance += amount;
        System.out.println(accNo + " 계좌에 " + amount + "만원이 입금되었습니다.");
    }

    public void deposit(int amount) {
        balance -= amount;
        System.out.println(accNo + " 계좌에 " + amount + "만원이 출금되었습니다.");
    }
}
