//Create a Map where the keys are country names(as String) and the values are their capitals(also String).
//Populate the map with at least five countries and their capitals.
//Write a program that prompts the user to enter a country name and then displays
//the corresponding capital, if it exista in the map.

package in.kgcoding.challenge101;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Bharat", "New Delhi");
        map.put("China", "Beijing");
        map.put("Pakistan", "Islamabad");
        map.put("SriLanka","Columbia");
        map.put("Bangladesh", "Dhaka");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the country name:");
        String country = input.next();
        if( map.containsKey(country) ){
            System.out.println(map.get(country));
        }else{
            System.out.println("Sorry we don't know the capital");
        }
    }
}
