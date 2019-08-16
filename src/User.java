import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String phone;
	List<Car> cars =new ArrayList<>();
	
	public User(String name) {
		super();
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public void addCar(Car c) {
		this.cars.add(c);
	}
	public void removeCar(Car c) {
		if(this.cars.contains(c)) {
			this.cars.remove(c);
		}
	}

	@Override
	public String toString() {
		return "------------------------------\nUser [name=" + name + ",\n\t phone=" + phone + ",\n\t cars=" + cars + "\n]";
	}
	
}
