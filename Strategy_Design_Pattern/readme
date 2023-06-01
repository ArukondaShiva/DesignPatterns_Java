Strategy Design Pattern:
  Strategy design pattern is one of the behavioral design pattern. Strategy pattern is used when we have multiple algorithm for a specific task
  and client decides the actual implementation to be used at runtime.
  
  Strategy pattern is also known as Policy Pattern. We define multiple algorithms and let client application pass the algorithm to be used as a parameter. 
  One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter. Based on the different implementations of 
  Comparator interfaces, the Objects are getting sorted in different ways. For our example, we will try to implement a simple Shopping Cart where we have
  two payment strategies - using Credit Card or using PayPal. 
  
  -First of all we will create the interface for our strategy pattern example, in our case to pay the amount passed as argument. PaymentStrategy.java
  -Now we will have to create concrete implementation of algorithms for payment using credit/debit card or through paypal. 
      CreditCardStrategy.java   PaypalStrategy.java
  -Now our strategy pattern example algorithms are ready. We can implement Shopping Cart and payment method will require input as Payment strategy. Item.java
  -Notice that payment method of shopping cart requires payment algorithm as argument and doesn’t store it anywhere as instance variable. Let’s test our 
  strategy pattern example setup with a simple program. Main.java
  
  
Class Diagram of above Example: ![StrategyPattern](https://github.com/ArukondaShiva/DesignPatterns_Java/assets/49832102/87a9f071-1c0e-4637-b714-cc2080b2fc21)

Source : https://www.digitalocean.com
