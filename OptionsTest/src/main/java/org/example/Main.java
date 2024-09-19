package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserRepository userRep = new UserRepository();
        // check  findUserById
        if (userRep.findUserById(3).isPresent())
        {
            System.out.println(userRep.findUserById(3).get());
        }
        if (userRep.findUserById(7).isPresent())
        {
            System.out.println(userRep.findUserById(3).get());
        }
        // check findUserByName
        if (userRep.findUserByEmail("anna@gmail.com").isPresent())
        {
            System.out.println(userRep.findUserByEmail("anna@gmail.com").get());
        }
        if (userRep.findUserByEmail("annvva@gmail.com").isPresent())
        {
            System.out.println(userRep.findUserByEmail("anna@gmail.com").get());
        }
        // check findAllUsers
        if (userRep.findAllUsers().isPresent())
        {
            System.out.println(userRep.findAllUsers());
        }
    }
}