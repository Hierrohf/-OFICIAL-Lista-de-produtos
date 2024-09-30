package br.com.estoque.interfaces;

import br.com.estoque.entities.User;

import java.util.List;

public interface UserService {

    void istert(User user);
    void update(User user);
    void deletById(Integer id);
    User findById(Integer id);
    List<User> findAll();

}
