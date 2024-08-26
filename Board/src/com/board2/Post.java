package com.board2;

public class Post {

	int no = 0;
	String title;
	String writer;
	String content;

	public Post(int no, String title, String writer, String content) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	void info() {

		String s = String.format("글번호:%s 글쓴이:%s 글제목:%s", no, writer, title);
		System.out.println(s);
	}

	void infoForRead() {

		String s = String.format("글번호:%d 글쓴이:%s 글제목:%s", no, writer, title);
		System.out.println(s);
		System.out.println("---------------------------------------------");
		System.out.println(content);
		System.out.println("---------------------------------------------");

	}

}
