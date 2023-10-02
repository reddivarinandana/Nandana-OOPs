public class MountainPeak{
    //attributes
    private String peakName;
    private int altitude;

    //Constructor
    public MountainPeak(String peakName, int altitude){
        this.peakName = peakName;
        this.altitude = altitude;
    }

    //Getter Method
    public String getPeakName() {
        return peakName;
    }

    //Getter Method
    public int getAltitude() {
        return altitude;
    }

    public static void main(String[] args){
        
        // Create an object of the MountainPeak class
        MountainPeak everest = new MountainPeak("Mount Everest", 20);

        // Display the attributes of the MountainPeak object
        System.out.println(everest.getPeakName());
        System.out.println(everest.getAltitude());

    }
}