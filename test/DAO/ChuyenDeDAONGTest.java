/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JDBCHelper;
import MODEL.ChuyenDe;
import java.util.List;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author DELL
 */
@PrepareForTest({JDBCHelper.class,ChuyenDeDAO.class})
public class ChuyenDeDAONGTest {
    ChuyenDeDAO chuyenDeDAO;
    ChuyenDeDAO chuyenDeDAOSpy;
    
    public ChuyenDeDAONGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
//        ChuyenDeDAO = new ChuyenDeDAO();
//        PowerMockito
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert method, of class ChuyenDeDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        ChuyenDe model = null;
        ChuyenDeDAO instance = new ChuyenDeDAO();
        instance.insert(model);
        
    }

    /**
     * Test of update method, of class ChuyenDeDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ChuyenDe model = null;
        ChuyenDeDAO instance = new ChuyenDeDAO();
        instance.update(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ChuyenDeDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String MaCD = "";
        ChuyenDeDAO instance = new ChuyenDeDAO();
        instance.delete(MaCD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class ChuyenDeDAO.
     */
    @Test
    public void testSelect_0args() {
        System.out.println("select");
        ChuyenDeDAO instance = new ChuyenDeDAO();
        List expResult = null;
        List result = instance.select();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class ChuyenDeDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        String macd = "";
        ChuyenDeDAO instance = new ChuyenDeDAO();
        ChuyenDe expResult = null;
        ChuyenDe result = instance.findById(macd);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByName method, of class ChuyenDeDAO.
     */
    @Test
    public void testFindByName() {
        System.out.println("findByName");
        String tencd = "";
        ChuyenDeDAO instance = new ChuyenDeDAO();
        ChuyenDe expResult = null;
        ChuyenDe result = instance.findByName(tencd);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class ChuyenDeDAO.
     */
    @Test
    public void testSelect_String_ObjectArr() {
        System.out.println("select");
        String sql = "";
        Object[] args = null;
        ChuyenDeDAO instance = new ChuyenDeDAO();
        List expResult = null;
        List result = instance.select(sql, args);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkID method, of class ChuyenDeDAO.
     */
    @Test
    public void testCheckID() {
        System.out.println("checkID");
        String maCD = "";
        ChuyenDeDAO instance = new ChuyenDeDAO();
        boolean expResult = false;
        boolean result = instance.checkID(maCD);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
