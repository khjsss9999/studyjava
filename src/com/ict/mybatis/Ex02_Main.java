package com.ict.mybatis;

import java.util.List;
import java.util.Scanner;

public class Ex02_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Ex02_VO> list = Ex02_DAO.getList();
		prn(list);
		
		System.out.println("선택하세요");
		System.out.println("1. members테이블 특정 데이터 보기");
		System.out.println("2. members테이블 데이터 삽입");
		System.out.println("3. members테이블 데이터 삭제");
		System.out.println("4. members테이블 데이터 수정");
		System.out.print(">>>>>>>>>>>>>>>>>>>   ");
		int menu  = scan.nextInt();
		switch (menu) {
		case 1:
			System.out.print("검색할 idx : ");
			String idx = scan.next();
			Ex02_VO vo = Ex02_DAO.getOne(idx);
			prn(vo);
			break;
		
		case 2:
			System.out.println("삽입할 정보를 입력하세요");
			System.out.print("번호 : ");
			String idx2 = scan.next();
			System.out.print("아이디 : ");
			String id2 = scan.next();
			System.out.print("패스워드 : ");
			String pw2 = scan.next();
			System.out.print("유저네임 : ");
			String username2 = scan.next();
			System.out.print("나이 : ");
			String age2 = scan.next();
			System.out.print("생성날짜 : ");
			String regdate2 = scan.next();
			
			int result = Ex02_DAO.getIns(new Ex02_VO(idx2, id2, pw2, username2, age2, regdate2));
			if(result>0) {
			List<Ex02_VO> list2 =	Ex02_DAO.getList();
			
			prn(list2);
				
			}else {
				System.out.println("삽입실패");
			}
			
			break;
			
		case 3:
			System.out.println("삭제할 idx : ");
			String idx3 = scan.next();
			Ex02_VO vo3 = new Ex02_VO();
			vo3.setIdx(idx3);
			
			int result3 = Ex02_DAO.getDel(vo3);
			if(result3 > 0) {
			List<Ex02_VO> list3 =	Ex02_DAO.getList();
			prn(list3);
			}else {
				System.out.println("삭제 실패");
			}
			
			
			break;
		
		case 4:
			System.out.println("수정할 정보를 입력하세요");
			System.out.print("번호 : ");
			String idx4 = scan.next();
			System.out.print("아이디 : ");
			String id4 = scan.next();
			System.out.print("패스워드 : ");
			String pw4 = scan.next();
			System.out.print("유저네임 : ");
			String username4 = scan.next();
			System.out.print("나이 : ");
			String age4 = scan.next();
			System.out.print("생성날짜 : ");
			String regdate4 = scan.next();
			
		int result4 =	Ex02_DAO.getUp(new Ex02_VO(idx4, id4, pw4, username4, age4, regdate4));
			if(result4>0) {
			List<Ex02_VO> list4 = 	Ex02_DAO.getList();
			prn(list4);
			}else {
				System.out.println("수정실패");
			}
			break;

		}
	}
	
	public static void prn(List<Ex02_VO> list) {
		System.out.println("번호\t아이디\t패스워드\t유저네임\t나이\t생성날짜");
		for (Ex02_VO k : list) {
			System.out.print(k.getIdx()+"\t");
			System.out.print(k.getId()+"\t");
			System.out.print(k.getPw()+"\t");
			System.out.print(k.getUsername()+"\t");
			System.out.print(k.getAge()+"\t");
			System.out.print(k.getRegdate()+"\n");
		}
	}
	
	public static void prn(Ex02_VO vo) {
		System.out.println("번호\t아이디\t패스워드\t유저네임\t나이\t생성날짜");
		System.out.print(vo.getIdx()+"\t");
		System.out.print(vo.getId()+"\t");
		System.out.print(vo.getPw()+"\t");
		System.out.print(vo.getUsername()+"\t");
		System.out.print(vo.getAge()+"\t");
		System.out.print(vo.getRegdate()+"\n");
	}
	
}

