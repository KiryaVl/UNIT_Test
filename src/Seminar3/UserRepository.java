package Seminar3;
//Добавьте класс UserRepository для управления пользователями.
//        В этот класс должен быть включен метод addUser, который добавляет пользователя в систему, если он прошел аутентификацию.
//        Покройте тестами новую функциональность

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List <User> data = new ArrayList <> ();

    public void addUser(User user) {
        if (user.isAuth) data.add(user);
    }
    public void reLogin(){
        for (int i = 0; i < data.size() ; i++) {
            User tempUser = data.get(i);
            if (tempUser.getStatus() == "admin") {
                tempUser.isAuth = false;
            }
            tempUser.isAuth = false;
        }
    }

}
