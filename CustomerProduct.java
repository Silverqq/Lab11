public class CustomerProduct implements User, Product {
    private String login;
    private String password;
    private String name;
    private double price;
    private int rating;

    CustomerProduct customerProduct = new CustomerProduct();

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void buy() {
        System.out.println(getLogin() + " купил " + getName());
    }

}
