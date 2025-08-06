package javabasic_02.testtest.세번째.일;

public class Emp {
    private String id;            // 사원번호
    private String name;          // 사원 이름
    private int baseSalary;       // 기본급

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalry(int baseSalary) {  // 문제에서 setBaseSalry라고 써서 그대로 맞춤 (실제로는 setBaseSalary가 맞음)
        this.baseSalary = baseSalary;
    }


    public double getSalary(double bonus) {
        return baseSalary + baseSalary * bonus;
    }

    @Override
    public String toString() {
        return name + "(" + id + ") 사원의 기본급은 " + baseSalary + "원 입니다.";
    }
}
