package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        User user = new User("Vlad", "Vladov", (byte) 29);
        User user1 = new User("Karina", "Karinova", (byte) 19);
        User user2 = new User("Oleg", "Olegov", (byte) 33);
        User user3 = new User("Ivan", "Ivanov", (byte) 11);
        userService.saveUser(user.getName(),user.getLastName(),user.getAge());
        userService.saveUser(user1.getName(),user1.getLastName(),user1.getAge());
        userService.saveUser(user2.getName(),user2.getLastName(),user2.getAge());
        userService.saveUser(user3.getName(),user3.getLastName(),user3.getAge());
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
