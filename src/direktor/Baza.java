package direktor;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
 public  class Baza {
    String URL() {
        String url = "jdbc:mysql://localhost/reeltor?serverTimezone=Europe/Moscow&useSSL=false";
        return url;
      } 
    String LOGIN() {
        String login = "root";
        return login;
    } 
    String PASSWORD() {
        String pass = "1234";
        return pass;
    } 
}
