/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Saldo;

/**
 *
 * @author ADT
 */
public class ATMService implements IATMService {
    
    private Saldo _saldo;

    public ATMService() {
        _saldo = Saldo.getInstance();
    }
    
    @Override
    public int getSaldo() {
        return _saldo.getSaldo();
    }

    @Override
    public void tarikTunai(int jumlah) {
        _saldo.setSaldo(jumlah);
    }

    @Override
    public void setorTunai(int jumlah) {
         _saldo.setSaldo(jumlah);
    } 
}