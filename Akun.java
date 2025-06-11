/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gudangpintar;

/**
 *
 * @author Lenovo
 */
public class Akun {
    
    private String Username, Password, role, IdAkun;
    
    
    public Akun( String IdAkun,String Username, String Password, String role){
        
        this.IdAkun = IdAkun;
        this.Username = Username;
        this.Password = Password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getIdAkun() {
        return IdAkun;
    }
    
    
}
