package org.anitab;

import org.anitab.models.Address;
import org.anitab.models.MVPApartment;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Address address = new Address(
                "123 Main St",
                "4B",
                "Oakland",
                "CA",
                "94612"
        );

        MVPApartment apartment = new MVPApartment(
                2,
                1.5,
                2500,
                address
        );

        System.out.println("Welcome to Sweet hunt!");
//        System.out.println("Address:" + apartment );
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("How many bedrooms?");
//        int bedrooms = scanner.nextInt();
//
//        System.out.print("How many bathrooms?");
//        double bathrooms = scanner.nextDouble();
//
//        System.out.print("What is the rent?");
//        int price = scanner.nextInt();

        System.out.println(apartment.getAddress());
        System.out.println(apartment.getAddress().getCity());
    }
}
