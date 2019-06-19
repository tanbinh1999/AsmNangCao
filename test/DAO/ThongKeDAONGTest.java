/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
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
public class ThongKeDAONGTest {
    
    public ThongKeDAONGTest() {
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
     * Test of getNguoiHoc method, of class ThongKeDAO.
     */
    @Test
    public void testGetNguoiHoc() {
        System.out.println("getNguoiHoc");
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.getNguoiHoc();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBangDiem method, of class ThongKeDAO.
     */
    @Test
    public void testGetBangDiem() {
        System.out.println("getBangDiem");
        Integer makh = null;
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.getBangDiem(makh);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiemTheoChuyenDe method, of class ThongKeDAO.
     */
    @Test
    public void testGetDiemTheoChuyenDe() {
        System.out.println("getDiemTheoChuyenDe");
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.getDiemTheoChuyenDe();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoanhThu method, of class ThongKeDAO.
     */
    @Test
    public void testGetDoanhThu() {
        System.out.println("getDoanhThu");
        int nam = 0;
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.getDoanhThu(nam);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
