/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Voucher {
    private String ma;
    private String ngaybd;
    private String ngaykt;
    private int tlgiam;
    private int soluong;
    private int dhtoithieu;
    private int giamtoida;
    private int trangthai;

    public Voucher(String ma, String ten, String ngaybd, String ngaykt, int tlgiam, int soluong, int dhtoithieu, int giamtoida, int trangthai) {
        this.ma = ma;
        this.ngaybd = ngaybd;
        this.ngaykt = ngaykt;
        this.tlgiam = tlgiam;
        this.soluong = soluong;
        this.dhtoithieu = dhtoithieu;
        this.giamtoida = giamtoida;
        this.trangthai = trangthai;
    }

    public Voucher(String ma, String ngaybd, String ngaykt, int tlgiam, int soluong, int dhtoithieu, int giamtoida, int trangthai) {
        this.ma = ma;
        this.ngaybd = ngaybd;
        this.ngaykt = ngaykt;
        this.tlgiam = tlgiam;
        this.soluong = soluong;
        this.dhtoithieu = dhtoithieu;
        this.giamtoida = giamtoida;
        this.trangthai = trangthai;
    }

    public Voucher() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }


    public String getNgaybd() {
        return ngaybd;
    }

    public void setNgaybd(String ngaybd) {
        this.ngaybd = ngaybd;
    }

    public String getNgaykt() {
        return ngaykt;
    }

    public void setNgaykt(String ngaykt) {
        this.ngaykt = ngaykt;
    }

    public int getTlgiam() {
        return tlgiam;
    }

    public void setTlgiam(int tlgiam) {
        this.tlgiam = tlgiam;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDhtoithieu() {
        return dhtoithieu;
    }

    public void setDhtoithieu(int dhtoithieu) {
        this.dhtoithieu = dhtoithieu;
    }

    public int getGiamtoida() {
        return giamtoida;
    }

    public void setGiamtoida(int giamtoida) {
        this.giamtoida = giamtoida;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "Voucher{" + "ma=" + ma + ", ngaybd=" + ngaybd + ", ngaykt=" + ngaykt + ", tlgiam=" + tlgiam + ", soluong=" + soluong + ", dhtoithieu=" + dhtoithieu + ", giamtoida=" + giamtoida + ", trangthai=" + trangthai + '}';
    }
    
    public Object[] todataRow(){
        return new Object[]{
            this.getMa(),this.getNgaybd(), this.getNgaykt(), this.getTlgiam(),
            this.getDhtoithieu(), this.getGiamtoida(), this.getSoluong(), this.getTrangthai()
        };
    }
}
