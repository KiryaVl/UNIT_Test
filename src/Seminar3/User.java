package Seminar3;
/*
Разработайте класс User с методом аутентификации по логину и паролю.
 Метод должен возвращать true, если введенные логин и пароль корректны, иначе false. Протестируйте все методы
 */
public class User {
    private String login;
    private String password;
    private String status;
    public boolean isAuth;
    public User(String login, String password, String status) {
        this.login = login;
        this.password = password;
        this.status = status;
    }

    public String getLogin() {
        return login;
    }

    public String getStatus() {
        return status;
    }

    public boolean isAuth() {
        return isAuth;
    }

    public boolean auth(String login, String password) {
        isAuth =  login == this.login && this.password == password;
        return isAuth;
    }
}
