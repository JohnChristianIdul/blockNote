package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.User;
import repositories.UserRepo;

@Service
public class LoginService {
    @Autowired
    UserRepo userRepo;

    public User authenticate(User user) {
        // Retrieve the user by username from the repository
        User foundUser = userRepo.getByUsername(user.getUsername());

        // Check if the user exists and if the provided passkey matches
        if (foundUser != null && foundUser.getPassKey().equals(user.getPassKey())) {
            return foundUser;
        } else {
            return null;
        }
    }
}
