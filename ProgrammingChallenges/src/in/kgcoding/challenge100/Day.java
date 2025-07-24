//Enhance the Day enum by adding an attribute that indicates whether it is a weekday or weekend.
//Add a method in the enum that returns whether it's a weekday or weekend,
//and write a program to print out each day along with its type.

package in.kgcoding.challenge100;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    public final boolean isWeekDay;

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public String getType(){
        return isWeekDay ? "Weekday" : "Weekend";
    }
}
