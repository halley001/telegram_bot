package org.example;

import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import  java.sql.PreparedStatement;

public class Database {

    private static final String URL = "jdbc:mysql://127.0.0.1/3006/iugetbot";
    private static final String USER = "root";
    private static final String PASSWORD = "";



    public static void main(String[] args) throws TelegramApiException, SQLException {


        Bot myBotData = new Bot();
        String userName = myBotData.getBotUsername();
        String firstName = myBotData.getMe().getFirstName();
        String lastName = myBotData.getMe().getLastName();
        Long telegramID = myBotData.getMe().getId();
        Boolean isPremium = myBotData.getMe().getIsPremium();


        String sql = "INSERT INTO users(username, firstname, lastname, telegram_id, is_premium ) VALUES(?,?,?,?,?)";


        try{
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement insertStmt = conn.prepareStatement(sql);

                insertStmt.setString(1, userName);
                insertStmt.setString(2, firstName);
                insertStmt.setString(3, lastName);
                insertStmt.setLong(4, telegramID);
                insertStmt.setBoolean(5, isPremium);

                insertStmt.executeUpdate();



        } catch(SQLException e){
            e.printStackTrace();
            System.out.println("An error occurred" + e.getMessage());
        }


    }
}


