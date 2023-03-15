package personal;

import personal.controllers.UserController;
import personal.model.*;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users_df.txt");
        Repository repository = new RepositoryFile(fileOperation, new UserMapper());
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}

