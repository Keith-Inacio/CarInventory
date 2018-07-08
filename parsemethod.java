import java.util.ArrayList;
import java.util.List;

public class parsemethod{
	int id;
	String make;
	String model;
	int year;
	private List<parsemethod> cars = new ArrayList<parsemethod>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<parsemethod> getCars() {
		return cars;
	}

	public void setCars(List<parsemethod> cars) {
		this.cars = cars;
	}
}
