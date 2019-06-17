/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;
import org.powermock.core.classloader.annotations.PrepareForTest;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ➻❥ ๖Kɦaї Ꮭε ๖➻❥
 */
@PrepareForTest( { KhoaHoc.class})
public class KhoaHocNGTest {
    
    public KhoaHocNGTest() {
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
     * Test of toString method, of class KhoaHoc.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        KhoaHoc instance = new KhoaHoc();
        String expResult = null;
        String result = instance.toString();
        assertEquals(result, expResult);
  
    }

    /**
     * Test of getMaKH method, of class KhoaHoc.
     */
    @Test
    public void testGetMaKH() {
        System.out.println("getMaKH");
        KhoaHoc instance = new KhoaHoc();
        int expResult = 0;
        int result = instance.getMaKH();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetMaKHfail() { //does not exist
        System.out.println("getMaKH fail");
        KhoaHoc instance = new KhoaHoc();
        int expResult = -1;
        int result = instance.getMaKH();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMaKH method, of class KhoaHoc.
     */
    @Test
    public void testSetMaKH() {
        System.out.println("setMaKH");
        int maKH = 1;
        KhoaHoc instance = new KhoaHoc();
        instance.setMaKH(maKH);
    }

    /**
     * Test of getMaCD method, of class KhoaHoc.
     */
    @Test
    public void testGetMaCD() {
        System.out.println("getMaCD");
        KhoaHoc instance = new KhoaHoc();
        String expResult = null;
        String result = instance.getMaCD();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetMaCDfail() {
        System.out.println("getMaCD fail");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "PD02292";
        String result = instance.getMaCD();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMaCD method, of class KhoaHoc.
     */
    @Test
    public void testSetMaCD() {
        System.out.println("setMaCD");
        String maCD = "PD02292";
        KhoaHoc instance = new KhoaHoc();
        instance.setMaCD(maCD);

    }

    @Test
    public void testSetMaCDfail() {
        System.out.println("setMaCD fail");
        String maCD = null;
        KhoaHoc instance = new KhoaHoc();
        instance.setMaCD(maCD);

    }

    /**
     * Test of getHocPhi method, of class KhoaHoc.
     */
    @Test
    public void testGetHocPhi() {
        System.out.println("getHocPhi");
        KhoaHoc instance = new KhoaHoc();
        double expResult = 0.0;
        double result = instance.getHocPhi();
        assertEquals(expResult, result, 0.0);

    }


    /**
     * Test of setHocPhi method, of class KhoaHoc.
     */
    @Test
    public void testSetHocPhi() {
        System.out.println("setHocPhi");
        double hocPhi = 15000.9;
        KhoaHoc instance = new KhoaHoc();
        instance.setHocPhi(hocPhi);

    }

    /**
     * Test of getThoiLuong method, of class KhoaHoc.
     */
    @Test
    public void testGetThoiLuong() {
        System.out.println("getThoiLuong");
        KhoaHoc instance = new KhoaHoc();
        int expResult = 10;
        int result = instance.getThoiLuong();
        assertEquals(expResult, result);

    }


    /**
     * Test of setThoiLuong method, of class KhoaHoc.
     */
    @Test
    public void testSetThoiLuong() {
        System.out.println("setThoiLuong");
        int thoiLuong = 10;
        KhoaHoc instance = new KhoaHoc();
        instance.setThoiLuong(thoiLuong);

    }


    /**
     * Test of getNgayKG method, of class KhoaHoc.
     */
    @Test
    public void testGetNgayKG() {
        System.out.println("getNgayKG");
        KhoaHoc instance = new KhoaHoc();
        Date expResult = null;
        Date result = instance.getNgayKG();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNgayKG method, of class KhoaHoc.
     */
    @Test
    public void testSetNgayKG() {
        System.out.println("setNgayKG");
        Date ngayKG = null;
        KhoaHoc instance = new KhoaHoc();
        instance.setNgayKG(ngayKG);

    }

    /**
     * Test of getGhiChu method, of class KhoaHoc.
     */
    @Test
    public void testGetGhiChufail() {
        System.out.println("getGhiChu fail");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "Le Van Khai";
        String result = instance.getGhiChu();
        assertEquals(expResult, result);

    }


    /**
     * Test of setGhiChu method, of class KhoaHoc.
     */
    @Test
    public void testSetGhiChu() {
        System.out.println("setGhiChu");
        String ghiChu = "Le Van Khai";
        KhoaHoc instance = new KhoaHoc();
        instance.setGhiChu(ghiChu);

    }

    @Test
    public void testSetGhiChufail() {
        System.out.println("setGhiChu");
        String ghiChu = null;
        KhoaHoc instance = new KhoaHoc();
        instance.setGhiChu(ghiChu);

    }

    /**
     * Test of getMaNV method, of class KhoaHoc.
     */
    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        KhoaHoc instance = new KhoaHoc();
        String expResult = null;
        String result = instance.getMaNV();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetMaNVfail() {
        System.out.println("getMaNV fail");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "PD02292";
        String result = instance.getMaNV();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMaNV method, of class KhoaHoc.
     */
    @Test
    public void testSetMaNV() {
        System.out.println("setMaNV");
        String maNV = "PD02292";
        KhoaHoc instance = new KhoaHoc();
        instance.setMaNV(maNV);

    }

    @Test
    public void testSetMaNVfail() {
        System.out.println("setMaNV fail");
        String maNV = null;
        KhoaHoc instance = new KhoaHoc();
        instance.setMaNV(maNV);

    }

    /**
     * Test of getNgayTao method, of class KhoaHoc.
     */
    @Test
    public void testGetNgayTao() {
        System.out.println("getNgayTao");
        KhoaHoc instance = new KhoaHoc();
        Date expResult = new KhoaHoc().getNgayTao();
        Date result = instance.getNgayTao();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetNgayTaofail() {
        System.out.println("getNgayTao fail");
        KhoaHoc instance = new KhoaHoc();
        Date expResult = null;
        Date result = instance.getNgayTao();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNgayTao method, of class KhoaHoc.
     */
    @Test
    public void testSetNgayTao() {
        System.out.println("setNgayTao");
        Date ngayTao = null;
        KhoaHoc instance = new KhoaHoc();
        instance.setNgayTao(ngayTao);
    }
    
}
