package pkg;

public interface Pet {
    public void setName(String name);       // Sets name of the pet
    public void setAge(int age);            // Sets age of the pet
    public void setBreed(String breed);     // Sets breed of the pet
    public String getName();                // Returns name of the pet
    public int getAge();                    // Returns age of the pet
    public String getBreed();               // Returns breed of the pet
    public void interact();                 // This is like bark or meow
}