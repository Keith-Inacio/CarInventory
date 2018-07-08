package com.example.demo;
import java.util.Hashtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import model.Cars;
import service.CarsService;


@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
public class CarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsApplication.class, args);
		
	}

	@RestController
	public class carsController {

		@Autowired
		CarsService motors;

		@RequestMapping("/cars/all")
		public Hashtable<String, Cars> getCars(){
			return motors.getAll();
			}
		
		@RequestMapping("/cars/{id}")
		public Cars getCarID(@PathVariable ("id") String id){
			return motors.getCarID(id);
	}
	}
}