//1. Getters: Retrieve private field values, typically named get<FieldName>
//2. Setters: Set or update private field values, usually named set<FieldName>

//Encapsulation: Facilitate read-only or write-only access to class fields.

//Flexibility:Allow for internal changes without affecting external interfaces.

//Control and Validation: Offer controlled access and allow fo validation logic.

package in.gettersetter;

public class Car {
    private String color;
    private String model;
    private double fuelLevel;
    private long costOfPurchase;

    public Car(String color,String model,double fuelLevel,long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    //Getter
    public String getColor(){
        return color;
    }

    //Setter
    public void setColor( String color){
        if(color.equals("Yellow")){
            System.out.println("Sorry!This color doesn't look good");
        }
        else {
            this.color = color;
        }
    }

    public String getModel(){
        return model;
    }

    public void setModel( String model){
        this.model = model;
    }
}
