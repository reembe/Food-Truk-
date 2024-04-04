public class Breakfast extends Food{
    private boolean sweet;
    public Breakfast(int p, String n, boolean s) {
        super(p, n);
        sweet = s;

        
    }
    public Breakfast(){}
    


public String toString(){
    return "this is a breakfast food!" + getName();
}

public void eat(){
    super.cook(34.4);
    System.out.println("scrumptious");

}

public boolean equals(Food other)
{
    return (this.getName() == other.getName());
}

}
