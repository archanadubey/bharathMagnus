package InterfaceDemo;

public interface Car extends Vehicle {

    void color();

}

class FourWheeler implements Car{

    @Override
    public void color() {
        System.out.println("color is blue");

    }

    @Override
    public void display() {
        System.out.println("Its display white:");

    }
}
