/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class KichCo {
    private String ten;

    public KichCo() {
    }

    public KichCo(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "KichCo{" + "ten=" + ten + '}';
    }
    
     public Object[] toDataRow(){
        return new Object[]{
            this.getTen()
        };
    }
}
