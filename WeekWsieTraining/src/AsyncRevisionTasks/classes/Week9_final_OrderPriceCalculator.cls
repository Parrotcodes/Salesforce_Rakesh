public with sharing class Week9_final_OrderPriceCalculator {

    @InvocableMethod(label='Calculate Final Order Price' description='Calculates the final price after applying discount on Order Amount')
    public static List<Decimal> calculateFinalPrice(List<OrderWrapper> orderInputs) {
        List<Decimal> finalPrices = new List<Decimal>();

        for (OrderWrapper input : orderInputs) {
            Decimal amount = input.Order_Amount != null ? input.Order_Amount : 0;
            Decimal discount = input.Order_Discount != null ? input.Order_Discount : 0;

            if (discount > 100) discount = 100;
            if (discount < 0) discount = 0;

            Decimal finalPrice = amount - (amount * (discount / 100));
            finalPrices.add(finalPrice);
        }

        return finalPrices;
    }

    public class OrderWrapper {
        @InvocableVariable(label='Order Amount' required=true)
        public Decimal Order_Amount;

        @InvocableVariable(label='Order Discount (%)' required=true)
        public Decimal Order_Discount;
    }
}