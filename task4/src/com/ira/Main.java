package com.ira;

public class Main {
    public static void main(String[] args)
    {
        int countCars = 12;
        Car[] cars = new Car[countCars];
        cars[0] = new Car("BMW", "X5", 2010, "black", 5500, "AE3264NT");
        cars[1] = new Car("Audi", "100", 1994, "blue", 400, "AK1245II");
        cars[2] = new Car("Audi", "A4", 2007, "silver", 1000, "LK2312GT");
        cars[3] = new Car("Kia", " Cadenza", 2014, "white", 3000, "YT7245LJ");
        cars[4] = new Car("Nissan", "350Z", 2008, "green", 2100, "KJ1245YT");
        cars[5] = new Car("Ford", "70s", 2017, "white", 4320, "RE4598OI");
        cars[6] = new Car("Kia", "85l", 2004, "red", 1200, "UY8878AD");
        cars[7] = new Car("Opel", "imj", 2001, "blue", 1035, "AK1245II");
        cars[8] = new Car("Nissan", "Almera", 2016, "black", 1100, "TR2315LH");
        cars[9] = new Car("Ford", "50i", 1998, "silver", 3210, "VC8457WW");
        cars[10] = new Car("BMW", "v5", 2013, "green", 7520, "KJ4787DD");
        cars[11] = new Car("Kia", "Carnival", 2009, "red", 7850, "PO2147OY");

        String someProducer = "BMW";
        int yearsCreatedAgo = 5;
        int costMin = 1000;
        int yearOfCreated = 2017;

        printCarByProducer(cars, someProducer);
        System.out.println();

        printCarByProducerByYearsExploitation(cars, someProducer, yearsCreatedAgo);
        System.out.println();

        printCarByProduce(cars, costMin, yearOfCreated);
    }

    private static void printCarByProducer(Car cars[], String someProducer)
    {
        for (Car car : cars){
            if (someProducer.equals(car.getProducer())) {
                System.out.println(car);
            }
        }
    }

    private static void printCarByProducerByYearsExploitation(Car cars[], String nameProducer, int YearsOutletAgo)
    {
        for (Car car : cars) {
            if (nameProducer.equals(car.getProducer()) &&  car.getCarAge()> YearsOutletAgo) {
                System.out.println(car);
            }
        }
    }

    private static void printCarByProduce(Car cars[], int costFrom, int YearOfOutlet)
    {
        for (Car car : cars){
            if (car.getYearOfOutlet() == YearOfOutlet && car.getPrice() > costFrom) {
                System.out.println(car);
            }
        }
    }
}

