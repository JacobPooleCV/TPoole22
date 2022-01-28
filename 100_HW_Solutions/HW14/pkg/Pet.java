package pkg;

public interface Pet {
    public void setName(String name);       	// Sets name of the pet
    public void setAge(int age);            	// Sets age of the pet
    public void setIsTrained(boolean trained);  // Sets if the pet is trained or not. True if trained.
    public String getName();                	// Returns name of the pet
    public int getAge();                    	// Returns age of the pet
    public boolean getIsTrained();              // Returns if the pet is trained
    public void interact();                 	// This is like bark or meow, say pet name and what they do!
	public void trick();						// The pet performs a trick if the pet is trained. If not, the pet just acts normal.
}