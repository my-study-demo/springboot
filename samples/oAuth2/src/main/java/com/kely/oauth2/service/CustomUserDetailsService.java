package com.kely.oauth2.service;

import com.kely.oauth2.entity.Authority;
import com.kely.oauth2.entity.User;
import com.kely.oauth2.exception.NewUserNotFoundException;
import com.kely.oauth2.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

@Component("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserJPA userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String login) {

        String lowercaseLogin = login.toLowerCase();

        User userFromDatabase = userRepository.findByUsernameCaseInsensitive(lowercaseLogin);

        if (userFromDatabase == null) {
            throw new NewUserNotFoundException("User " + lowercaseLogin + " was not found in the database");
        }
        //获取用户的所有权限并且SpringSecurity需要的集合
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (Authority authority : userFromDatabase.getAuthorities()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getName());
            grantedAuthorities.add(grantedAuthority);
        }
        //返回一个SpringSecurity需要的用户对象
        return new org.springframework.security.core.userdetails.User(
                userFromDatabase.getUsername(),
                userFromDatabase.getPassword(),
                grantedAuthorities);

    }
}