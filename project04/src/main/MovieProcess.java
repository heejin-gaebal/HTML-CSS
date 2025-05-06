package main;

import java.util.Scanner;
import member.Member;
import movie.MovieData;
public class MovieProcess {
	Scanner sc = new Scanner(System.in);
	private String userId ="";
	AdminMenu adminMenu = new AdminMenu();
//	MemberMenu memberMenu = new MemberMenu();

	public void movieRecommender() {
		System.out.println("<★★★ HJ Play ★★★>");

		while(true) {
			login();	
			if(userId.equals("admin")) {
				adminMenu.moiveMenu1();		// 관리자메뉴
			}else{
				adminMenu.moiveMenu2();	// 회원메뉴
			}
			
			System.out.println("다시 로그인하시겠습니까? (Y/N)");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("Y")) {
            	movieRecommender();
            }else if (choice.equalsIgnoreCase("N")) {
                System.out.println("해당 프로그램을 종료합니다.");
            }
            break;
		}
	}
	
	//회원로그인
	public void login() {
		System.out.println("로그인 정보를 입력하세요");
		System.out.print("아이디 : ");
		userId = sc.nextLine();
		System.out.print("패스워드 : ");
		int userPw = Integer.parseInt(sc.nextLine());
		
		Member member = new Member(userId, userPw);
		System.out.println(member);
	}
	
}