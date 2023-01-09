package security.dao;

import security.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsersList();

    void saveUser(User user);

    User getUserById(Long id);

    User getUserByUsername(String username);

    void updateUser(Long id, User updatedUser);

    void deleteUser(Long id);
}
