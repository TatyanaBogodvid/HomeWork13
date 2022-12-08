public class Bouquet {
    private final Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    private double calculateCost(){
        double sum = 0;
        for (Flower flower : flowers){
            sum += flower.getCost();
            }
            return sum*1.1;
        }

    private int calculateLifeSpan(){
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers){
            if(flower.getLifeSpan() < minLifeSpan){
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return  minLifeSpan;
    }



    public void printInfo(){
        double sum = calculateCost();
        int minLifeSpan = calculateLifeSpan();
        StringBuilder result = new StringBuilder("Состав букета: ").append("");
        for (Flower flower : flowers){
            result.append(flower).append("\n");
        }
        result.append("Срок стояния букета: ").append(minLifeSpan).append(" дней");
        result.append("Стоимость букета: ").append(sum).append(" рублей");


    }

   }
}
