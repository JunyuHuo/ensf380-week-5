public class Car {
    String model;
    Driver driver;
    Engine engine;

    public Car(String model, Driver driver, Engine engine) {
        this.model = model;
        this.driver = new Driver(driver);
        this.engine = new Engine(engine);
    }

    public Car copy(Boolean deepCopy) {
        if (deepCopy){
            Driver driver = new Driver(this.driver);
            Engine engine = new Engine(this.engine);
            return new Car(this.model, diver, engine);
        }
        else {
            return this;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine enigne) {
        this.engine = engine;
    }
}
