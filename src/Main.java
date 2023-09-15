public class Main {
    public static void main(String[] args)
    {
       double purchasePrice = 12.50;
       double salesTax = 0.05;
       double purchaseTax = 0;
       double totalPrice = 0;

       purchaseTax = purchasePrice * salesTax;

       totalPrice = purchasePrice + purchaseTax;

        System.out.println("The tax on the purchase of " + purchasePrice + " is " + purchaseTax + " and the total is " + totalPrice);
    }
}