package DAO;

import HELPER.JDBCHelper;
import MODEL.NhanVien;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
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

    @Test
    public void testUpdate() {
        System.out.println("update");
        NhanVien model = new NhanVien();
        nhanVienDao.update(model);
    }

    @Test(expected = NullPointerException.class)
    public void testUpdateWithNullModel() {
        System.out.println("update with null model");
        NhanVien model = null;
        nhanVienDao.update(model);
    }

    /**
     * Test of delete method, of class NhanVienDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String MaNV = "";
        NhanVienDAO instance = new NhanVienDAO();
        instance.delete(MaNV);
    }

    @Test
    public void testSelect_0args() {
        System.out.println("select");
        NhanVienDAO instance = new NhanVienDAO();
        List<NhanVien> expResult = null;
        List<NhanVien> result = instance.select();
        assertEquals(expResult, result);
    }

    /**
     * Test of findByld method, of class NhanVienDAO.
     */
    @Test
    public void testFindByld() {
        System.out.println("findByld");
        String manv = "";
        NhanVienDAO instance = new NhanVienDAO();
        NhanVien expResult = null;
        NhanVien result = instance.findByld(manv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class NhanVienDAO.
     */
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
