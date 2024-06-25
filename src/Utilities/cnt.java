package Utilities;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LVQ
 */
public class cnt {
    public static void main(String[] args) {
        cnt();
    }
    public static final Connection cnt(){
        try {
            Connection cnt=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-J0PUJ9M\\SQLEXPRESS:1433;databaseName=PRO1041;user=sa;password=123456;encrypt=false;");
             return cnt;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
