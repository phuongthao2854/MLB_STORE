/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class ChatLieu{
    private String ten;
    private String trangthai;

    public ChatLieu() {
    }

    public ChatLieu(String ten, String trangthai) {
        this.ten = ten;
        this.trangthai = trangthai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "ChatLieu{" + "ten=" + ten + ", trangthai=" + trangthai + '}';
    }
    
    public Object[] toDataRow(){
        return new Object[]{
            this.getTen(), this.getTrangthai()
        };
    }
}
