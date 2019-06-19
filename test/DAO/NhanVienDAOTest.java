package DAO;

import HELPER.JDBCHelper;
import MODEL.NhanVien;
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

@RunWith(PowerMockRunner.class)
@PrepareForTest({NhanVienDAO.class, JDBCHelper.class})
public class NhanVienDAOTest {

    NhanVienDAO nhanVienDao;
    NhanVienDAO nhanVienDaoSpy;

    public NhanVienDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        nhanVienDao = new NhanVienDAO();
        PowerMockito.mockStatic(JDBCHelper.class);
        nhanVienDaoSpy = PowerMockito.spy(new NhanVienDAO());
    }

    @After
    public void tearDown() {
    }

    /**
     * insert
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        NhanVien model = new NhanVien();
        nhanVienDao.insert(model);
    }

    @Test(expected = NullPointerException.class)
    public void testInsertWithNullModel() {
        System.out.println("insert with null model");
        NhanVien model = null;
        nhanVienDao.insert(model);
    }

    /**
     * update
     */
    @Test(expected = NullPointerException.class)
    public void testUpdateWithNullModel() {
        System.out.println("update with null model");
        NhanVien model = null;
        nhanVienDao.update(model);
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        NhanVien model = new NhanVien();
        nhanVienDao.update(model);
    }

    /**
     * delete
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String MaNV = "";
        NhanVienDAO instance = new NhanVienDAO();
        instance.delete(MaNV);
    }

    /**
     * find
     */
    @Test
    public void testFindByldWithNotFound() throws Exception {
        System.out.println("findByld");
        String manv = "";

        NhanVien expResult = null;
        List<NhanVien> resultList = new ArrayList<>();

        PowerMockito.doReturn(resultList).when(nhanVienDaoSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        NhanVien result = nhanVienDaoSpy.findByld(manv);
        assertEquals(result, CoreMatchers.is(expResult));
    }

    @Test
    public void testFindBid() throws Exception {
        System.out.println("findByid");
        String manv = "12";

        NhanVien expResult = new NhanVien();
        List<NhanVien> resultList = new ArrayList<>();
        resultList.add(expResult);

        PowerMockito.doReturn(resultList).when(nhanVienDaoSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        NhanVien result = nhanVienDaoSpy.findByld(manv);
        assertThat(result, CoreMatchers.is(expResult));
    }

    /**
     * Select
     */
    @Test
    public void testSelect_0args() throws Exception {
        System.out.println("select");
        NhanVien nhanVien = new NhanVien();
        List<NhanVien> expectedResult = new ArrayList<>();

        expectedResult.add(nhanVien);

        PowerMockito.doReturn(expectedResult).when(nhanVienDaoSpy, "select", ArgumentMatchers.anyString());
        List<NhanVien> result = nhanVienDaoSpy.select();

        assertThat(result, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testSelect_String_ObjectArr() {
        System.out.println("select");
        String sql = "";
        Object[] args = null;
        NhanVienDAO instance = new NhanVienDAO();
        List<NhanVien> expResult = null;
        List<NhanVien> result = instance.select(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkID method, of class NhanVienDAO.
     */
    @Test
    public void testCheckID() {
        System.out.println("checkID");
        String id = "";
        NhanVienDAO instance = new NhanVienDAO();
        boolean expResult = false;
        boolean result = instance.checkID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
