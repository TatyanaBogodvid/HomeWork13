public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {

        if (brand == null || brand == ""){
            this.brand = "default";
        } else {
        this.brand = brand;}
        if (model == null || model == ""){
            this.model = "default";
        } else {
        this.model = model;}
        if (engineVolume <= 0){
            this.engineVolume = 1.5;
        } else{
        this.engineVolume = engineVolume;}
        if (color == null || color == ""){
            this.color = "white";
        } else {
        this.color = color;}
        if (year <= 0){
            this.year = 2000;
        } else{
        this.year = year;}
        if (country == null || country == "") {
            this.country = "default";
        } else {
        this.country = country;}
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }

    public void printInfo(Car car){
        System.out.println(car);
    }
}
