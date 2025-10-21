package practice.crudUsers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Crud {
    public static void main(String[] args) throws IOException {
        baseUser();
        System.out.println("Просмотр всех пользователей - 1");
        System.out.println("Создание нового пользователя - 2");
        System.out.println("Редактирование записи о пользователе - 3");
        System.out.println("Удаление пользователя - 4");
        System.out.println("Введите число от 1-4 чтоб выбрать команду, или 0 - чтоб выйти");
        int number = Integer.parseInt(reader.readLine());
        while (number != 0) {
            switch (number) {
                case 1:
                    getUsers();
                    break;
                case 2:
                    createUser();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                default: System.out.println("Такой команды нет((");
            }
            System.out.println("Введите число от 1-4 чтоб выбрать команду, или 0 - чтоб выйти");
            number = Integer.parseInt(reader.readLine());
        }
    }

    static ArrayList<User> users = new ArrayList<>();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void baseUser() {
        User user = new User("dima", 18, "men");
        User user1 = new User("lena", 18, "women");
        User user2 = new User("sam", 18, "men");
        users.add(user);
        users.add(user1);
        users.add(user2);
    }
    public static void createUser() throws IOException {
        System.out.println("СОЗДАНИЕ");
        System.out.print("Введите имя: ");
        String name = reader.readLine();
        System.out.print("Введите возвраст: ");
        Integer age = null;
        while (age == null) {
            try {
                age = Integer.parseInt(reader.readLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Нужно число, попробуй еще раз");
            }
        }
        System.out.print("Введите пол: ");
        String gender = reader.readLine();
        User user3 = new User(name, age, gender);
        users.add(user3);
        getUsers();
    }
    public static void updateUser() throws IOException {
        if (users.isEmpty()) {
            System.out.println("Список пуст, добавь хотя бы одного пользователя");
            return;
        }
        System.out.println("РЕДАКТИРОВАНИЕ");
        System.out.print("Введите новое имя пользователя: ");
        String name = reader.readLine();
        System.out.print("Введите новый возраст пользователя: ");
        Integer age = null;
        while (age == null) {
            try {
                age = Integer.parseInt(reader.readLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Нужно число, попробуй еще раз");
            }
        }
        System.out.print("Введите новый пол пользователя: ");
        String gender = reader.readLine();
        System.out.print("Ввдите id пользователя для редактирования: ");
        int updateUser = Integer.parseInt(reader.readLine());
        while (updateUser < 0 || updateUser > users.size() - 1) {
            System.out.println("Несуществующий id - попробуй еще раз");
            updateUser = Integer.parseInt(reader.readLine());
        }
        User user = new User(name, age, gender);
        users.set(updateUser, user);
        getUsers();
    }

    public static void getUsers() {
        System.out.println("ВСЕ ЗАПИСИ");
        for (User user : users) {
            System.out.println(user);
        }
    }
    public static void deleteUser() throws IOException {
        if (users.isEmpty()) {
            System.out.println("Список пуст, добавь хотя бы одного пользователя");
            return;
        }
        System.out.println("УДАЛЕНИЕ");
        System.out.println("Введите id пользователя для удаления: ");
        int delUser = Integer.parseInt(reader.readLine());
        while (delUser < 0 || delUser > users.size() - 1) {
            System.out.println("Нет id, еще раз");
            delUser = Integer.parseInt(reader.readLine());
        }
        users.remove(delUser);
        getUsers();
    }
}
