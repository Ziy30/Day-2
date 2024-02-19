package lesson10;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TempConvService {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/temperatureconvert";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public TempConvService(){
    }

    public void saveTemperature(Temp temp){
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "INSERT INTO temp_conv (temperature, input_scale, celsius, fahrenheit, kelvin, rankine, reumur ) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setDouble(1, temp.getTemperature());
                preparedStatement.setString(2, temp.getInput_scale());
                preparedStatement.setDouble(3, temp.getCelsius());
                preparedStatement.setDouble(4, temp.getFahrenheit());
                preparedStatement.setDouble(5, temp.getKelvin());
                preparedStatement.setDouble(6, temp.getRankine());
                preparedStatement.setDouble(7, temp.getReumur());
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            System.err.println("Connection Fail");
            e.printStackTrace();
        }
    }
}