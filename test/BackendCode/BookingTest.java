/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BackendCode;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.assertj.swing;

/**
 *
 * @author muzammilgodil
 */
public class BookingTest {
    
    public BookingTest() {
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
     * Test of getID method, of class Booking.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Booking instance = new Booking();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Booking.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Booking instance = new Booking();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class Booking.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Booking instance = new Booking();
        Customer expResult = null;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomer method, of class Booking.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = null;
        Booking instance = new Booking();
        instance.setCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCar method, of class Booking.
     */
    @Test
    public void testGetCar() {
        System.out.println("getCar");
        Booking instance = new Booking();
        Car expResult = null;
        Car result = instance.getCar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCar method, of class Booking.
     */
    @Test
    public void testSetCar() {
        System.out.println("setCar");
        Car car = null;
        Booking instance = new Booking();
        instance.setCar(car);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRentTime method, of class Booking.
     */
    @Test
    public void testGetRentTime() {
        System.out.println("getRentTime");
        Booking instance = new Booking();
        long expResult = 0L;
        long result = instance.getRentTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRentTime method, of class Booking.
     */
    @Test
    public void testSetRentTime() {
        System.out.println("setRentTime");
        long RentTime = 0L;
        Booking instance = new Booking();
        instance.setRentTime(RentTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReturnTime method, of class Booking.
     */
    @Test
    public void testGetReturnTime() {
        System.out.println("getReturnTime");
        Booking instance = new Booking();
        long expResult = 0L;
        long result = instance.getReturnTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReturnTime method, of class Booking.
     */
    @Test
    public void testSetReturnTime() {
        System.out.println("setReturnTime");
        long ReturnTime = 0L;
        Booking instance = new Booking();
        instance.setReturnTime(ReturnTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Booking.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Booking instance = new Booking();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Add method, of class Booking.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        Booking instance = new Booking();
        instance.Add();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Update method, of class Booking.
     */
    @Test
    public void testUpdate() {
        System.out.println("Update");
        Booking instance = new Booking();
        instance.Update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Remove method, of class Booking.
     */
    @Test
    public void testRemove() {
        System.out.println("Remove");
        Booking instance = new Booking();
        instance.Remove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateBill method, of class Booking.
     */
    @Test
    public void testCalculateBill() {
        System.out.println("calculateBill");
        Booking instance = new Booking();
        int expResult = 0;
        int result = instance.calculateBill();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchByCustomerID method, of class Booking.
     */
    @Test
    public void testSearchByCustomerID() {
        System.out.println("SearchByCustomerID");
        int CustomerID = 0;
        ArrayList<Booking> expResult = null;
        ArrayList<Booking> result = Booking.SearchByCustomerID(CustomerID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchByCarRegNo method, of class Booking.
     */
    @Test
    public void testSearchByCarRegNo() {
        System.out.println("SearchByCarRegNo");
        String CarRegNo = "";
        ArrayList<Booking> expResult = null;
        ArrayList<Booking> result = Booking.SearchByCarRegNo(CarRegNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchByCarID method, of class Booking.
     */
    @Test
    public void testSearchByCarID() {
        System.out.println("SearchByCarID");
        int carID = 0;
        ArrayList<Booking> expResult = null;
        ArrayList<Booking> result = Booking.SearchByCarID(carID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of View method, of class Booking.
     */
    @Test
    public void testView() {
        System.out.println("View");
        ArrayList<Booking> expResult = null;
        ArrayList<Booking> result = Booking.View();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookedCars method, of class Booking.
     */
    @Test
    public void testGetBookedCars() {
        System.out.println("getBookedCars");
        ArrayList<Car> expResult = null;
        ArrayList<Car> result = Booking.getBookedCars();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnbookedCars method, of class Booking.
     */
    @Test
    public void testGetUnbookedCars() {
        System.out.println("getUnbookedCars");
        ArrayList<Car> expResult = null;
        ArrayList<Car> result = Booking.getUnbookedCars();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
