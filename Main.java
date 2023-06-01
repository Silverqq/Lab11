public class Main {

    private static CustomerProduct customerProduct;
    Book book = new Book();
    Phone phone = new Phone();
    Laptop laptop = new Laptop();

    public static void main() {
        customerProduct.setLogin("user123");
        customerProduct.setPassword("pass123");
        customerProduct.setName("Java for Dummies");
        customerProduct.setPrice(19.99);
        customerProduct.setRating(5);
        customerProduct.buy();
    }

}
