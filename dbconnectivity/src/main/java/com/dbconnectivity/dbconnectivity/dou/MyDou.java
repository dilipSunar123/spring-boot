package com.dbconnectivity.dbconnectivity.dou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class MyDou {

    @Autowired
    public JdbcTemplate jdbcTemplate;

//    public void createTable () {
//        var query = "CREATE TABLE myTab(id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL)";
//        int update = this.jdbcTemplate.update(query);
//
//        System.out.println(update);
//    }

    public void insertValue (int id, String name) {
        var query = "INSERT INTO myTab VALUES(?, ?)";
        int update = this.jdbcTemplate.update(query, id, name);

        System.out.println(update);
    }

}
