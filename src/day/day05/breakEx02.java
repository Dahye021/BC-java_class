package day.day05;

public class breakEx02 {
    public static void main(String[] args) {
        //반복문이 중첩이 되면 break를 사용시 가장 가까운 반복문만 종료

        Outter:
        for(char upper= 'A'; upper <= 'Z'; upper++){

            for (char lower = 'a'; lower <= 'z'; lower++){
                System.out.println(upper + " - " + lower);
                if (lower == 'k'){
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
