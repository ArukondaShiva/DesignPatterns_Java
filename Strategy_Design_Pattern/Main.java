public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 100);
        Item item2 = new Item("5678", 150);
        Item item3 = new Item("3333", 200);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.pay(new PaypalStrategy("shiva@gmail.com","12345"));

        cart.pay(new CreditCardStrategy("shiva", "1234567890", "111", "12/26"));

    }
}
