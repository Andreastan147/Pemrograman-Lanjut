/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADT
 */
public class Saldo {
    private static Saldo instanceSaldo;
    private int saldo;
    
    private Saldo(){
        saldo = 500000;
    };

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public static Saldo getInstance() {
        if (instanceSaldo == null) {
            instanceSaldo = new Saldo();
        }
        
        return instanceSaldo;
    }
}
