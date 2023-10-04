public class MountainPeak{
    //attributes
    private String peakName;
    private int altitude;

    //Constructor
    public MountainPeak(String peakName, int altitude){
        this.peakName = peakName;
        this.altitude = altitude;
    }

    //Method to display attributes
    public void displayAttributes(){
        System.out.println("PeakName : " + peakName);
        System.out.println("altitude : " + altitude);
    }

    public static void main(String[] args){
        
        // Create an object of the MountainPeak class
        MountainPeak everest = new MountainPeak("Mount Everest", 20);

        // Display the attributes of the object
        everest.displayAttributes();

    }
}