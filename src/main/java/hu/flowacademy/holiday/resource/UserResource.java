package hu.flowacademy.holiday.resource;

import hu.flowacademy.holiday.model.User;
import hu.flowacademy.holiday.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    public List<User> findAllUsers (){
        return userService.findAll();
    }

    @GetMapping("user/{name}")
    public User findUserByName(@PathVariable String name) {
        return userService.findUserByName(name);
    }

    @PostMapping("user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
