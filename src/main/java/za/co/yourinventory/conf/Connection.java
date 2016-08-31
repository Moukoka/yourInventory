package za.co.yourinventory.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rosie on 2016/08/23.
 */
//@Configuration
//@ComponentScan("za.co.yourinventory")
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "za.co.yourinventory.repositories")

public class Connection {

    //Connection con = DriverManager.getConnection(url, "root", "root");
    //try{
        //Class.forName("com.mysql.jdbc.Driver");

        //Connection con= DriverManager.getConnection(
            //    "jdbc:mysql://localhost:3306/mydb", "root", "root");

//here sonoo is database name, root is username and password

        //Statement stmt=con.createStatement();

        //ResultSet rs=stmt.executeQuery("select * from emp");

        //while(rs.next())
            //System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

       // con.close();
//
   // }catch(Exception e){ System.out.println(e);}

}

