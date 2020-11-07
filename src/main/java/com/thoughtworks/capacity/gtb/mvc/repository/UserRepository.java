package com.thoughtworks.capacity.gtb.mvc.repository;

import com.thoughtworks.capacity.gtb.mvc.dto.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    private final Map<String, User> users = new HashMap<>();

    public int setId() {
        return users.size() + 1;
    }

    public void register(User user) {
        users.put(user.getUsername(), user);
    }
}
