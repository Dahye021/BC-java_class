package javabasic_02.과제.다형성.다형성02.E02;

public class Video extends Content {
    private String genre;

    // title과 genre를 매개변수로 받는 생성자
    public Video(String title, String genre) {
        super(title); // Content의 생성자 호출
        this.genre = genre;
    }

    // genre에 따라 price 설정
    @Override
    public void totalPrice() {
        if (genre.equals("new")) {
            setPrice(2000);
        } else if (genre.equals("comic")) {
            setPrice(1500);
        } else if (genre.equals("child")) {
            setPrice(1000);
        } else {
            setPrice(500);
        }
    }

    // getter / setter
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}