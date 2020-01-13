package hu.flowacademy.holiday.service;

import hu.flowacademy.holiday.model.User;
import hu.flowacademy.holiday.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll () {
        return userRepository.findAll();
    }

    public User findUserByName (String name) {
        return userRepository.findByName(name);
    }

    public User createUser (User user) {
        return userRepository.save(user);
    }
}
