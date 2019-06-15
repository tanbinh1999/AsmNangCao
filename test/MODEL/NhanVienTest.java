package MODEL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NhanVienTest {

    public NhanVienTest() {
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
     * Test of toString method, of class NhanVien.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaNV method, of class NhanVien.
     */
    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaNV method, of class NhanVien.
     */
    @Test
    public void testSetMaNV() {
        System.out.println("setMaNV");
        String maNV = "";
        NhanVien instance = new NhanVien();
        instance.setMaNV(maNV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatkhau method, of class NhanVien.
     */
    @Test
    public void testGetMatkhau() {
        System.out.println("getMatkhau");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getMatkhau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatkhau method, of class NhanVien.
     */
    @Test
    public void testSetMatkhau() {
        System.out.println("setMatkhau");
        String matkhau = "";
        NhanVien instance = new NhanVien();
        instance.setMatkhau(matkhau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoTen method, of class NhanVien.
     */
    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getHoTen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoTen method, of class NhanVien.
     */
    @Test
    public void testSetHoTen() {
        System.out.println("setHoTen");
        String hoTen = "";
        NhanVien instance = new NhanVien();
        instance.setHoTen(hoTen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVaiTro method, of class NhanVien.
     */
    @Test
    public void testIsVaiTro() {
        System.out.println("isVaiTro");
        NhanVien instance = new NhanVien();
        boolean expResult = false;
        boolean result = instance.isVaiTro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVaiTro method, of class NhanVien.
     */
    @Test
    public void testSetVaiTro() {
        System.out.println("setVaiTro");
        boolean vaiTro = false;
        NhanVien instance = new NhanVien();
        instance.setVaiTro(vaiTro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
