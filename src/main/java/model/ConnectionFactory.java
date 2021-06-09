/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.Database;

/**
 *
 * @author Murilo Andrade
 */
public class ConnectionFactory {
    private Database database;
    private boolean isConnected = false;
    
    public ConnectionFactory() {
        
    }
    
    public Database getConn(){
        Database conn = null;
        System.out.println(isConnected);
        if(!this.isConnected) {
            conn = this.database.connect();
            this.isConnected = true;
        }
        return conn;
    }
}
