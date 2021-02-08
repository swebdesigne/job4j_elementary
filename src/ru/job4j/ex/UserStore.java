package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User value : users) {
            if (value.getUsername().equals(login)) {
                return value;
            }
        }
        throw new UserNotFoundException("Name " + login + " is not exists");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if ((!user.isValid()) || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("Name " + user.getUsername() + " is invalid");
        }
        return true;
    }

    public  static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Ivan Ivanov", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            validate(user);
            user = findUser(users, "Ivan Ivanov");
            validate(user);
        } catch (UserInvalidException in) {
            in.printStackTrace();
        } catch (UserNotFoundException nf) {
            nf.printStackTrace();
        }
    }
}
