package exsample_sort;

public class Bus implements Comparable<Bus>{
	private int id;
	private String name;
	private double fare;
	private float ratings;

	public Bus()

	{
	}
	
	
	

	public Bus(int id, String name, double fare, float ratings) {
		super();
		this.id = id;
		this.name = name;
		this.fare = fare;
		this.ratings = ratings;
	}




	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + ", fare=" + fare + ", ratings=" + ratings + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}




	@Override
	public int compareTo(Bus o) {
		Integer i1=this.id;
		Integer i2=o.id;
		// TODO Auto-generated method stub
		return i1.compareTo(i2);
	}

}
