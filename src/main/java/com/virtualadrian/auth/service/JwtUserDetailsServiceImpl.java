package com.virtualadrian.auth.service;

import com.virtualadrian.auth.authuser.User;
import com.virtualadrian.auth.repository.UserRepository;
import com.virtualadrian.auth.JwtUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByName(username);
        if(user == null) {
            throw new UsernameNotFoundException(String
                    .format("No user found with username '%s'.", username));
        }
        return JwtUserFactory.create(user);
    }
}
