package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        boolean rsl = false;
        String name = "";
        int i = 0;
        for (; i < users.length; i++) {
            User value = users[i];
            if (!value.getUsername().equals(login)) {
                name = login;
            } else {
                rsl = true;
                break;
            }
        }
        if (!rsl) {
            throw new UserNotFoundException("Name " + name + " is not exists");
        }
        return users[i];
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
