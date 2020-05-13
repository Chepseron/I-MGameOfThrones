/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.primefaces.model.chart.MeterGaugeChartModel;

/**
 *
 * @author Amon.Sabul
 */
public class GOTTest {
    
    public GOTTest() {
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
     * Test of init method, of class GOT.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        GOT instance = new GOT();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharacter method, of class GOT.
     */
    @Test
    public void testGetCharacter() {
        System.out.println("getCharacter");
        GOT instance = new GOT();
        characterService expResult = null;
        characterService result = instance.getCharacter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAssignedMeter method, of class GOT.
     */
    @Test
    public void testGetAssignedMeter() {
        System.out.println("getAssignedMeter");
        GOT instance = new GOT();
        MeterGaugeChartModel expResult = null;
        MeterGaugeChartModel result = instance.getAssignedMeter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCharacter method, of class GOT.
     */
    @Test
    public void testSetCharacter() {
        System.out.println("setCharacter");
        characterService character = null;
        GOT instance = new GOT();
        instance.setCharacter(character);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHouses method, of class GOT.
     */
    @Test
    public void testGetHouses() {
        System.out.println("getHouses");
        GOT instance = new GOT();
        housesService expResult = null;
        housesService result = instance.getHouses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHouses method, of class GOT.
     */
    @Test
    public void testSetHouses() {
        System.out.println("setHouses");
        housesService houses = null;
        GOT instance = new GOT();
        instance.setHouses(houses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooks method, of class GOT.
     */
    @Test
    public void testGetBooks() {
        System.out.println("getBooks");
        GOT instance = new GOT();
        booksService expResult = null;
        booksService result = instance.getBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBooks method, of class GOT.
     */
    @Test
    public void testSetBooks() {
        System.out.println("setBooks");
        booksService books = null;
        GOT instance = new GOT();
        instance.setBooks(books);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharacterList method, of class GOT.
     */
    @Test
    public void testGetCharacterList() {
        System.out.println("getCharacterList");
        GOT instance = new GOT();
        List<character> expResult = null;
        List<character> result = instance.getCharacterList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCharacterList method, of class GOT.
     */
    @Test
    public void testSetCharacterList() {
        System.out.println("setCharacterList");
        List<character> characterList = null;
        GOT instance = new GOT();
        instance.setCharacterList(characterList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksList method, of class GOT.
     */
    @Test
    public void testGetBooksList() {
        System.out.println("getBooksList");
        GOT instance = new GOT();
        List<books> expResult = null;
        List<books> result = instance.getBooksList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBooksList method, of class GOT.
     */
    @Test
    public void testSetBooksList() {
        System.out.println("setBooksList");
        List<books> booksList = null;
        GOT instance = new GOT();
        instance.setBooksList(booksList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHousesList method, of class GOT.
     */
    @Test
    public void testGetHousesList() {
        System.out.println("getHousesList");
        GOT instance = new GOT();
        List<houses> expResult = null;
        List<houses> result = instance.getHousesList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHousesList method, of class GOT.
     */
    @Test
    public void testSetHousesList() {
        System.out.println("setHousesList");
        List<houses> housesList = null;
        GOT instance = new GOT();
        instance.setHousesList(housesList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBook method, of class GOT.
     */
    @Test
    public void testGetBook() {
        System.out.println("getBook");
        GOT instance = new GOT();
        books expResult = null;
        books result = instance.getBook();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBook method, of class GOT.
     */
    @Test
    public void testSetBook() {
        System.out.println("setBook");
        books book = null;
        GOT instance = new GOT();
        instance.setBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharacters method, of class GOT.
     */
    @Test
    public void testGetCharacters() {
        System.out.println("getCharacters");
        GOT instance = new GOT();
        character expResult = null;
        character result = instance.getCharacters();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCharacters method, of class GOT.
     */
    @Test
    public void testSetCharacters() {
        System.out.println("setCharacters");
        character characters = null;
        GOT instance = new GOT();
        instance.setCharacters(characters);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHouse method, of class GOT.
     */
    @Test
    public void testGetHouse() {
        System.out.println("getHouse");
        GOT instance = new GOT();
        houses expResult = null;
        houses result = instance.getHouse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHouse method, of class GOT.
     */
    @Test
    public void testSetHouse() {
        System.out.println("setHouse");
        houses house = null;
        GOT instance = new GOT();
        instance.setHouse(house);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAssignedMeter method, of class GOT.
     */
    @Test
    public void testSetAssignedMeter() {
        System.out.println("setAssignedMeter");
        MeterGaugeChartModel GOTcharactersMeter = null;
        GOT instance = new GOT();
        instance.setAssignedMeter(GOTcharactersMeter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
