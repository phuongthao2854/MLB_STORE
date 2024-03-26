/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String masp;
    private String tensp;
    private int giaBan;
    private int soLuong;
    private int id_size;
    private int id_mau;
    private int id_danhmuc;
    private int id_chatLieu;
    private String trangThai;

    public SanPham() {
    }

    public SanPham(String masp, String tensp, int giaBan, int soLuong, int id_size, int id_mau, int id_danhmuc, int id_chatLieu, String trangThai) {
        this.masp = masp;
        this.tensp = tensp;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.id_size = id_size;
        this.id_mau = id_mau;
        this.id_danhmuc = id_danhmuc;
        this.id_chatLieu = id_chatLieu;
        this.trangThai = trangThai;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getId_size() {
        return id_size;
    }

    public void setId_size(int id_size) {
        this.id_size = id_size;
    }

    public int getId_mau() {
        return id_mau;
    }

    public void setId_mau(int id_mau) {
        this.id_mau = id_mau;
    }

    public int getId_danhmuc() {
        return id_danhmuc;
    }

    public void setId_danhmuc(int id_danhmuc) {
        this.id_danhmuc = id_danhmuc;
    }

    public int getId_chatLieu() {
        return id_chatLieu;
    }

    public void setId_chatLieu(int id_chatLieu) {
        this.id_chatLieu = id_chatLieu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Object[] toDataRow(){
        return new Object[]{
            this.getMasp(), this.getTensp(),this.getGiaBan(), this.getSoLuong(),
            this.getId_size(), this.getId_mau(),this.getId_danhmuc(), this.getId_chatLieu(), this.getTrangThai()
        };
    }

    @Override
    public String toString() {
        return "SanPham{" + "masp=" + masp + ", tensp=" + tensp + ", giaBan=" + giaBan + ", soLuong=" + soLuong + ", id_size=" + id_size + ", id_mau=" + id_mau + ", id_danhmuc=" + id_danhmuc + ", id_chatLieu=" + id_chatLieu + ", trangThai=" + trangThai + '}';
    }
    
}
