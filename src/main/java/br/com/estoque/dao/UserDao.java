package br.com.estoque.dao;

import br.com.estoque.entities.User;
import br.com.estoque.interfaces.UserService;

import java.util.List;

public class UserDao implements UserService {
    @Override
    public void istert(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void deletById(Integer id) {

    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }
}
