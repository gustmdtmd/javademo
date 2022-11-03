package project_01;

public class BookDTO {
	private int num;
	private String title;
	private String author;
	
	public BookDTO() {
	
	}

	public BookDTO(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
