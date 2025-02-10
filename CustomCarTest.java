public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Hummer H1", new Driver("Joe"), new Engine("v8"));
        Car car2 = car1.copy();
        car2.setModel("BMW");
        System.out.println(car1.getModel());
    }
}
