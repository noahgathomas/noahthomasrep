package com.nthomas.p9p3utilities;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionUtil {
	private static ConnectionUtil cu = null;
	private static Properties prop;

	private ConnectionUtil() {
		prop = new Properties();
		try {
			InputStream databaseProperties = ConnectionUtil.class.getClassLoader()
					.getResourceAsStream("database.properties");
			prop.load(databaseProperties);
		} catch (Exception e) {
			System.out.println("hey");
		}
	}

	public static synchronized ConnectionUtil getConnectionUtil() {
		if (cu == null)
			cu = new ConnectionUtil();
		return cu;
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(prop.getProperty("driver"));
			conn = DriverManager.getConnection(prop.getProperty("url"),
					prop.getProperty("usr"),
					prop.getProperty("psw")
			);
		} catch (Exception e) {
			System.out.println("OOPSIE POOPSIE! THE CONNECTION EXPLODED Q.q uwu");
		}
		return conn;
	}

}
