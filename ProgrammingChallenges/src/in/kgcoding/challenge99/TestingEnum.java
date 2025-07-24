//Create an enum called Day that represents the days of the Week.
//Write a program that prints out all the days of the week from this enum.

package in.kgcoding.challenge99;

public class TestingEnum {
    public static void main(String[] args) {
        Day day1 = Day.SUNDAY;
        Day day2 = Day.MONDAY;
        Day day3 = Day.TUESDAY;
        Day day4 = Day.WEDNESDAY;
        Day day5 = Day.THURSDAY;
        Day day6 = Day.FRIDAY;
        Day day7 = Day.SATURDAY;
        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);
        System.out.println(day4);
        System.out.println(day5);
        System.out.println(day6);
        System.out.println(day7);

        for ( Day day : Day.values()){
            System.out.println(day);
        }

    }
}
