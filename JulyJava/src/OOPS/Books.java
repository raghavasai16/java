package OOPS;

import java.util.ArrayList;

public class Books {

	private int id,rating;
	private String author;
	private ArrayList<Reviews> as = new ArrayList<Reviews>();
	
	public Books(int id,String author)
	{
		this.id=id;
		this.author=author;
	}

	public int getRating() {
		return rating;
	}
	
	public void Addreview(Reviews res) {
		this.as.add(res);
	}
	

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", rating=" + rating + ", author=" + author + "]"+as;
	}
	
	
}
