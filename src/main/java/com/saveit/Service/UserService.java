package com.saveit.Service;

import com.saveit.Model.User;
import com.saveit.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findByName(String name){
        return userRepository.findByName(name);
    }

    public User create(User user){
        if(user == null) throw new NullPointerException("User is Null!");
        return userRepository.save(user);
    }

    public User updateCredencials(User user, String email){
        if(user == null) throw new NullPointerException("User is Null!");

        User entity = userRepository.findByName(email);
        entity.setName(user.getName());
        entity.setOccupation(user.getOccupation());
        entity.setPhone(user.getPhone());
        entity.setBirthday(user.getBirthday());
        return userRepository.save(entity);

    }

    public void delete(Long id ){
        User entity = userRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("No records found for this ID!"));
        userRepository.delete(entity);
    }

    public User updateLogin(User user){
        if(user == null) throw new NullPointerException("User is null!");

        User entity = userRepository.findByEmail(user.getEmail());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        userRepository.save(entity);
        return entity;
    }
}
