/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JDBCHelper;
import com.mockrunner.mock.jdbc.MockConnection;
import com.mockrunner.mock.jdbc.MockResultSet;
import com.mockrunner.mock.jdbc.MockStatement;
import java.sql.SQLException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author tanbinh
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({JDBCHelper.class, ThongKeDAO.class})
public class ThongKeDAOTest {
    
    ThongKeDAO thongKeDAOSpy;
    @Mock
    MockConnection connection;
    @Mock
    MockStatement statement;
    @Spy
    @InjectMocks
    MockResultSet rs = new MockResultSet("spyMock");
    
    public ThongKeDAOTest() {
    }
    
   
    
    @Before
    public void setUp() {
        PowerMockito.mockStatic(JDBCHelper.class);
        thongKeDAOSpy = PowerMockito.spy(new ThongKeDAO());
    }
    
    @After
    public void tearDown() {
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
        assertEquals(expResult, result);
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
        assertEquals(expResult, result);
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
        assertEquals(expResult, result);
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
        assertEquals(expResult, result);
    }
    private MockResultSet initMockResultSet() throws SQLException{
        rs.addColumn("Nam", new Integer[]{1});
        rs.addColumn("SoLuong", new Integer[]{1});
        rs.addColumn("DauTien", new java.sql.Date[]{ new java.sql.Date(new java.util.Date().getTime())});
        rs.beforeFirst();
        
        return rs;
    }
    
}
