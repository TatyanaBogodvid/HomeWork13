public class Flower {
    final String flowerName;
    final String country;
    final double cost;
    private int lifeSpan;

    @Override
    public String toString() {
        return "Flower{" +
                "flowerName='" + flowerName + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isEmpty()){
            this.flowerName = "Тип цветка не указан";
        } else {
        this.flowerName = flowerName;}
        if (country == null || country.isEmpty()){
            this.country = "Россия";
        } else {
        this.country = country;}
        if (cost <= 0){
            this.cost = 1.00;
        } else {
        this.cost = cost;}
        if (lifeSpan <= 0){
            this.lifeSpan = 3;
        } else {
        this.lifeSpan = lifeSpan;}



    }
}
