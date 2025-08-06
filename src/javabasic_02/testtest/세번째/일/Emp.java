package javabasic_02.testtest.세번째.일;

public class Emp {
    private String id;            // 사원번호
    private String name;          // 사원 이름
    private int baseSalary;       // 기본급

    // id getter/setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    // name getter/setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // baseSalary getter/setter (메서드명 오타 주의)
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalry(int baseSalary) {  // 문제에서 setBaseSalry라고 써서 그대로 맞춤 (실제로는 setBaseSalary가 맞음)
        this.baseSalary = baseSalary;
    }

    // 사원번호 변경 메서드 setId, 사원번호 반환 메서드 getId 이미 구현됨

    // 이름 변경 setName, 이름 반환 getName도 이미 구현됨

    // 기본급 반환 getBaseSalary 구현됨

    // 봉급 계산 메서드: bonus를 받아 기본급 + 기본급 * bonus 계산
    public double getSalary(double bonus) {
        return baseSalary + baseSalary * bonus;
    }

    // toString() 메서드 오버라이드 - 문제 조건에 맞게 문자열 반환
    @Override
    public String toString() {
        return name + "(" + id + ") 사원의 기본급은 " + baseSalary + "원 입니다.";
    }
}
