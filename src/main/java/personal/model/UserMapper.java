package personal.model;

import personal.views.ViewUser;

public class UserMapper implements Mapper {
    @Override
    public String map(User user) {
        if (ViewUser.choice){
            return String.format("%s;%s;%s;%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
        }
        return String.format("%s,%s,%s,%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    @Override
    public User map(String line) {
        String[] lines = line.split("[,;.:]|; ");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}