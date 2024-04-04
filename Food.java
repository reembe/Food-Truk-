public class Food {
    private int price;
    private String name;
    public Food(int p, String n){
        price = p;
        name = n;
    }

    public Food(){}

    public String getName() {
        return name;
    }

    public String toString(){
        return name + " costs " + price;
    }

    public void eat(){
        System.out.println("Yummy!");
    }

    public void cook(double temp){
        System.out.println("the food is cooking at " + temp + "degrees");
    }

    public boolean equals(Food other)
    {
        return (this.getName() == other.getName());
    }


    
}
