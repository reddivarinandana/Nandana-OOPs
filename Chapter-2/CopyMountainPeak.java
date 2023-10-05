public class CopyMountainPeak {
    String peakName;
    int peakAltitude;

    public CopyMountainPeak ( String peakName,int peakAltitude){
        this.peakName = peakName;
        this.peakAltitude = peakAltitude;
    }

    public CopyMountainPeak ( CopyMountainPeak main){
        this.peakName = main.peakName;
        this.peakAltitude = main.peakAltitude;
    }

    public void display(){
        System.out.print(peakName + " " +peakAltitude);
    }
    public static void main(String[] args){
        CopyMountainPeak copy = new CopyMountainPeak("Everset",20);
        CopyMountainPeak newCopy = new CopyMountainPeak(copy);
        newCopy.display();          
    }
}
