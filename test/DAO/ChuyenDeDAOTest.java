/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JDBCHelper;
import MODEL.ChuyenDe;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author DELL
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({JDBCHelper.class, ChuyenDeDAO.class})
public class ChuyenDeDAOTest {
    ChuyenDeDAO chuyenDeDAO;
    ChuyenDeDAO chuyenDeDAOSpy;
    
    public ChuyenDeDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        chuyenDeDAO  = new ChuyenDeDAO();
        PowerMockito.mockStatic(JDBCHelper.class);
        chuyenDeDAOSpy = PowerMockito.spy(new ChuyenDeDAO());
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class ChuyenDeDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        ChuyenDe model = new ChuyenDe();
        
        chuyenDeDAO.insert(model);
    }
    
    @Test(expected = NullPointerException.class)
    public void testInsertWithNullModel(){
        System.out.println("Insert with null model");
        ChuyenDe model = null;
        
        chuyenDeDAO.insert(model);
    }

    /**
     * Test of update method, of class ChuyenDeDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ChuyenDe model = new ChuyenDe();
        
        chuyenDeDAO.update(model);
    }
    
    
    @Test(expected = NullPointerException.class)
    public void testUpdateWithNullModel(){
        System.out.println("update with null model");
        ChuyenDe model = null;
        
        chuyenDeDAO.update(model);
        
    }

    /**
     * Test of delete method, of class ChuyenDeDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        ChuyenDe model = new ChuyenDe();
        
        chuyenDeDAO.delete("01");
//        String MaCD = "";
//        ChuyenDeDAO instance = new ChuyenDeDAO();
//        instance.delete(MaCD);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test(expected = NullPointerException.class)
    public void testDelectWithNullModel(){
        System.out.println("update with null model");
        ChuyenDe model = null;
        
        chuyenDeDAO.delete("01");
    }

    /**
     * Test of select method, of class ChuyenDeDAO.
     */
    @Test
    public void testSelect_0args()throws Exception{
        System.out.println("select");
        ChuyenDe chuyenDe = new ChuyenDe();
        List<ChuyenDe> expectedResult = new ArrayList<>();
        
        expectedResult.add(chuyenDe);
        PowerMockito.doReturn(expectedResult).when(chuyenDeDAOSpy, "select", ArgumentMatchers.anyString());
        List<ChuyenDe> result = chuyenDeDAOSpy.select();
        assertThat(result, CoreMatchers.is(expectedResult));
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
        assertEquals(expResult, result);
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
        assertEquals(expResult, result);
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
        List<ChuyenDe> expResult = null;
        List<ChuyenDe> result = instance.select(sql, args);
        assertEquals(expResult, result);
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
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
