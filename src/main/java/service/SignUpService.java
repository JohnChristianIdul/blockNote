package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.User;
import repositories.UserRepo;

@Service
public class SignUpService {
    @Autowired
    UserRepo userrepo;

    public User addUser(User u){
        return userrepo.save(u);
    }

    public void delPerson(User u){
        userrepo.delete(u);
    }
}
