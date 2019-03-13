package com.example.singledb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
@Slf4j
public class SingledbApplication implements CommandLineRunner{
    @Autowired
	private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SingledbApplication.class, args);
	}

	@Override
	public void run(String ...args) throws Exception {
        showConnection();
	}

	private void showConnection() throws SQLException {
        log.info(dataSource.toString());
        Connection conn = dataSource.getConnection();
        log.info(conn.toString());
        conn.close();
    }
}