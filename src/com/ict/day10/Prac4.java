package com.ict.day10;

import java.util.Scanner;

public class Prac4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);   // 스캐너를 사용하기 위하여 생성
		// 0. 가위 1.바위 2.보 가위 바위 보 게임
		// 게임을 시작할지 물어보고 게임을 시작하면 컴퓨터의 수를
		// 랜덤으로 띄우고 그걸 가위,바위,보로 따로 저장하고
		// 유저가 선택을 하여 유저의 번호도 저장하고 가위,바위,보도
		// 따로 저장을 하여 서로 같은지 이기는지 지는지를
		// 비교하여 비기면 다시하고 이기면 승수가 올라가고
		// 지면 패가 올라가며 다시할지를 묻고 yes를 선택하면
		// 다시 컴퓨터의 수를 랜덤으로 정하고 유저가 다시
		// 가위,바위,보를 선택하며 경기 수가 저장되고 승,패도
		// 저장이 된다.

		int winCount = 0;		// 유저가 승리한 횟수를 저장하는 변수 
		int lostCount = 0;		// 유저가 패배한 횟수를 저장하는 변수
		int com = 0;   			// 컴퓨터가 고른 정수를 저장하는 변수. 이것을 따로 가위,바위,보 문자로 변경하는 작업을 거칠 예정.
		boolean re = false;
		String comRes = "";		// 컴퓨터가 가위,바위,보 중에서 고른 것을 문자로 저장하는 변수
		String userRes = "";    //  유저가 가위,바위,보 중에서 고른 것을 문자로 저장하는 변수
		String startS = "";    // 게임을 시작할지 하지 않을지의 문자를 저장하는 변수
		System.out.print("게임을 시작하겠습니까? yes(y/Y), no(n/N) : ");
		game: while (true) {         // 게임 전체의 game 라벨을 붙인 while 반복문
			if(re == false) {           // re 는 true면 게임중.  초기값은 false인데 시작하자마자 true로 바꾼다.
				re = true;		// re가 게임중이기에 게임이 시작하면서 true로 바꿨음
				startS = scan.next();  // startS에 문자를 입력받는다
				
			}
			if (startS.equalsIgnoreCase("y")) {		// startS가 대문자 구별을 무시하고 y또는 Y인지를 묻는 조건문
				
				com = (int) (Math.random() * 3);   // Math.random()으로 생성된 0.0~0.9999..까지의 실수에 3을 곱하고 정수로 변환하면 0~2까지의 정수가 나옴
				if (com == 0) {		        // 컴이 0이면 
					comRes = "가위"; 			// 컴의 문자변수에 가위
				} else if (com == 1) {		// 컴이 1이면
					comRes = "바위";			// 컴의 문자변수에 바위
				} else if (com == 2) {		// 컴이 2이면 
					comRes = "보";			// 컴의 문자변수에 보 
				}
				sel: while (true) {		// 게임 반복문 안에 유저가 가위,바위,보를 선택하는 sel라벨의 while 반복문
					System.out.print("0.가위,1.바위,2.보를 선택하세요 : ");
					String selS = scan.next();  // selS 문자열형 지역변수를 생성하여 문자를 입력받음 
					if (selS.equals("0")) {		// selS가 문자 0이면  
						System.out.println("0.가위를 선택하셨습니다.");
						userRes = "가위";		// userRes 에 가위를 저장
						if (comRes.equals(userRes)) {  // comRes 와 userRes 가 같으면 비긴 것이기에
							System.out.println("com =" + comRes + ", user =" + userRes + " 서로 비겼습니다.");
							System.out.println("다시 선택하세요.");
							continue game; 	// game라벨의 while 반복문으로 되돌아가서 다시 실행
						}
						break sel;  // userRes가 가위인데 comRes와 userRes가 같지 않으면 sel라벨의 while반복문을 중단하고 빠져나감
					} else if (selS.equals("1")) {	// selS가 1이면
						System.out.println("1.바위를 선택하셨습니다.");
						userRes = "바위";	 	// userRes에 바위를 저장함
						if (comRes.equals(userRes)) {	// comRes와 userRes가 같으면 비긴 것이기에 
							System.out.println("com =" + comRes + ", user =" + userRes + " 서로 비겼습니다.");
							System.out.println("다시 선택하세요.");
							continue game;	// game 라벨의 while 반복문으로 되돌아가서 다시 실행
						}
						break sel;	// userRes가 바위인데 comRes와 userRes가 같지 않으면 sel라벨의 while반복문을 중단하고 빠져나감
					} else if (selS.equals("2")) {	// selS가 2이면
						System.out.println("2.보를 선택하셨습니다.");
						userRes = "보";   // userRes에 보를 저장함
						if (comRes.equals(userRes)) {  // comRes와 userRes가 같으면
							System.out.println("com =" + comRes + ", user =" + userRes + " 서로 비겼습니다.");
							System.out.println("다시 선택하세요.");
							continue game; // game 라벨의 while 반복문으로 되돌아가서 다시 실행
						}
						break sel;	// userRes가 보인데 comRes와 userRes가 같지 않으면 sel라벨의 while반복문을 중단하고 빠져나감
					} else {		// selS가 0 또는 1 또는 2가 아니면 .. 이것은 userRes가 가위 또는 바위 또는 보가 아니면 
						System.out.println("잘못 선택하셨습니다. 다시 선택하세요.");
						continue sel;	// 잘못 선택하였기에 sel라벨로 되돌아가서 유저가 가위, 바위, 보를 다시 선택함
					}
				}

			} else if (startS.equalsIgnoreCase("n")) {  // startS에 n을 저장했다면
				re = false;	 // re를 false로 바꿔 게임중인 것을 게임이 멈춘 것으로 초기화
				break game;  // game 라벨의 while 반복문을 중단하고 빠져나감 
			} else {	// startS가 n이 아니라면.. 결국 y 또는 Y도 아니고 n 또는 N도 아니라면
				System.out.print("잘못 선택하셨습니다. 다시입력하세요. yes.(y/Y) , no.(n/N)");
				re = false;	// re를 false로 바꿔 게임중인 것을 게임이 멈춘 것으로 초기화
				continue game;  // game 라벨의 while 반복문을 중단하고 빠져나감
			}
			// (0.가위가 2.보에 이기고 1.바위에 짐)(1.바위가 0.가위에 이기고 2.보에 짐)(2.보가 1.바위에 이기고 0.가위에 짐)
			if ((comRes.equals("가위") && userRes.equals("바위")) || (comRes.equals("바위") && userRes.equals("보"))
					|| (comRes.equals("보") && userRes.equals("가위"))) { // userRes가 승리한 경우의 조건
				System.out.println("com은 " + comRes + ", user는 " + userRes + " user가 이겼습니다.");
				winCount++; 	// winCount 1 증가로 승리 1 증가
				System.out.println((winCount+lostCount)+"판 "+winCount+"승"+lostCount+"패");
				System.out.print("다시 하시겠습니까? yes.(y/Y) , no.(n/N)");  // 승리하여 게임이 끝난 후에 다시할지를 묻는 출력문
				re = false;  // 승리하여 게임이 끝났기에 re를 false로 바꿔 게임이 끝났다고 초기화 시키고
				continue game; // game 라벨의 while반복문으로 되돌아가서 게임을 다시 할건지 물어봄

			} else if ((comRes.equals("가위") && userRes.equals("보")) || (comRes.equals("바위") && userRes.equals("가위"))
					|| (comRes.equals("보") && userRes.equals("바위"))) {  // userRes가 패배한 경우의 조건
				System.out.println("com은 " + comRes + ", user는 " + userRes + " user가 졌습니다.");
				lostCount++;  // lostCount를 1 증가로 패배 1 증가
				System.out.println((winCount+lostCount)+"판 "+winCount+"승"+lostCount+"패");
				System.out.println("다시 하시겠습니까? yes.(y/Y), no.(n/N)"); // 패배하여 게임이 끝난 후에 다시할지를 묻는 출력문
				re = false;  // 패배하여 게임이 끝났기에 re를 false로 바꿔 게임이 끝났다고 초기화 시키고
				continue game;	// game 라벨의 while반복문으로 되돌아가서 게임을 다시 할건지 물어봄

			}

		}
		// 게임을 완전히 종료한 후에 총 게임수, 유저가 승리한 횟수, 유저의 승리한 승률을 출력
		// 컴퓨터와 비긴 경우는 게임수에 포함하지 않고 계속 새로 고르게 하여 승리 하거나 패배할 경우에만 게임수를 1씩 증가시킴
		// 마찬가지로 잘못 선택한 경우에도 게임수에는 포함하지 않음
		System.out.println("수고하셨습니다. ");
		System.out.println("총 게임수는 " + (winCount+lostCount) + "판, 승수는 " + winCount + "판 입니다.");
		System.out.println("승률은 " + (int) ((winCount / ((winCount+lostCount) * 1.0)*100) * 10) / 10.0 + "퍼 입니다.");

	}
}