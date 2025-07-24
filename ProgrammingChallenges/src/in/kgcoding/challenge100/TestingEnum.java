package in.kgcoding.challenge100;

public class TestingEnum {
    public static void main(String[] args) {
        for(Day day : Day.values()){
            System.out.printf("%s : %s\n", day,day.getType());
        }
    }
}
