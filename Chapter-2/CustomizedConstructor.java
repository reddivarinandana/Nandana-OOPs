public class CustomizedConstructor {
    String name;
    int elevation;

    // Parameterized constructor
    public CustomizedConstructor(String name, int elevation) {
        this.name = name;
        this.elevation = elevation;
    }

    // Display method to print the attributes
    public void display() {
        System.out.println(name);
        System.out.println(elevation);
    }

    public static void main(String[] args) {
        // Instantiate the MountainPeak class using the parameterized constructor
        CustomizedConstructor trip = new CustomizedConstructor("Everest", 20);
        // Display the attributes
        trip.display();
    }
}




