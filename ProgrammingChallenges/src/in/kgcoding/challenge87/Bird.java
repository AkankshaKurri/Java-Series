package in.kgcoding.challenge87;

public abstract class Bird implements Flyable{

    private final String breed;

    public Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void fly() {
        System.out.println("I am a Bird. I fly in the sky");
    }
}
