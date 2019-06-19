/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JDBCHelper;
import MODEL.KhoaHoc;
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
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.testng.IObjectFactory;
import org.testng.annotations.ObjectFactory;

@RunWith(PowerMockRunner.class)
@PrepareForTest({KhoaHocDAO.class, JDBCHelper.class})
public class KhoaHocDAOTest {

    KhoaHocDAO Khoahocdao;
    KhoaHocDAO KhoahocdaoSpy;

    public KhoaHocDAOTest() {
    }

//    @ObjectFactory
//    public IObjectFactory getObjectFfactory() {
//        return new org.powermock.modules.testng.PowerMockObjectFactory();
//    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Khoahocdao = new KhoaHocDAO();
        PowerMockito.mockStatic(JDBCHelper.class);
        KhoahocdaoSpy = PowerMockito.spy(new KhoaHocDAO());
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class KhoaHocDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        KhoaHoc model = new KhoaHoc();
        Khoahocdao.insert(model);
    }

    @Test(expected = NullPointerException.class)
    public void testInsertWithNullModel() {
        System.out.println("insert with null model");
        KhoaHoc model = null;
        Khoahocdao.insert(model);
    }

    /**
     * Test of update method, of class KhoaHocDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        KhoaHoc model = new KhoaHoc();
        Khoahocdao.update(model);
    }

    @Test(expected = NullPointerException.class)
    public void testUpdateWithNullModel() {
        System.out.println("update with null model");
        KhoaHoc model = null;
        Khoahocdao.update(model);
    }

    /**
     * Test of delete method, of class KhoaHocDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaKH = 1;
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.delete(MaKH);

    }

    @Test(expected = NullPointerException.class)
    public void testDeleteNull() {
        System.out.println("delete null");
        Integer MaKH = null;
        KhoaHocDAO instance = null; // new KhoaHocDAO
        instance.delete(MaKH);

    }

    /**
     * Test of select method, of class KhoaHocDAO.
     */
    @Test
    public void testSelect() throws Exception {
        System.out.println("select");
        KhoaHoc expResult = new KhoaHoc();
        List<KhoaHoc> resuiltList = new ArrayList<>();
        resuiltList.add(expResult);
        PowerMockito.doReturn(resuiltList)
                .when(KhoahocdaoSpy, "select",
                        ArgumentMatchers.anyString(), ArgumentMatchers.any());
        List<KhoaHoc> result = KhoahocdaoSpy.select();
        assertThat(result, CoreMatchers.is(resuiltList));

    }

    @Test(expected = NullPointerException.class)
    public void testSelectNull() {
        System.out.println("select null");
        KhoaHocDAO instance = new KhoaHocDAO();
        List<KhoaHoc> expResult = null;
        List<KhoaHoc> result = instance.select();
        assertEquals(expResult, result);

    }

    /**
     * Test of findById method, of class KhoaHocDAO.
     */
    @Test(expected = NullPointerException.class)
    public void testFindByIdNull() throws Exception {
        System.out.println("findById null");
        Integer makh = 0;
        KhoaHocDAO instance = new KhoaHocDAO();
        KhoaHoc expResult = null;
        KhoaHoc result = instance.findById(makh);
        assertEquals(expResult, result);

    }

    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        Integer ma = 1;
//        KhoaHocDAO instance = new KhoaHocDAO();
        KhoaHoc expResult = new KhoaHoc();
        List<KhoaHoc> resuiltList = new ArrayList<>();
        resuiltList.add(expResult);
        PowerMockito.doReturn(resuiltList)
                .when(KhoahocdaoSpy, "select",
                        ArgumentMatchers.anyString(), ArgumentMatchers.any());
        KhoaHoc result = KhoahocdaoSpy.findById(ma);
        assertThat(result, CoreMatchers.is(expResult));
    }

}
