package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import movie.MovieData;


//public class MemberMenu{
//	
//	Scanner sc = new Scanner(System.in);
//	public void moiveMenu2() {
//		System.out.println("\n원하는 메뉴를 고르세요");
//		System.out.println("0. 프로그램 종료");
//		System.out.println("1. 최신영화 검색");
//		System.out.println("2. 장르별 검색");
//		System.out.println("3. 영화감독 검색");
//		System.out.println("4. 영화추천순 영화");
//
//		int menuNum = sc.nextInt();
//		this.menuProcess(menuNum);
//		
//		if(menuNum == 0) {
//			System.out.println("프로그램 종료 후 다시 로그인합니다.");
//		}
//	}
//
//	public void menuProcess(int menuNum) {
//		switch(menuNum) {  
//		case 1: newMovie(); break;
//		case 2: genreMovie(); break;
//		case 3: MovieDirec(); break;
//		case 4: reviewMovie(); break;
//		}
//	}
//	
//	public void newMovie() {
//		System.out.println("최신영화 목록입니다.");
//		for(int i=0; i<movieArr.size(); i++) {
//			System.out.println(movieArr.get(i).getMovieName());
//		}
//	}
//
//	public void genreMovie() {
//		System.out.println("장르영화 목록입니다.");
//		
//	}
//	public void MovieDirec() {
//		System.out.println("영화감독 목록입니다.");
//
//	}
//	public void reviewMovie() {
//		System.out.println("추천순 목록입니다.");
//
//	}
//}
