package OOPS;

public class Reviews {
	
	
	private String Comments,reviewerName;
	
	public Reviews(String comments,String name)
	{
		this.Comments=comments;
		this.reviewerName=name;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public String getReviewerName() {
		return reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}

	@Override
	public String toString() {
		return "Reviews [Comments=" + Comments + ", reviewerName=" + reviewerName + "]";
	}
	
	
	
	
	

}
