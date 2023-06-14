public class Main{
    public static void main(String[] args) {
        UserRepository userRepository = new DatabaseUserRepository();

        User user = userRepository.findById(1);

        User user = userRepository.findById(1);
        System.out.println(user.getName());

        user.setName("John Doe");
        userRepository.save(user);

        userRepository.delete(user);
    }
}