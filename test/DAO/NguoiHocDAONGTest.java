/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JDBCHelper;
import MODEL.NguoiHoc;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.MatcherAssert.assertThat;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import static org.testng.Assert.*;
import org.testng.IObjectFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 *
 * @author tanbinh
 */
@PrepareForTest({JDBCHelper.class, NguoiHocDAO.class})
public class NguoiHocDAONGTest {
    
    NguoiHocDAO nguoiHocDAO;
    NguoiHocDAO nguoiHocDAOSpy;
    @ObjectFactory
    public IObjectFactory getObjectFactory() {
        return new org.powermock.modules.testng.PowerMockObjectFactory();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        nguoiHocDAO = new NguoiHocDAO();
        PowerMockito.mockStatic(JDBCHelper.class);
        nguoiHocDAO = PowerMockito.spy(new NguoiHocDAO());
    }
    @AfterMethod
    public void tearDownMethod() throws Exception {
        
    }

    /**
     * Test of insert method, of class NguoiHocDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        NguoiHoc nguoiHoc = new NguoiHoc();
        nguoiHocDAO.insert(nguoiHoc);
    }
    
    @Test(expectedExceptions = NullPointerException.class)
    public void testInsertWithNullModel(){
        System.out.println("insert with null model");
        NguoiHoc nguoiHoc = null;
        nguoiHocDAO.insert(nguoiHoc);
    }
    /**
     * Test of update method, of class NguoiHocDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        NguoiHoc model = new NguoiHoc();
        nguoiHocDAO.update(model);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testUpdateWithNullModel(){
        System.out.println("");
        NguoiHoc nguoiHoc = null;
        nguoiHocDAO.update(nguoiHoc);
    }
    /**
     * Test of delete method, of class NguoiHocDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        nguoiHocDAO.delete(id);
    }

    /**
     * Test of select method, of class NguoiHocDAO.
     */
    @Test
    public void testSelect() throws Exception{
        System.out.println("select");
        NguoiHoc nguoiHoc = new NguoiHoc();
        List<NguoiHoc>  expResult = new ArrayList<>();
        expResult.add(nguoiHoc);
        PowerMockito.doReturn(expResult).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString());
        List<NguoiHoc> result = nguoiHocDAOSpy.select();
        assertThat(result, CoreMatchers.is(expResult));
    }

    /**
     * Test of selectByKeyword method, of class NguoiHocDAO.
     */
    @Test
    public void testSelectByKeyword() throws Exception{
        System.out.println("selectByKeyword");
        String keyword = "";
        NguoiHoc instance = new NguoiHoc();
        List<NguoiHoc> expResult = new ArrayList<>();
        expResult.add(instance);
        PowerMockito.doReturn(expResult).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        List<NguoiHoc> result = nguoiHocDAOSpy.selectByKeyword(keyword);
        assertThat(result, CoreMatchers.is(expResult));
    }

    /**
     * Test of selectByCourse method, of class NguoiHocDAO.
     */
    @Test
    public void testSelectByCourse() throws Exception{
        System.out.println("selectByCourse");
        Integer makh = null;
        NguoiHoc nguoiHoc = new NguoiHoc();
        List<NguoiHoc> expResult = new ArrayList<>();
        expResult.add(nguoiHoc);
        PowerMockito.doReturn(expResult).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        List<NguoiHoc> result = nguoiHocDAOSpy.selectByCourse(makh);
        assertThat(result, CoreMatchers.is(expResult));
    }

    /**
     * Test of findById method, of class NguoiHocDAO.
     */
    @Test
    public void testFindById() throws  Exception{
        System.out.println("findById");
        String manh = "45";
        NguoiHoc expResult = null;
        List<NguoiHoc> resultList = new ArrayList<>();
        PowerMockito.doReturn(expResult).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        NguoiHoc result = nguoiHocDAOSpy.findById(manh);
        assertThat(result, CoreMatchers.is(expResult));
    }

    /**
     * Test of checkID method, of class NguoiHocDAO.
     */
//    @Test
//    public void testCheckID() {
//        System.out.println("checkID");
//        String id = "";
//        NguoiHocDAO instance = new NguoiHocDAO();
//        boolean expResult = false;
//        boolean result = instance.checkID(id);
//        assertEquals(result, expResult);
//    }
//
//    /**
//     * Test of checkSDT method, of class NguoiHocDAO.
//     */
//    @Test
//    public void testCheckSDT() {
//        System.out.println("checkSDT");
//        String sodienthoai = "";
//        NguoiHocDAO instance = new NguoiHocDAO();
//        boolean expResult = false;
//        boolean result = instance.checkSDT(sodienthoai);
//        assertEquals(result, expResult);
//    }
    
}
