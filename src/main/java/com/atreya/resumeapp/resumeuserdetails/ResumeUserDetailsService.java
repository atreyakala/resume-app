package com.atreya.resumeapp.resumeuserdetails;

import com.atreya.resumeapp.user.User;
import com.atreya.resumeapp.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResumeUserDetailsService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    Optional<User> user = userRepository.findByUserName(userName);

    user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

    return user.map(ResumeUserDetails::new).get();
  }
}
