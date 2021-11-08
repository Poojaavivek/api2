package api2.api2.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api2.api2.entity.User;
import api2.api2.repository.UserRepository;

@Service
public class UserService {
 
    @Autowired
    private UserRepository userRepository;
    
  /*  public List<User> getAllUser()
    {
        List<User> userlist =(List<User>) userRepository.findAll();
         
        if(userlist.size() > 0) {
            return userlist;
        } else {
            return new ArrayList<User>();
        }
    }*/
    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }
    
    public void save(User user) {
        userRepository.save(user);
    }
     
    public User get(Long userid) {
        return userRepository.findById(userid).get();
    }
            
        }
    