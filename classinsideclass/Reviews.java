package classinsideclass;

public class Reviews {
	int id;
	String desc;
	int rating;
	
	public Reviews(int id, String desc, int rating) {
		super();
		this.id = id;
		this.desc = desc;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
