package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private  boolean summer;


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String bodyType,
               String registrationNumber,
               int seats,
               boolean summer) {

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
        if (transmission == null || transmission == "") {
            this.transmission = "default";
        } else {
        this.transmission = transmission;}
        if (bodyType == null || bodyType == "") {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;}
        if (registrationNumber == null || registrationNumber == "") {
            this.registrationNumber = "[x00xx000]";
        } else {
            this.registrationNumber = registrationNumber;}
        if (seats < 0) {
            this.seats = Math.abs(seats);
        } else {
            this.seats = seats;}

    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", seats=" + seats +
                ", summer=" + summer +
                '}';
    }

    public void printInfo(Car car){
        System.out.println(car);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isSummerOrWinter() {
        return summer;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSummerOrWinter(boolean summer) {
        this.summer = summer;
    }

    public void changeTyres(){
        summer = !summer;
    }

    public boolean isCorrectRegNum(){
        if(registrationNumber.length() != 9){
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if(!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
            return false;
        }
        if(!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])){
            return false;
        }
        return  true;
    }

    public static  class Key{
        private final boolean remoteRun;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRun, boolean withoutKeyAccess){
            this.remoteRun = remoteRun;
            this.withoutKeyAccess = withoutKeyAccess;
        }
        public boolean isRemoteRun(){
            return remoteRun;
        }
        public boolean isWithoutKeyAccess(){
            return withoutKeyAccess;
        }
    }

    public static class Insurance{
        private final LocalDate expireDate;
        private final int cost;
        private final String number;

        public Insurance(LocalDate expireDate, int cost, String number) {
            if(expireDate == null){
                expireDate = LocalDate.now().plusDays(365);
            }
            this.expireDate = expireDate;
            if(cost <=0){
                cost = 15_000;
            }
            this.cost = cost;
            if(number == null || number.isEmpty()){
                number = "xxxyyyzzz";
            }
            this.number = number;
        }

        public void printCheckExpired(){
            boolean expired = expireDate.isAfter(LocalDate.now());
            if(expired){
                System.out.println("Надо ехать менять страхвку.");
            }
        }

        public void printCheckNumber(){
            boolean correct = number.length() == 9;
            if (!correct){
                System.out.println("Номер страховки не коректный!");
            }
        }



        public LocalDate getExpireDate() {
            return expireDate;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }
}
