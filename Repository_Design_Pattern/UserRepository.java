public interface UserRepository {
    User findById(int id);
    void save(User user);
    void delete(User user);
}
