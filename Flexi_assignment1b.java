class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Customer class representing users of the online shopping system
class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Order class representing a customer's order
class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
public class Flexi_assignment1b {
    public static void main(String[] args) {
        // Creating three products
        Product laptop = new Product("Laptop", 899.99);
        Product smartphone = new Product("Smartphone", 499.99);
        Product headphones = new Product("Headphones", 79.99);

        // Creating a customer
        Customer customer = new Customer("John Doe", "john.doe@example.com");

        // Creating an order with the customer, product, and quantity
        Order order1 = new Order(customer, laptop, 2);
        Order order2 = new Order(customer, smartphone, 1);
        Order order3 = new Order(customer, headphones, 3);

        // Displaying details of the products
        System.out.println("Product Details:");
        displayProductDetails(laptop);
        displayProductDetails(smartphone);
        displayProductDetails(headphones);

        // Displaying details of the customer
        System.out.println("\nCustomer Details:");
        displayCustomerDetails(customer);

        // Displaying details of the orders
        System.out.println("\nOrder Details:");
        displayOrderDetails(order1);
        displayOrderDetails(order2);
        displayOrderDetails(order3);
    }

    private static void displayProductDetails(Product product) {
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println();
    }

    private static void displayCustomerDetails(Customer customer) {
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println();
    }

    private static void displayOrderDetails(Order order) {
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Product: " + order.getProduct().getName());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println();
    }
}

