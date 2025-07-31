package java02.day07;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie1 = new Movie();

        movie1.movieTitle = "아바타";
        movie1.movieStartDay = "2022.12.14";
        movie1.actor = "제이크 설리";
        movie1.genre = "액션";
        movie1.runningTime = 192;
        movie1.movieLevel = "12세";
        
        Movie movie2 = new Movie();
        movie2.movieTitle = "좀비딸";

        Movie movie3 = new Movie();
        movie3.movieTitle = "노이즈";
        
        Movie[] movieList = new Movie[3];
        movieList[0] = movie1;
        movieList[1] = movie2;
        movieList[2] = movie3;

        System.out.printf("첫번째 영화 제목 %s\n", movie1.movieTitle);
        System.out.printf("두번째 영화 제목 %s\n", movie2.movieTitle);
        System.out.printf("세번째 영화 제목 %s\n", movie3.movieTitle);

        int i = 1;
        for (Movie movie : movieList) {
            System.out.println(i++ + "번째" + movie.movieTitle);
        }

        for (int j = 0; j < movieList.length; j++) {
            Movie movie = movieList[j];
            System.out.println(j + "번째" + movie.movieTitle);

        }
    }
}
