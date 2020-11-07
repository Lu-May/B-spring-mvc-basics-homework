package com.thoughtworks.capacity.gtb.mvc.repository;

import com.thoughtworks.capacity.gtb.mvc.dto.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    private final Map<String, User> users = new HashMap<>();

    public Integer setId() {
        return users.size() + 1;
    }

    public void register(User user) {
        users.put(user.getUsername(), user);
    }

    public User findByUsername(String username) {
        return users.get(username);
    }

    public boolean isExist(User user) {
        return users.containsKey(user.getUsername());
    }
}
