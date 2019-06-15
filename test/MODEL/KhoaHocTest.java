/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ➻❥ ๖Kɦaї Ꮭε ๖➻❥
 */
public class KhoaHocTest {
    
    public KhoaHocTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class KhoaHoc.
     */
    @Test
    public void testToString() {
        System.out.println("testToString");
        KhoaHoc instance = new KhoaHoc();
        String expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);

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
    public void testGetMaKHDNE() { //does not exist
        System.out.println("getMaKH does not exit");
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

    
        @Test
    public void testSetMaKHDNE() {
        System.out.println("setMaKH does not exit");
        int maKH = -1;
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
        String expResult = "PD02292";
        String result = instance.getMaCD();
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testGetMaCDDNE() {
        System.out.println("getMaCD does not exit");
        KhoaHoc instance = new KhoaHoc();
        String expResult = null;
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
    public void testSetMaCDDNE() {
        System.out.println("setMaCD does not exit");
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
        double expResult = 9.9;
        double result = instance.getHocPhi();
        assertEquals(expResult, result, 0.0);
       
    }
    
//     @Test
//    public void testGetHocPhiDNE() {
//        System.out.println("getHocPhi ");
//        KhoaHoc instance = new KhoaHoc();
//        double expResult = ;
//        double result = instance.getHocPhi();
//        assertEquals(expResult, result, 0.0);
//  
//    }

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
    
       @Test
    public void testSetHocPhiDNE() {
        System.out.println("setHocPhi does not exit");
        double hocPhi = -1445.2;
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

       @Test
    public void testGetThoiLuongDNE() {
        System.out.println("getThoiLuong does not exit");
        KhoaHoc instance = new KhoaHoc();
        int expResult = -10;
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
    
     @Test
    public void testSetThoiLuongDNE() {
        System.out.println("setThoiLuong does not exit");
        int thoiLuong = -10;
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
    public void testGetGhiChu() {
        System.out.println("getGhiChu");
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

    /**
     * Test of getMaNV method, of class KhoaHoc.
     */
    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "PD02292";
        String result = instance.getMaNV();
        assertEquals(expResult, result);
        
    }

       @Test
    public void testGetMaNVDNE() {
        System.out.println("getMaNV does not exit");
        KhoaHoc instance = new KhoaHoc();
        String expResult = null;
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
    public void testSetMaNVDNE() {
        System.out.println("setMaNV does not exit");
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
