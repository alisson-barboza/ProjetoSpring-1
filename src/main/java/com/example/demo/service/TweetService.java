package com.example.demo.service;

import com.example.demo.model.Tweet;
import com.example.demo.model.User;
import com.example.demo.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Criado por Mariana
 * Data: 18/12/2018
 **/

@Service
public class TweetService {

    @Autowired
    private TweetRepository repository;

    public ResponseEntity salvar(Tweet tweet){
        return ResponseEntity.ok(repository.save(tweet));
    }

    public List<Tweet> listar() {
        return repository.findAll();
    }

    public Tweet feedUser(User u) {
        return repository.findByUser(u);
    }
}
