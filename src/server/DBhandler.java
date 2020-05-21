package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBhandler extends Configs {
  Connection dbConnection;

  public Connection getDbConnection() throws ClassNotException, SQLException {

    String connectionString = "jbdc:mysql//" + dbHost + ":" + dbPort + "/" + dbName;

    Class.forName("com.mysql.jbdc.Driver");

    dbConnection = DriveManager.getConnection(connectionString, dbUser, dbPass);

    return dbConnection
  }
}
