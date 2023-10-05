// Interface Implementation: Define an interface named Climbable with a method canClimb(). Implement
// this interface in the MountainPeak class and provide an implementation for the method.

interface Climbable{
    void canClimb();
}

class InterfaceImplemenatation implements Climbable{
    public void canClimb(){
        System.out.println("Everset is a climbable mountain peak");
    }
    public static void main(String[] args){
        InterfaceImplemenatation mountain = new InterfaceImplemenatation();
        mountain.canClimb();
    }
}


