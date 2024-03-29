package exsample_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BusMain {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(101, "Abc Travels", 1200.99, 2.5f));
		busList.add(new Bus(122, "K Travels", 1100.99, 1.5f));
		busList.add(new Bus(102, "Pqr Travels", 1300.99, 1.5f));
		busList.add(new Bus(231, "Jme Travels", 1100.99, 2.5f));
		busList.add(new Bus(121, "Jee Travels", 1200.99, 4.5f));
		busList.add(new Bus(141, "Java Travels", 1200.99, 4.8f));
		Scanner sc = new Scanner(System.in);
		// printBuses(busList);
		int ch = 0;

		do {
			System.out.println("Bus Menu");
			System.out.println("===========");
			System.out.println("1)Print All Buses");
			System.out.println("2)Sort Bus By Id");
			System.out.println("3)Sort Bus By Name");
			System.out.println("4)Sort Bus By Fare");
			System.out.println("5)Sort Bus By Rating");
			System.out.println("6)EXIT");
			System.out.println("Enter your choice :)");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				printBuses(busList);

				break;
			case 2:
				System.out.println("Sorting Buses By Id");
				Collections.sort(busList);
				printBuses(busList);

				break;
			case 3:
				System.out.println("Sorting buses by name(A-Z)");
				Collections.sort(busList, new BusNameComparator());
				printBuses(busList);
				break;
			case 4:System.out.println("Sorting By Fare(Asc)");
				Collections.sort(busList, (Bus b1,Bus b2)->{
					Double d1=b1.getFare();
					Double d2=b2.getFare();
					return d1.compareTo(d2);
				});
				printBuses(busList);
				break;
			case 5:System.out.println("Sorting Buses By Ratings(DESC) and then by Fare(ASC)");
					Collections.sort(busList, (Bus b1,Bus b2)->{
						Float f1=b1.getRatings();
						Float f2=b2.getRatings();
						int x=f2.compareTo(f1);
						if(x==0) {
							Double d1=b1.getFare();
							Double d2=b2.getFare();
							x= d1.compareTo(d2);
						}
						return x;
					});
					printBuses(busList);
				break;
			case 6:
				System.out.println("Thankq for using search Bus App V1.0");

				break;
			default:
				System.out.println("Invalid Option... Please Re-enter");
				break;
			}

		} while (ch != 6);
	}

	public static void printBuses(List<Bus> busList) {
		System.out.println("Total " + busList.size() + " no of buses available");
		System.out.println("Printing Bus Details");
		for (int i = 0; i < busList.size(); i++) {
			System.out.println(busList.get(i));
		}
	}

}
