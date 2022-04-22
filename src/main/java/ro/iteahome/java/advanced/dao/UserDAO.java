package ro.iteahome.java.advanced.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;

@Component
public class UserDAO {

    @Autowired
    private DataSource dataSource;

    public void doSomething() throws SQLException {
        dataSource.setLogWriter(null);
    }

}
