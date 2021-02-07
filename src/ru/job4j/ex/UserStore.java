package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        if (!users[0].getUsername().equals(login)) {
            throw new UserNotFoundException("This user not exists");
        }
        return users[0];
    }

    public static boolean validate(User user) throws UserInvalidException {
        if ((!user.isValid()) || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("Name is invalid");
        }
        return true;
    }

    public  static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            validate(user);
        } catch (UserInvalidException in) {
            in.printStackTrace();
        } catch (UserNotFoundException nf) {
            nf.printStackTrace();
        }

    }
}
