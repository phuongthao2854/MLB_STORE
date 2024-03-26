/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Voucher;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Voucher_Service {
    private List<Voucher> listVC;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public List<Voucher> getAll(){
        listVC = new ArrayList<>();
        sql = "  select MaVoucher, NgayBatDau, NgayKetThuc, TiLeGiam, SoLuong, DonHangToiThieu, GiamToiDa, TrangThai from Voucher ";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Voucher vc = new Voucher(rs.getString(1), rs.getString(2),rs.getString(3), rs.getInt(4),rs.getInt(5),
                rs.getInt(6),rs.getInt(7),rs.getInt(8)
                );
                listVC.add(vc);
            }
            return listVC;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
