public class LinearSearch{
    //LinearSearch
    public static int linearSearch(Product[] products, String targetName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(targetName)) {
                return i;
            }
        }
        return -1;
    }
}
