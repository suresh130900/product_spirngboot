package net.codejava.controller;

import net.codejava.model.Login;
import net.codejava.repo.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.function.LongFunction;

@Service
@Transactional
public class LoginService {

    @Autowired
    private LoginRepository repo;

    public List<Login> list()
    {
        return repo.findAll();
    }
    public void save(Login login)
    {
        repo.save(login);
    }

//    public Login get(String userName)
//    {
//        return repo.findOne(userName);
//    }
}
