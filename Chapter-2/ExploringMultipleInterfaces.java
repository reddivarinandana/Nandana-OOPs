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

