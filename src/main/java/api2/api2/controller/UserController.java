package api2.api2.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api2.api2.entity.User;
import api2.api2.exception.RecordNotFoundException;
import api2.api2.model.Request;
import api2.api2.repository.UserRepository;

@RestController
@RequestMapping("/api2")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userid)
        throws RecordNotFoundException {
        User user = userRepository.findById(userid)
          .orElseThrow(() -> new RecordNotFoundException("User not found for this id :: " + userid));
        return ResponseEntity.ok().body(user);
    }
    
    @PostMapping("/user")
    public User createUser(@RequestBody Request request) {
        return userRepository.save(this.getUser(request));
    }

    private User getUser(Request request) {
		User user=new User();
		user.setName(request.getReqName());
		user.setDob(request.getReqDob());
		user.setEmail(request.getReqEmail());
		user.setMobile(request.getReqMobile());
		return user;
	}

	@PutMapping("/user/{id}")
    public ResponseEntity<User> updateUse(@PathVariable(value = "id") Long userid,
          @RequestBody User userDetails) throws RecordNotFoundException {
        User user = userRepository.findById(userid)
        .orElseThrow(() -> new RecordNotFoundException("User not found for this id :: " + userid));

        user.setName(userDetails.getName());
        user.setDob(userDetails.getDob());
        user.setEmail(userDetails.getEmail());
	user.setMobile(userDetails.getMobile());
        final User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/user/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long userid)
         throws RecordNotFoundException {
        User user = userRepository.findById(userid)
       .orElseThrow(() -> new RecordNotFoundException("User not found for this id :: " + userid));

        userRepository.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}