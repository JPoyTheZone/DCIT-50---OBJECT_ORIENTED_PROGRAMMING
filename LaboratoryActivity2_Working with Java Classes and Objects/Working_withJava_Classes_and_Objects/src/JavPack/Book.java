package JavPack;

public class Book {
	
	String title;
	String author;
	int year_published;
	int current_page=0;
	
	//Constructor
	Book(String Title,String Author,int yearPublished){
		title = Title;
		author = Author;
		year_published = yearPublished;
	}
	
	
	void displayDetails() {
		System.out.println(title+", Author: "+author+", Year: "+year_published+" Current Page: "+current_page);

	}
	
	public Object changePage(int Target_Page) {
		this.current_page = Target_Page;
		return this;
	}
	
	public Object ChangeAuthor(String Author) {
		this.author = Author;
		return this;
	}
	
	public Object ChangeTitle(String Title) {
		this.title = Title;
		return this;
	}
	
	public Object yearPublished(int yearPublished) {
		this.year_published = yearPublished;
		return this;
	}
}
