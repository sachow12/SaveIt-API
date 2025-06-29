package com.saveit.Controller;

import com.saveit.Model.User;
import com.saveit.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.findAll();
    }

    @GetMapping("/searchUser/{name}")
    public User getByName(@PathVariable String name){
        return userService.findByName(name);
    }

    @PostMapping
    public User register(@RequestBody User user){
        return userService.create(user.getEmail(), user.getPassword());
    }

    @PutMapping("/updateCredencials")
    public User updateCredencials(@RequestBody User user) {
        return userService.updateCredencials(user, user.getEmail());
    }

    @PutMapping("/updateLogin")
    public User updateLogin(@RequestBody User user){
        return userService.updateLogin(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }
}
