package com.company;

public class Main {

    public static void main(String[] args) {
	Booking b1= new Booking(
	        new DeLuxeRoom("13",2),
            new Person("Jack"),
            new DateInterval(
                    new Date(1,1,2020),
                    new Date(2,1,2020)
            )
    );

        Booking b2= new Booking(
                new StandardRoom("66",3),
                new Person("John"),
                new DateInterval(
                        new Date(13,8,2020),
                        new Date(13,8,2024)
                )
        );
        System.out.println(b1);
        System.out.println(b2);
    }
}
