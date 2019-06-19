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
        String MaCD="01";
        chuyenDeDAO.delete(MaCD);
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
    public void testFindById() throws Exception {
        System.out.println("findById");
        String macd = "12";
        
        ChuyenDe expResult = new ChuyenDe();
        List<ChuyenDe> resultList = new ArrayList<>();
        resultList.add(expResult);
        
        PowerMockito.doReturn(resultList).when(chuyenDeDAOSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        ChuyenDe  result = chuyenDeDAOSpy.findById(macd);
        assertThat(result, CoreMatchers.is(expResult));
        
    }
    
    @Test
    public void testFinByIdWithNotFound() throws Exception{
        System.out.println("findById");
        String macd = "";
        
        ChuyenDe exResult = null;
        List<ChuyenDe> resultList = new ArrayList<>();
        
        PowerMockito.doReturn(resultList).when(chuyenDeDAOSpy, "Select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        
        ChuyenDe result = chuyenDeDAOSpy.findById(macd);
        assertThat(result, CoreMatchers.is(exResult));
    }

    /**
     * Test of findByName method, of class ChuyenDeDAO.
     */
    @Test
    public void testFindByName() throws Exception {
        System.out.println("findByName");
        String tencd = "JAVA";
        ChuyenDe exResult = new ChuyenDe();
        List<ChuyenDe> resultList = new ArrayList<>();
        resultList.add(exResult);
        PowerMockito.doReturn(resultList).when(chuyenDeDAOSpy, "finByName", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        ChuyenDe result = chuyenDeDAOSpy.findByName(tencd);
        assertThat(result, CoreMatchers.is(exResult));
    }
    
//    @Test
//    public void testFinByNameWithNotFound() throws Exception{
//        System.out.println("findById");
//        String tecd = "";
//        ChuyenDe exResult = null;
//        List<ChuyenDe> resultList = new ArrayList<>();
//        PowerMockito.doReturn(resultList).when(chuyenDeDAOSpy, "Select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
//        
//        ChuyenDe result = chuyenDeDAOSpy.findById(tecd);
//        assertThat(result, CoreMatchers.is(exResult));
//    }
    

    /**
     * Test of select method, of class ChuyenDeDAO.
     */
    @Test(expected = NullPointerException.class)
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
//    @Test
//    public void testCheckID() {
//        System.out.println("checkID");
//        String maCD = "";
//        ChuyenDeDAO instance = new ChuyenDeDAO();
//        boolean expResult = false;
//        boolean result = instance.checkID(maCD);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
