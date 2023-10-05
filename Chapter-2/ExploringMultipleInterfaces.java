//Exploring Multiple Interfaces:
//Define another interface named Trekable with a method trekDifficulty(). Make the MountainPeak 
//class implement this interface and provide an appropriate implementation.
interface Trekable{
    void trekDifficulty();
}
class ExploringMultipleInterfaces implements Trekable{
    public void trekDifficulty(){
        System.out.println("Everest has a trek Difficulty");
    }
    public static void main(String[] args){
        ExploringMultipleInterfaces explorer = new ExploringMultipleInterfaces();
        explorer.trekDifficulty();
    }
}

