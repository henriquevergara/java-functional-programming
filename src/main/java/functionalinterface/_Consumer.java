package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

  static Consumer<Customer> greetCustomerConsumer = customer -> System.out
      .println("Hello " + customer.customerName + " thanks for registering phone number "
          + customer.customerPhoneNumber);

  static Consumer<Customer> greetCustomerConsumerAndSetName = customer -> {
    System.out
        .println("Hello " + customer.customerName + " thanks for registering phone number "
            + customer.customerPhoneNumber);
    customer.setCustomerName("Henrique");
  };

  static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> {
    System.out
        .println("Hello " + customer.customerName + " thanks for registering phone number "
            + (showPhoneNumber ? customer.customerPhoneNumber : "*******"));
  };

  static void greetCustomer(Customer customer) {
    System.out.println("Hello " + customer.customerName + " thanks for registering phone number "
        + customer.customerPhoneNumber);
  }

  public static void main(String[] args) {
    // Normal Java Function
    Customer maria = new Customer("Maria", "99999");
    greetCustomer(maria);

    System.out.println("BEFORE Consumer: " + maria.toString());
    // Functional Interface
    greetCustomerConsumer.accept(maria);
    greetCustomerConsumerV2.accept(maria, true);
    greetCustomerConsumerV2.accept(maria, false);
    greetCustomerConsumerAndSetName.accept(maria);
    System.out.println("AFTER Consumer: " + maria.toString());
  }

  static class Customer {

    private String customerName;
    private String customerPhoneNumber;

    public Customer(String name, String phone) {
      this.customerName = name;
      this.customerPhoneNumber = phone;
    }

    public void setCustomerName(String customerName) {
      this.customerName = customerName;
    }

    @Override
    public String toString() {
      return "Customer{" +
          "customerName='" + customerName + '\'' +
          ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
          '}';
    }
  }
}
