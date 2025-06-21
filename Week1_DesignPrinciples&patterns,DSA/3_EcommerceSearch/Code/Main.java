import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Sample products
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Book", "Education"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Camera", "Electronics")
        };

        //  Linear Search
        System.out.println(" Linear Search for 'Shoes':");
        int result1 = LinearSearch.linearSearch(products, "Shoes");
        System.out.println(result1 != -1 ? "Found at index " + result1 : "Not found");

        //  Binary Search (after sorting)
        System.out.println("\n Binary Search for 'Camera':");
        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));
        int result2 = BinarySearch.binarySearch(products, "Camera");
        System.out.println(result2 != -1 ? "Found at index " + result2 : "Not found");
    }
}
