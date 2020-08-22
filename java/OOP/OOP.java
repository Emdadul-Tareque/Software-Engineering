class OOP{
    public static void main(String[] args) {
        WaterBottle bottle1 = new WaterBottle("red");
        System.out.println(bottle1.getBottleColor());
        bottle1.capacity = 400;
        System.out.println(bottle1.height);
        System.out.println(bottle1.weight);
        System.out.println(bottle1.capacity);

        System.out.println("Before insert water: " + bottle1.currentWaterAmount);
        bottle1.insertWater(100);
        System.out.println("After insert water: " + bottle1.currentWaterAmount);



    }
}

class WaterBottle
{
    private String color;
    public double height;
    public double weight;
    public double capacity;
    public String logo;
    public double currentWaterAmount;

    public WaterBottle(String color)
    {
        this();
        this.color = color;
    
    }

    public WaterBottle()
    {
        this.height = 200;
        this.weight = 20;
        this.capacity = 500;
        this.logo = "Tareque";
        this.currentWaterAmount = 0;
    }

    public String getBottleColor()
    {
        return this.color;
    }

    public void insertWater(double amount)
    {
        this.currentWaterAmount += amount;
    }

    public double releaseWater(double amount)
    {
        if(this.currentWaterAmount > amount){
            this.currentWaterAmount -= amount;
            return amount;
        }
        else
        {
            amount = this.currentWaterAmount;
            return amount;

        }
    }
}