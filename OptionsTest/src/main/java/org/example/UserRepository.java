package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    public List<User> getUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "Nick", "nick@gmail.com"));
        list.add(new User(2, "Mary", "mary@gmail.com"));
        list.add(new User(3, "Tom", "tom@gmail.com"));
        list.add(new User(4, "Anna", "anna@gmail.com"));
        list.add(new User(5, "Alex", "alex@gmail.com"));
        return list;
    }

    public Optional<User> findUserById(int id)  {
        return Optional.of(getUsers().stream().filter(e->e.getId() == id).findFirst()).get();
    }

    public Optional<User> findUserByEmail(String email)
    {
        return Optional.of(getUsers().stream().filter(e->e.getEmail().equals(email.toLowerCase())).findFirst()).get();
    }

    public Optional <List<User>> findAllUsers()
    {
        return Optional.of(getUsers());
    }
}