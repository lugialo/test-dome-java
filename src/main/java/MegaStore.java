public class MegaStore {

    public enum DiscountType {
        Standard,
        Seasonal,
        Weight;
    }

    public static double getDiscountedPrice(double cartWeight,
                                            double totalPrice,
                                            DiscountType discountType) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        double percentage = 6;

        if (discountType == DiscountType.Seasonal) {
            percentage = 12;
        } else if (discountType == DiscountType.Weight && cartWeight > 10) {
            percentage = 18;
        }

        totalPrice = totalPrice - (totalPrice * percentage / 100);

        return totalPrice;
    }

    public static void main(String[] args) {
        System.out.println(getDiscountedPrice(12, 100, DiscountType.Weight));
    }
}