package 과제;

public class MovieTicketApp {

	public static void main(String[] args) {
		
		ActionMovie am = new ActionMovie("범죄도시");
		HorrorMovie hm = new HorrorMovie("여고괴담");
		ComedyMovie cm = new ComedyMovie("극한직업");
		int sum = 0;
		sum += am.discountedPrice();
		sum += hm.discountedPrice();
	    sum += cm.discountedPrice();
		System.out.printf("총 예매 금액: %d원\n", sum);
	}
}

class Movie{
	public String name;
	public int price;
	public int discountPer;
	public Movie(String name) {
		this.name = name;
		this.discountPer = 1000;
		this.price = 10000 - discountPer;
	}
}

class ActionMovie extends Movie {
	public int discountPrice = 1000;
	public int discountedPrice() {
		return price - discountPrice;
	}
	public ActionMovie(String name) {
		super(name);
	}
}

class HorrorMovie extends Movie{
	public int discountPrice = 800;
	public int discountedPrice() {
		return price - discountPrice;
	}
	public HorrorMovie(String name) {
		super(name);
	}
}

class ComedyMovie extends Movie{
	public int discountPrice = 1500;
	public int discountedPrice() {
		return price - discountPrice;
	}
	public ComedyMovie(String name) {
		super(name);
	}
}
