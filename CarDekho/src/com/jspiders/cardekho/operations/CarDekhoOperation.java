package com.jspiders.cardekho.operations;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jspiders.cardekho.entity.Car;

public class CarDekhoOperation {

	private List<Car> cars = new ArrayList<>();

	public void viewallCar()
	{
		for (Car car : cars) {
			System.out.println(car);
		}
	}
    public void searchByname(String name){
    	System.out.println("Seach by name");
    }
    public void searchByID(int id){
    	System.out.println("Seach by id");
    }
    public void searchByPrice(int price){
    	System.out.println("Seach by price");
    }
    public void searchByColor(String color){
    	System.out.println("Seach by color");
    }
    public void searchByFuelType(String fuelType){
    	System.out.println("Seach by fueltype");
    }
    public void searchBymodel(String model){
    	System.out.println("Seach by model");
    }
	public void addCar() {
		System.out.println("How many cars you want to add");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		for (int i = 1; i <= choice; i++) {
			Car car = new Car();
			System.out.println("Enter Id:");
			car.setId(sc.nextInt());
			System.out.println("Enter Name:");
			car.setName(sc.next());
			System.out.println("Enter Brand:");
			car.setModel(sc.next());
			System.out.println("Enter Price:");
			car.setPrice(sc.nextInt());
			System.out.println("Enter Color:");
			car.setColor(sc.next());
			System.out.println("FuelType:");
			car.setFuelType(sc.next());
			cars.add(car);
		}

	}
	
	//============================================================================

	public void searchCar(Scanner sc) {
		System.out.println("========Search Car======= \n" + "1.Search by id\n" + "2.Search by name\n"
				+ "3.Search by model\n" + "4.Search by FuelType\n" + "5.Search by price\\n"+"6.Go Back\n");
		int choice2 = sc.nextInt();
		switch (choice2) {
		case 1:
			searchCarById(sc);

			break;
		case 2:
			searchByCarName(sc);
			break;
		case 3:
			searchCarbyModel(sc);
			break;
		case 4:
			searchCarbyFuelType(sc);
			break;
		case 5:
			break;
		case 6:
			

			break;

		default:
			break;
		}
	}
	public void searchCarById(Scanner sc) {
				   System.out.println("Enter yor car id : ");
		   int id= sc.nextInt();
		   	   
		   for( Car car:cars) {
			   
			      if(car.getId()==id) {
				  System.out.println(car);
				  break;
			      }
			      else {
			    	  System.out.println("car not found");
			      }
			  }
			
		}
	
	//============================================================================

	public void searchCarbyModel(Scanner sc) {
		   System.out.println("Enter your brand name : ");
			boolean flag=false;

		   String brand= sc.next();
		   	   
		   
		   for( Car car:cars) {
			   
			      if(car.getModel().equalsIgnoreCase(brand)) {
						flag=true;
				  System.out.println(car);
				  break;
			      }
			 }
		      if (!flag) {
		    	  System.out.println("Car not found");
		    	  }
		   
			
	}
	//============================================================================

	public void searchCarbyFuelType(Scanner sc) {
		   System.out.println("Enter your FuelType : ");
		   String brand= sc.next();
			boolean flag=false;
 
		   
		   for( Car car:cars) {
			   
			      if(car.getFuelType().equalsIgnoreCase(brand)) {
						flag=true;
				  System.out.println(car);
				  break;
			      }
			      if (!flag) {
			    	  System.out.println("Car not found");
			    	  }
		   }
			
	}
	
	//============================================================================

	public void searchByCarName(Scanner sc) {
		   System.out.println("Enter your car name : ");
		   String carname= sc.next();
			boolean flag=false;
		   		   
		   for( Car car:cars) {
			      if(car.getName().equalsIgnoreCase(carname)) {
						flag=true;
				  System.out.println(car);
				  break;
			      }
			    }
		   if (!flag) {
		    	  System.out.println("Car not found");
		    	  }
			
		}
	//============================================================================


	public void removeCarByid(Scanner sc) {
		System.out.println("enter id");
		int id = sc.nextInt();
		boolean flag=false;

		for (Car car : cars) {
			if (car.getId()==id){
				flag=true;
				cars.remove(car);
				break;
			}
		}
		 if (!flag) {
	    	  System.out.println("Car not found");
	    	  }
	}
	
	//============================================================================
	public void updateCarByid(Scanner sc) {
		boolean flag=false;
		System.out.println("enter id");
		int id = sc.nextInt();
		for (Car car : cars) {
			if (car.getId()==id){
				flag=true;
				double price=sc.nextDouble();
				car.setPrice(price);
				System.out.println("price updated Sucessfully!!!");
				break;
			}
		}
		if (!flag) {
			System.out.println("Car not found");
		}
	}
	//============================================================================


}