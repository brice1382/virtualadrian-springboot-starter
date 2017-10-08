package com.virtualadrian.auth.service;

import com.virtualadrian.auth.authuser.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
  User save(User user);
  void delete(Long id);
  List<User> findAll();
  User findById(Long id);
  User findByEmail(String email);
  User findByName(String name);
}
