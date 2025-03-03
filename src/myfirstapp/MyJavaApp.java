package myfirstapp;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MyJavaApp {

    protected final String name = "John";

    {
        //class initializer
    }

    public MyJavaApp() {
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        // // // // // //
        //Data Types

        // am vrut sa incerc autoboxing; prima oara am incercat sa pasez Integer.valueOf(21), dar idea ul zice ca e unnecessary boxing
        // DataTypes dataTypes = new DataTypes(Integer.valueOf(21));
        DataTypes dataTypes = new DataTypes(21);

        System.out.println(dataTypes.getNumber());
        // // // // // //



        // // // // // //
        // Math stuff

        int res1 = MathStuff.divideIntegers(4, 2);
        System.out.printf("Divide result: res1=%d\n", res1);

        double res2 = MathStuff.divideIntegers(5, 2);
        System.out.printf("Divide result: res2=%f\n", res2);

        float res3 = MathStuff.divideFloats(5, 2);
        System.out.printf("Divide result: res3=%d\n", Math.round(res3));

        float res4 = MathStuff.divideFloats(-4.5f, 2F);
        System.out.printf("Divide result: res4=%f\n", Math.ceil(Math.abs(res4)));
        // // // // // //


        // // // // // //
        // Arrays
        int[] intArray = {21, 8, 97};

        System.out.printf("Lungime array: %d; suma: %d\n", intArray.length, Arrays.stream(intArray).sum());

        for (int i = 0; i < intArray.length; i++) {
            // innebunesc daca mai parcurg un array asa
        }

        for (int number : intArray) {
            System.out.println(number);
        }

        List<Integer> intList = Arrays.asList(21, 8, 97);
        intList.forEach(System.out::println); // am mai vazut asta. practic forEach primeste un closure care e o metoda statica si o executa pentru fiecare item in parte al listei?

        // Arrays - insert element into an array - god i hope thats not how they usually do it

        String[] cars = {"Logan", "Duster", "Porsche"};
        String stringToInsert = "Trabant";
        int indexToInsertAt = 1;

        MyArray.insertIntoArray(cars, indexToInsertAt, stringToInsert);

        System.out.println("Array de string-uri" + Arrays.toString(cars));
        // m am confuzat putin aici pentru ca nu a trebuit sa dau return in MyArray.insertIntoArray, iar array-ul a fost modificat. vad pe net ca in cazul obiectelor, Java e "pass by reference" si acum am inteles conceptul; moving on

        // Arrays - sort array of primitives
        int[] arrayToSort = {21, 8, 97};
        System.out.println("Unsorted array" + Arrays.toString(arrayToSort));
        Arrays.sort(arrayToSort);
        System.out.println("Sorted array" + Arrays.toString(arrayToSort));

        // Arrays - sort array of objects with Comparator (din cate inteleg this is basically a callback function in php)
        Employee[] employees = {
                new Employee("Junior", 1),
                new Employee("Senior", 2),
                new Employee("DevOps", 3)
        };

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int sortByName = o1.getName().compareTo(o2.getName());
                if (sortByName != 0) {return sortByName;}

                return o1.getId() - o2.getId();
            }
        });

        System.out.println("Sorted array with Comparator: " + Arrays.stream(employees).map(Employee::getName).collect(Collectors.joining(", "))); // asta am facut cu AI ca voiam o modalitate inline de a afisa doar getName al fiecarui obiect. interesant stream-urile. basically those are a stream of methods an an array of objects (or primitives?)

        // Array - binary search
        Arrays.sort(cars);
        int indexBS = Arrays.binarySearch(cars, "Logan"); // I guess this is why you need to know engineer stuff like data structures and algorithms to code in java.
        System.out.println("Binary search on cars: " + cars[indexBS]);
        // // // // // //



        // // // // // //
        // String
    }
}