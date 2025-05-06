package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import movie.MovieData;

public class AdminMenu{
	private List<MovieData> movieArr = new ArrayList<MovieData>();
	MovieData movieData = new MovieData();
	
	Scanner sc = new Scanner(System.in);
	
	public void moiveMenu1() {
		while(true) {
			System.out.println("\n관리자 메뉴를 고르세요");
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 영화 등록");
			System.out.println("2. 영화 전체목록");
			System.out.println("3. 영화 상세정보");
			System.out.println("4. 영화 수정");
			System.out.println("5. 영화 삭제");

			int menuNum = Integer.parseInt(sc.nextLine());
			this.menuProcess1(menuNum);

			if(menuNum == 0) {
				System.out.println("관리자 프로그램 종료 후 다시 로그인합니다.");
				return;
			}
		}
	}
	
	public void menuProcess1(int menuNum) {
		switch(menuNum) {  
		case 1: insertMovie(); break;
		case 2: movieList(); break;
		case 3: movieDetail(); break;
		case 4: updateMovie(); break;
		case 5: removeMovie(); break;
		}
	}
	
	//영화등록 - 관리자
	public void insertMovie() {
		System.out.println("영화를 등록하세요");
		System.out.print("영화 제목 : ");
		String movieName = sc.nextLine();
		
		System.out.print("영화 감독 : ");
		String movieDirector = sc.nextLine();
		
		System.out.print("영화 장르 : ");
		String movieGenre = sc.nextLine();
		
		System.out.print("영화 추천도 : ");
		int movieRate = Integer.parseInt(sc.nextLine());
		
		MovieData movieAdmin = new MovieData(
				movieName, movieDirector, movieGenre, movieRate);
		
		movieArr.add(movieAdmin);
		
		System.out.println("영화 등록 완료!!");
	}
	
	//영화전체목록 - 관리자
	public void movieList() {		
		for(int i=0; i<movieArr.size(); i++) {
			System.out.println(movieArr.get(i).getMovieName());
		}
	}
	
	//영화상세정보 - 관리자
	public void movieDetail() {
		System.out.println("상세정보를 확인할 영화를 선택하세요.");
		movieList();

		int menuNum = Integer.parseInt(sc.nextLine());
		System.out.println(movieArr.get(menuNum));
	}
	
	public void updateMovie() {
		System.out.println("수정할 영화를 선택하세요.");
		movieList();
		
		int menuNum = Integer.parseInt(sc.nextLine());
		System.out.println(movieArr.get(menuNum));
		
		System.out.print("영화 제목 : ");
		String movieName = sc.nextLine();
		
		System.out.print("영화 감독 : ");
		String movieDirector = sc.nextLine();
		
		System.out.print("영화 장르 : ");
		String movieGenre = sc.nextLine();
		
		System.out.print("영화 추천도 : ");
		int movieRate = Integer.parseInt(sc.nextLine());
		
		MovieData movie = movieArr.get(menuNum); 
		movie.setMovieName(movieName);
		movie.setMovieDirector(movieDirector);
		movie.setMovieGenre(movieGenre);
		movie.setMovieRate(movieRate);
		
		System.out.println("영화 정보 수정완료!!");
	}
	
	public void removeMovie() {
		System.out.println("삭제할 영화를 선택하세요.");
		movieList();
		
		int menuNum = Integer.parseInt(sc.nextLine());
		movieArr.remove(menuNum);
		
		System.out.println("해당영화 삭제완료");
	}
	
	//////////////////	회원메뉴  //////////////////
	
	public void moiveMenu2() {
		while(true) {
			System.out.println("\n원하는 메뉴를 고르세요");
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 최신영화 검색");
			System.out.println("2. 영화감독 검색");
			System.out.println("3. 장르별 검색");

			int menuNum = Integer.parseInt(sc.nextLine());
			this.menuProcess2(menuNum);
			
			if(menuNum == 0) {
				System.out.println("사용자 프로그램 종료 후 다시 로그인합니다.");
				return;
			}
		}
	}
	public void menuProcess2(int menuNum) {
		switch(menuNum) {  
		case 1: newMovie(); break;
		case 2: MovieDirec(); break;
		case 3: genreMovie(); break;
		}
	}
	
	public void newMovie() {
		System.out.println("최신영화 목록입니다.");
		for(int i=0; i<movieArr.size(); i++) {
			System.out.println(i + ". " + movieArr.get(i).getMovieName());
		}
		
		System.out.println("상세 정보를 볼 영화 번호를 입력하세요: ");
	    int menuNum = Integer.parseInt(sc.nextLine());
		System.out.println(movieArr.get(menuNum));
	}

	public void MovieDirec() {
		System.out.println("영화감독 목록입니다.");
		for(int i=0; i<movieArr.size(); i++) {
			System.out.println(i + ". " + movieArr.get(i).getMovieDirector());
		}
		System.out.println("상세 정보를 볼 영화 번호를 입력하세요: ");
	    int menuNum = Integer.parseInt(sc.nextLine());
		System.out.println(movieArr.get(menuNum));
	}

	public void genreMovie() {
		System.out.println("장르영화 목록입니다.");
		for(int i=0; i<movieArr.size(); i++) {
			System.out.println(i + ". " + movieArr.get(i).getMovieGenre());
		}
		System.out.println("상세 정보를 볼 영화 번호를 입력하세요: ");
	    int menuNum = Integer.parseInt(sc.nextLine());
		System.out.println(movieArr.get(menuNum));
	}
}
