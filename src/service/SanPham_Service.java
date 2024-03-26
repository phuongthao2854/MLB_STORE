/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import model.SanPham;

/**
 *
 * @author Admin
 */
public class SanPham_Service {

    private List<SanPham> listSP;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public List<SanPham> getAll() {
        listSP = new ArrayList<>();
//        sql = "select sp.MaSanPham, sp.TenSP, s.TenSize, ms.TenMauSac, cl.TenChatLieu, sp.SoLuong, sp.GiaBan, dm.TenDanhMuc, sp.TrangThai from SanPham sp\n"
//                + "join Size s on sp.ID_Size = s.ID_Size\n"
//                + "join ChatLieu cl on sp.ID_ChatLieu = cl.ID_ChatLieu\n"
//                + "join MauSac ms on sp.ID_MauSac = ms.ID_MauSac\n"
//                + "join DanhMuc dm on sp.ID_DanhMuc = dm.ID_DanhMuc";
        sql = "select MaSanPham,TenSP,GiaBan,SoLuong,ID_Size,ID_MauSac,ID_DanhMuc,ID_ChatLieu,TrangThai from SanPham  ";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
               SanPham sp = new SanPham(
                       rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),
                       rs.getInt(7),rs.getInt(8),rs.getString(9)            
               );
                listSP.add(sp);
            }
            return listSP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
