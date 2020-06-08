package me.kimyounghan;

import me.kimyounghan.account.Account;
import me.kimyounghan.account.AccountRepository;
import me.kimyounghan.account.Role;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Neo4jRunner implements ApplicationRunner {
//    @Autowired
//    SessionFactory sessionFactory;

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setUsername("test3");
        account.setEmail("test3@gmail.com");

        Role role = new Role();
        role.setName("user");

        account.getRoles().add(role);

//        Session session = sessionFactory.openSession();
//        session.save(account);
//        sessionFactory.close();

        accountRepository.save(account);

        System.out.println("finished");
    }
}
