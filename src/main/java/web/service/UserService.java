package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void creatUser(User users);

    void updatUser(User users);

    List<User> getAllUsers();

    User getUserId(Long id);

    void delUser(Long id);
}
