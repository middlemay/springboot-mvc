package springbootmvc.service;

import springbootmvc.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    void saveUser(User user);

    User getUserById(int id);

    void updateUser(int id, User updatedUser);

    void deleteUser(int id);

}
