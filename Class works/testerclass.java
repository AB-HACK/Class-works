
class Item{
  
    double unitP, salesP, discountP, totalPrice;

    int quantity;


    public Item(int price, int quantity){
        this.unitP = price;
        this.quantity = quantity;
        this.totalPrice = price * quantity;

    }

    public void initialPrice(){
        System.out.printf("Innitial Price: %.2f %n", unitP * quantity);

    }
    

    public void calculateDiscount() {
        if (quantity <= 5) {
            discountP = 0.02 * totalPrice;
        } else if (quantity <= 10) {
            discountP = 0.05 * totalPrice;
        } else if (quantity <= 20) {
            discountP = 0.10 * totalPrice;
        } else {
            discountP = 0.15 * totalPrice;
        }
        System.out.printf("Discount Price: %.2f %n", discountP);
    }

    public void payment(){
        salesP = totalPrice - discountP;
        System.out.println("Sales price: " + salesP);
    }

}

public class testerclass {
    public static void main(String[] args) {
        // Test Case 1
        System.out.println("Test Case 1:");

        Item rice = new Item(50, 5);

        rice.initialPrice();
        rice.calculateDiscount();
        rice.payment();

        // Test case 2
        System.out.println("\nTest Case 2:");
        Item beans = new Item(70, 10);

        beans.initialPrice();
        beans.calculateDiscount();
        beans.payment();
        

        
        // Test case 3
        System.out.println("\nTest Case 3:");
        Item egusi = new Item(130, 10);

        egusi.initialPrice();
        egusi.calculateDiscount();
        egusi.payment();

        
    }
}
