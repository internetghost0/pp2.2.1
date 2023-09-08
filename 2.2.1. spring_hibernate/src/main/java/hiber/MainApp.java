package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.hibernate.Hibernate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);
        Car car1 = new Car("Toyota", 123);
        User user1 = new User("John", "Doe", "john.doe@example.com", car1);

        Car car2 = new Car("Honda", 456);
        User user2 = new User("Jane", "Smith", "jane.smith@example.com", car2);

        Car car3 = new Car("Mistubishi", 789);
        User user3 = new User("Kyle", "Sherlock", "kyle.sherlock@example.com", car3);

        userService.add(user1);
        userService.add(user2);
        userService.add(user3);

        User userFound = userService.getUsersByCarModelAndSeries("Toyota", 123);
        System.out.println(userFound);

        List<User> allUsers = userService.listUsers();
        for (User user : allUsers) {
            System.out.println(user);
        }

        context.close();
    }
}
