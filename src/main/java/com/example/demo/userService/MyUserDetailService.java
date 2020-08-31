package com.example.demo.userService;

import com.example.demo.MyUserDetails;
import com.example.demo.model.User;
import com.example.demo.userInterface.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * author:james
 * day:2020-08-31
 */
@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(username);

        user.orElseThrow(()-> new UsernameNotFoundException("Not Found UserName:"+username));

        return user.map(MyUserDetails::new).get();
    }
}
