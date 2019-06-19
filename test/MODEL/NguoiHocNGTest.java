/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author tanbinh
 */
public class NguoiHocNGTest {
    
    public NguoiHocNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of toString method, of class NguoiHoc.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
    }

    /**
     * Test of getMaNH method, of class NguoiHoc.
     */
    @Test
    public void testGetMaNH() {
        System.out.println("getMaNH");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getMaNH();
        assertEquals(result, expResult);
    }

    /**
     * Test of setMaNH method, of class NguoiHoc.
     */
    @Test
    public void testSetMaNH() {
        System.out.println("setMaNH");
        String maNH = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setMaNH(maNH);
    }

    /**
     * Test of getHoTen method, of class NguoiHoc.
     */
    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getHoTen();
        assertEquals(result, expResult);
    }

    /**
     * Test of setHoTen method, of class NguoiHoc.
     */
    @Test
    public void testSetHoTen() {
        System.out.println("setHoTen");
        String hoTen = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setHoTen(hoTen);
    }

    /**
     * Test of getNgaySinh method, of class NguoiHoc.
     */
    @Test
    public void testGetNgaySinh() {
        System.out.println("getNgaySinh");
        NguoiHoc instance = new NguoiHoc();
        Date expResult = null;
        Date result = instance.getNgaySinh();
        assertEquals(result, expResult);
    }

    /**
     * Test of setNgaySinh method, of class NguoiHoc.
     */
    @Test
    public void testSetNgaySinh() {
        System.out.println("setNgaySinh");
        Date ngaySinh = null;
        NguoiHoc instance = new NguoiHoc();
        instance.setNgaySinh(ngaySinh);
    }

    /**
     * Test of isGioiTinh method, of class NguoiHoc.
     */
    @Test
    public void testIsGioiTinh() {
        System.out.println("isGioiTinh");
        NguoiHoc instance = new NguoiHoc();
        boolean expResult = false;
        boolean result = instance.isGioiTinh();
        assertEquals(result, expResult);
    }

    /**
     * Test of setGioiTinh method, of class NguoiHoc.
     */
    @Test
    public void testSetGioiTinh() {
        System.out.println("setGioiTinh");
        boolean gioiTinh = false;
        NguoiHoc instance = new NguoiHoc();
        instance.setGioiTinh(gioiTinh);
    }

    /**
     * Test of getDienThoai method, of class NguoiHoc.
     */
    @Test
    public void testGetDienThoai() {
        System.out.println("getDienThoai");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getDienThoai();
        assertEquals(result, expResult);
    }

    /**
     * Test of setDienThoai method, of class NguoiHoc.
     */
    @Test
    public void testSetDienThoai() {
        System.out.println("setDienThoai");
        String dienThoai = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setDienThoai(dienThoai);
    }

    /**
     * Test of getEmail method, of class NguoiHoc.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(result, expResult);
    }

    /**
     * Test of setEmail method, of class NguoiHoc.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setEmail(email);
    }

    /**
     * Test of getGhiChu method, of class NguoiHoc.
     */
    @Test
    public void testGetGhiChu() {
        System.out.println("getGhiChu");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getGhiChu();
        assertEquals(result, expResult);
    }

    /**
     * Test of setGhiChu method, of class NguoiHoc.
     */
    @Test
    public void testSetGhiChu() {
        System.out.println("setGhiChu");
        String ghiChu = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setGhiChu(ghiChu);
    }

    /**
     * Test of getMaNV method, of class NguoiHoc.
     */
    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(result, expResult);
    }

    /**
     * Test of setMaNV method, of class NguoiHoc.
     */
    @Test
    public void testSetMaNV() {
        System.out.println("setMaNV");
        String maNV = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setMaNV(maNV);
    }

    /**
     * Test of getNgayDK method, of class NguoiHoc.
     */
    @Test
    public void testGetNgayDK() {
        System.out.println("getNgayDK");
        NguoiHoc instance = new NguoiHoc();
        Date expResult = null;
        Date result = instance.getNgayDK();
        assertEquals(result, expResult);
    }

    /**
     * Test of setNgayDK method, of class NguoiHoc.
     */
    @Test
    public void testSetNgayDK() {
        System.out.println("setNgayDK");
        Date ngayDK = null;
        NguoiHoc instance = new NguoiHoc();
        instance.setNgayDK(ngayDK);
    }
    
}
