package com.jspiders.cardekho.Mainmenu;

import com.jspiders.cardekho.operations.CarDekhoOperation;

import java.util.Scanner;

public class CardekhoMenu {
	static boolean loop = true;
	static CarDekhoOperation op = new CarDekhoOperation();

	public static void main(String[] args) {
		while (loop)
			mainMenu();
	}

	public static void mainMenu() {
		System.out.println("=========Main Menu=======\n" + "1.View All Car\n" + "2.Search Car\n" + "3.Add Car\n"
				+ "4.Remove Car\n" + "5.Edit Car\n" + "6.Exit\n");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			op.viewallCar();
			break;
		case 2: op.searchCar(sc);
			    mainMenu();
			break;
		case 3:
			op.addCar();
			break;

		case 4:
			op.removeCarByid(sc);
			break;

		case 5:
			op.updateCarByid(sc);
			break;

		case 6:
			System.out.println("Thank you !!!");
			loop = false;
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

	}
}
