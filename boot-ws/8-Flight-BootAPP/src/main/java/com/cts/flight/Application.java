package com.cts.flight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.flight.dao.FlightDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(Application.class, args);
	
		FlightDao flightDao = ac.getBean(FlightDao.class);
		
		flightDao.findAll().forEach(flight->{
			System.out.println(flight.getId());
			System.out.println(flight.getFlightNumber());
			System.out.println(flight.getOrigin());
			System.out.println(flight.getDestination());
			System.out.println(flight.getDuration());
			System.out.println(flight.getFlightDate());
			System.out.println(flight.getFlightTime());
			System.out.println(flight.getFare().getFareId());
			System.out.println(flight.getFare().getCurrency());
			System.out.println(flight.getFare().getFare());
			
			System.out.println("------------------------------------");
		});
		
		
	}

}
