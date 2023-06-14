import java.util.HashMap;
import java.util.Map;

public class InMemoryUserRepository implements UserRepository{

     private Map<Integer, User> userMap = new HashMap<>();

    @Override
    public User findById(int id) {
        return null;    
    }

    @Override
    public void save(User user) {
      
    }

    @Override
    public void delete(User user) {
     
    }
    
}
