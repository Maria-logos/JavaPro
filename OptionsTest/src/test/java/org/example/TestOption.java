package org.example;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

public class TestOption {

    @Test
    public void testFindByID() {
        UserRepository userRep = new UserRepository();
        assertTrue(userRep.findUserById(3).isPresent());
        assertTrue(userRep.findUserById(7).isEmpty());
        if (userRep.findUserById(3).isPresent())
        {
            System.out.println(userRep.findUserById(3).get());
        }
    }

    @Test
    public void testFindByEmail() {
        UserRepository userRep = new UserRepository();
        assertTrue(userRep.findUserByEmail("Anna@gmail.com").isPresent());
        assertTrue(userRep.findUserByEmail("Anna123@gmail.com").isEmpty());
        if (userRep.findUserByEmail("Anna@gmail.com").isPresent())
        {
            System.out.println(userRep.findUserByEmail("Anna@gmail.com").get());
        }
    }

    @Test
    public void testGetAllUses() {
        UserRepository userRep = new UserRepository();
        assertFalse(userRep.getUsers().isEmpty());
        assertEquals(5, userRep.getUsers().size());
        if (!userRep.getUsers().isEmpty())
        {
            System.out.println(userRep.getUsers());
        }
    }
}