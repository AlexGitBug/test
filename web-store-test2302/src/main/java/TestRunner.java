import dao.RoleDao;
import entity.Order;
import entity.Role;
import entity.User;
import entity.enums.Rank;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.io.Serializable;
import java.time.LocalDate;

public class TestRunner {
    public static void main(String[] args) {
        var user = User.builder()
                .firstName("Serege1")
                .lastName("Seregov")
                .email("test@mail.ru")
                .password("123")
                .telephone("+375 (29) 111-22-33")
                .birthDate(LocalDate.of(2000, 1, 12))
                .roleId(Rank.ADMIN)
                .build();


        try (var sessionFactory = HibernateUtil.buildSessionFactory();
             var session = sessionFactory.openSession()) {


             session.save(user);
        }
    }
}
