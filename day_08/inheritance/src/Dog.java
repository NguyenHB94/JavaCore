public class Dog extends Animal{

    private int legs;

    public Dog() {
    }

    public Dog(int legs) {
        this.legs = legs;
    }

    public Dog(String name, String color, int legs) {
        super(name, color);//super gọi đến constructor của lớp cha-Animal
        this.legs = legs;
    }

    @Override
    public void eat() {
        System.out.println("Dog eat ...");
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "name: " + super.getName() + "\tcolor: " + super.getColor() + "\tlegs: " + legs;
    }
}
