package com.alunosif.projeto_chamadosti.service;

import com.alunosif.projeto_chamadosti.model.User;
import com.alunosif.projeto_chamadosti.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User insert(User user){
        return userRepository.save(user);
    }

    public User findById(Integer id){
        return userRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Usuario não encontrado"));
    }

    public Integer findIdByUsername(String username){
        User user = userRepository.findByUsername(username).orElseThrow(()-> new IllegalArgumentException("Usuario não enconnrado"));
        return user.getId();

    }

    public void delete(Integer id){
        userRepository.deleteById(id);
    }








}
