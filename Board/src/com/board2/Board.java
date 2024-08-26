package com.board2;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {

	int count = 0;

	ArrayList<Post> posts = new ArrayList<Post>();

	void run() {

		Scanner sc = new Scanner(System.in);
		xx: while (true) {
			System.out.println("[1. 리스트 / 2. 읽기 / 3. 쓰기 / 4. 수정 / 5. 삭제 / e. 종료 ]");
			String cmd = sc.next();

			switch (cmd) {

			case "1":

				// 리스트
				System.out.println("============리스트임============");
				for (Post p : posts) {

					p.info();
				}
				System.out.println("------------------------------");
				break;
			case "2":

				// 읽기

				System.out.println("읽으실 글 번호를 선택하여 주십시오.");
				int selectNo = sc.nextInt();
				for (Post p : posts) {

					if (p.no == selectNo) {

						p.infoForRead();
					}

				}
				break;
			case "3":
				// 쓰기
				System.out.println("쓰기임");

				System.out.println("글제목:");
				String title = sc.next();
				System.out.println("글쓴이:");
				String writer = sc.next();
				System.out.println("글내용:");
				String content = sc.next();

				count = count + 1;
				Post p = new Post(count, title, writer, content);
				posts.add(p);
				break;

			case "4":
				// 수정
				System.out.println("-----------------------수정-----------------------");
				System.out.println("수정할 글 번호를 입력하세요:");
				int selectNo3 = sc.nextInt();

				for (Post p1 : posts) {

					if (p1.no == selectNo3) {

						System.out.println("=============================================");
						System.out.println(p1.content);
						System.out.println("--------------------------------------------");
						String newContent = sc.next();
						break;

					}

				}

				break;

			case "5":
				// 삭제
				System.out.println("삭제할 글 번호를 입력해주세요:");
				int selectNoForDel = sc.nextInt();

				int searchIndex = -1;
				for (int i = 0; i < posts.size(); i = i + 1) {

					Post pp = posts.get(i);

					if (pp.no == selectNoForDel) {

						System.out.println("삭제되었습니다.");
						searchIndex = i;
						break;
					}
				}
				posts.remove(searchIndex);
				break;

			case "e":
				// 종료
				System.out.println("종료임");
				break;

			default:
				break xx;
			}

		}

	}

}
