public class Meeting {
    public static void main(String[] args) {
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        int salesInteger = (int) sales;
        int profitInteger = (int) profit;
        int refundsInteger = (int) refunds;
        int shippingInteger = (int) shipping;

        System.out.println("This month, we made $" + salesInteger + " in sales");
        System.out.println("Factoring in costs, we made $" + profitInteger + " in profit");
        System.out.println("The refunds are at a low $" + refundsInteger + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + shippingInteger + " in shipping");

    }
}