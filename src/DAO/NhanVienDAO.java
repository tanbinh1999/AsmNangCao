/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JDBCHelper;
import MODEL.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tanbinh
 */
public class NhanVienDAO {
    public void insert(NhanVien model) {
        String sql = "insert into NhanVien(MaNV, MatKhau, HoTen, VaiTro) values (?,?,?,?)";
        JDBCHelper.executeUpdate(sql,
                model.getMaNV(),
                model.getMatkhau(),
                model.getHoTen(),
                model.isVaiTro()
        );
    }

    public void update(NhanVien model) {
        String sql = "update NhanVien set MatKhau=?, HoTen=?, VaiTro=? where MaNV=?";
        JDBCHelper.executeUpdate(sql,
                model.getMatkhau(),
                model.getHoTen(),
                model.isVaiTro(),
                model.getMaNV());
    }

    public void delete(String MaNV) {
        String sql = "delete from NhanVien where MaNV=?";
        JDBCHelper.executeUpdate(sql, MaNV);
    }

    public List<NhanVien> select() {
        String sql = "select * from NhanVien";
        return select(sql);
    }

    public NhanVien findByld(String manv) {
        String sql = "select * from NhanVien where MaNV=?";
        List<NhanVien> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<NhanVien> select(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NhanVien model = readFromResultSet(rs);
                    list.add(model);
                }

            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private NhanVien readFromResultSet(ResultSet rs) throws SQLException {
        NhanVien model = new NhanVien();
        model.setMaNV(rs.getString("MaNV"));
        model.setMatkhau(rs.getString("MatKhau"));
        model.setHoTen(rs.getString("HoTen"));
        model.setVaiTro(rs.getBoolean("VaiTro"));
        return model;
    }
    public boolean checkID(String id){
        String sql = "SELECT * FROM NhanVien WHERE MaNV LIKE ?";
        List<NhanVien> list = select(sql , id);
        return list.isEmpty();
    }
}
