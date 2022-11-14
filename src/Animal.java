public class Animal {
    private String name;
    private int longestOfLiving;
    private String fact;

    public Animal(String name, int longestOfLiving, String fact) {
        this.name = name;
        this.longestOfLiving = longestOfLiving;
        this.fact = fact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLongestOfLiving() {
        return longestOfLiving;
    }

    public void setLongestOfLiving(int longestOfLiving) {
        this.longestOfLiving = longestOfLiving;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }
    public void attack(){
        System.out.println(getName()+" attacked all ocean animals.");
    }
    public void swim(){
        System.out.println(getName()+" can swim and living outside of water.");
    }
    public void fly(){
        System.out.println(getName()+" can flu above the cloud");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", longestOfLiving=" + longestOfLiving +
                ", fact='" + fact + '\'' +
                '}';
    }
}
