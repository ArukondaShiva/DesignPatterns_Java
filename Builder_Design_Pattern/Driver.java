public class Driver {
    
    public static void main(String[] args) {
        
        Dog dogOne = new Dog.DogBuilder().setName("Bruno")
                          .setGender("Male").setBreed("Pug")
                          .setPrice(456.78).build();
        
        Dog dogTwo = new Dog.DogBuilder().setGender("Male")
                          .setName("Pinky").build();

        System.out.println(dogOne);
        System.out.println(dogTwo);

        System.out.println(dogOne.getName());
        System.out.println(dogTwo.getName());
    }

}
