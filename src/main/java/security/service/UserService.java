package security.service;

import security.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsersList();

    void saveUser(User user);

    User getUserById(Long id);

    void updateUser(Long id, User updatedUser);

    void deleteUser(Long id);

}
