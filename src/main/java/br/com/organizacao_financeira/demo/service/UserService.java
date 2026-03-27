package br.com.organizacao_financeira.demo.service;

import br.com.organizacao_financeira.demo.entity.User;
import br.com.organizacao_financeira.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User crateUser(User user) {
        return repository.save(user);
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }

    public User changeUser(Long id, User user) {
        Optional<User> oldUser = repository.findById(id);

        if (oldUser.isPresent()) {
            User userUpdate = oldUser.get();
            userUpdate.setEmail(user.getEmail());
            userUpdate.setName(user.getName());
            userUpdate.setPassword(user.getPassword());
            userUpdate.setMonthlyIncome(user.getMonthlyIncome());

            repository.save(userUpdate);
            return userUpdate;
        } else {
            throw new RuntimeException("User not found");
        }

    }

    public User getUserById(Long id) {
        Optional<User> teste = repository.findById(id);
        if (teste.isEmpty()) {
            throw new RuntimeException("User not found");
        } else {
            User user = teste.get();
            return user;
        }
    }
}
