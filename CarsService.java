package service;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import model.Cars;

@Service
public class CarsService {

	Hashtable<String, Cars> cars = new Hashtable<String, Cars>();

	public CarsService(){

	Cars pace = new Cars();
	pace.setId(1);
	pace.setMake("BMW");
	pace.setModel("Z4");
	pace.setYear(2007);
	cars.put("1", pace);

	pace = new Cars();
	pace.setId(2);
	pace.setMake("Aston Martin");
	pace.setModel("DBS Superleggera");
	pace.setYear(2018);
	cars.put("2", pace);

	pace = new Cars();
	pace.setId(3);
	pace.setMake("Lamborghini");
	pace.setModel("Murcielago");
	pace.setYear(2014);
	cars.put("3", pace);

	pace = new Cars();
	pace.setId(4);
	pace.setMake("Ferrari");
	pace.setModel("488 Spider");
	pace.setYear(2016);
	cars.put("4", pace);

	pace = new Cars();
	pace.setId(5);
	pace.setMake("Mclaren");
	pace.setModel("675 LT");
	pace.setYear(2018);
	cars.put("5", pace);

	pace = new Cars();
	pace.setId(6);
	pace.setMake("Mercedes-Benz");
	pace.setModel("AMG GT Coupe");
	pace.setYear(2002);
	cars.put("6", pace);
}
	public Cars getCarID(String id) {
		if(cars.containsKey(id))
			return cars.get(id);
		else
			return null;
	}

	public Hashtable<String, Cars> getAll(){
		return cars;
	}
}
