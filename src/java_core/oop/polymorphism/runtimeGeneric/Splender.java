package java_core.oop.polymorphism.runtimeGeneric;

public class Splender extends Bike {
    @Override
    void run() {
        System.out.println("chay cuc manh");
    }

    public static void main(String[] args) {
        Bike bike = new Splender();
        bike.run();
    }
}
