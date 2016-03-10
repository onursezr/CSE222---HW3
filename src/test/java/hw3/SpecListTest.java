/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Onur Sezer
 */
public class SpecListTest {
    
    public SpecListTest() {
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

    // INTEGER TEST
    
    /**
     * Integer icin addAllAtHead Testi
     * Test of addAllAtHead method, of class SpecList.
     */
    @Test
    public void testAddAllAtHeadInt() {
        System.out.println("addAllAtHead");
        Collection c = new LinkedList<>();
        c.add(8);
        c.add(10);
        SpecList instance = new SpecList();
        instance.add(1);
        instance.add(6);
        instance.add(10);
        boolean expResult = true;
        boolean result = instance.addAllAtHead(c);
        assertEquals(expResult, result);
    }

    /**
     * Integer icin getIntersectList Testi
     * Test of getIntersectList method, of class SpecList.
     */
    @Test
    public void testGetIntersectListInt() {
        System.out.println("getIntersectList");
        Collection c = new LinkedList<>();
        c.add(8);
        c.add(10);
        
        SpecList instance = new SpecList();
        instance.add(1);
        instance.add(6);
        instance.add(10);
        
        boolean expResult = true;
        boolean result;
        List a = instance.getIntersectList(c);
        if(a.get(0).equals(10))    // iki listenin intersecti 10 olması gerekiyor
            result = true;
        else
            result = false;
        assertEquals(expResult, result);
    }

    /**
     * Integer icin SpecList Testi
     * Descreasing
     * Test of sortList method, of class SpecList.
     */
    @Test
    public void testSortListDescreasingInt() {
        System.out.println("sortList");

        SpecList instance = new SpecList();
        instance.add(1);
        instance.add(6);
        instance.add(10);
        
        int count = 0; // dogru olan sonuclari saymak icin 
        boolean expResult = true;
        boolean result;
        List a = instance.sortList("decreasing");
        for (int i = 0; i < a.size(); i++) {
            if(i == 0){
                if(a.get(0).equals(10))
                    count++;
            }
            else if(i == 1){
                if(a.get(1).equals(6))
                    count++;
            }
            else if(i == 2){
                if(a.get(2).equals(1))
                    count++;     
            }
        }
        if(count == 3) // instance ın size ı 
            result = true;
        else
            result = false;
        
        assertEquals(expResult, result);
    }
    /**
     * Integer icin SpecList Testi
     * Increasing 
     * Test of sortList method, of class SpecList.
     */
    @Test
    public void testSortListIncreasingInt() {
        System.out.println("sortList");

        SpecList instance = new SpecList();
        instance.add(1);
        instance.add(6);
        instance.add(10);
        
        int count = 0; // dogru olan sonuclari saymak icin 
        boolean expResult = true;
        boolean result;
        List a = instance.sortList("increasing");
        for (int i = 0; i < a.size(); i++) {
            if(i == 0){
                if(a.get(0).equals(1))
                    count++;
            }
            else if(i == 1){
                if(a.get(1).equals(6))
                    count++;
            }
            else if(i == 2){
                if(a.get(2).equals(10))
                    count++;     
            }
        }
        if(count == 3) // instance ın size ı 
            result = true;
        else
            result = false;
        
        assertEquals(expResult, result);
    }
    
    // DOUBLE TEST
    
    /**
     * Double icin addAllAtHead Testi
     * Test of addAllAtHead method, of class SpecList.
     */
    @Test
    public void testAddAllAtHeadDouble() {
        System.out.println("addAllAtHead");
        Collection c = new LinkedList<>();
        c.add(8.2);
        c.add(10.1);
        SpecList instance = new SpecList();
        instance.add(1.5);
        instance.add(6.3);
        instance.add(10.2);
        boolean expResult = true;
        boolean result = instance.addAllAtHead(c);
        assertEquals(expResult, result);
    }

    /**
     * Double icin getIntersectList Testi
     * Test of getIntersectList method, of class SpecList.
     */
    @Test
    public void testGetIntersectListDouble() {
        System.out.println("getIntersectList");
        Collection c = new LinkedList<>();
        c.add(8.2);
        c.add(10.5);
        
        SpecList instance = new SpecList();
        instance.add(1.0);
        instance.add(6.9);
        instance.add(10.5);
        
        boolean expResult = true;
        boolean result;
        List a = instance.getIntersectList(c);
        if(a.get(0).equals(10.5))    // iki listenin intersecti 10 olması gerekiyor
            result = true;
        else
            result = false;
        assertEquals(expResult, result);
    }

    /**
     * Double icin SpecList Testi
     * Descreasing
     * Test of sortList method, of class SpecList.
     */
    @Test
    public void testSortListDescreasingDouble() {
        System.out.println("sortList");

        SpecList instance = new SpecList();
        instance.add(1.0);
        instance.add(6.9);
        instance.add(10.5);
        
        int count = 0; // dogru olan sonuclari saymak icin 
        boolean expResult = true;
        boolean result;
        List a = instance.sortList("decreasing");
        for (int i = 0; i < a.size(); i++) {
            if(i == 0){
                if(a.get(0).equals(10.5))
                    count++;
            }
            else if(i == 1){
                if(a.get(1).equals(6.9))
                    count++;
            }
            else if(i == 2){
                if(a.get(2).equals(1.0))
                    count++;     
            }
        }
        if(count == 3) // instance ın size ı 
            result = true;
        else
            result = false;
        
        assertEquals(expResult, result);
    }
    /**
     * Double icin SpecList Testi
     * Increasing 
     * Test of sortList method, of class SpecList.
     */
    @Test
    public void testSortListIncreasingDouble() {
        System.out.println("sortList");

        SpecList instance = new SpecList();
        instance.add(1.0);
        instance.add(6.9);
        instance.add(10.5);
        
        int count = 0; // dogru olan sonuclari saymak icin 
        boolean expResult = true;
        boolean result;
        List a = instance.sortList("increasing");
        for (int i = 0; i < a.size(); i++) {
            if(i == 0){
                if(a.get(0).equals(1.0))
                    count++;
            }
            else if(i == 1){
                if(a.get(1).equals(6.9))
                    count++;
            }
            else if(i == 2){
                if(a.get(2).equals(10.5))
                    count++;     
            }
        }
        if(count == 3) // instance ın size ı 
            result = true;
        else
            result = false;
        
        assertEquals(expResult, result);
    }
    
    // CHAR TEST
    
    /**
     * Char icin addAllAtHead Testi
     * Test of addAllAtHead method, of class SpecList.
     */
    @Test
    public void testAddAllAtHeadChar() {
        System.out.println("addAllAtHead");
        Collection c = new LinkedList<>();
        c.add('z');
        c.add('o');
        SpecList instance = new SpecList();
        instance.add('k');
        instance.add('b');
        instance.add('o');
        boolean expResult = true;
        boolean result = instance.addAllAtHead(c);
        assertEquals(expResult, result);
    }

    /**
     * Char icin getIntersectList Testi
     * Test of getIntersectList method, of class SpecList.
     */
    @Test
    public void testGetIntersectListChar() {
        System.out.println("getIntersectList");
        Collection c = new LinkedList<>();
        c.add('z');
        c.add('o');
        SpecList instance = new SpecList();
        instance.add('k');
        instance.add('b');
        instance.add('o');
        
        boolean expResult = true;
        boolean result;
        List a = instance.getIntersectList(c);
        if(a.get(0).equals('o'))    // iki listenin intersecti 10 olması gerekiyor
            result = true;
        else
            result = false;
        assertEquals(expResult, result);
    }

    /**
     * Char icin SpecList Testi
     * Descreasing
     * Test of sortList method, of class SpecList.
     */
    @Test
    public void testSortListDescreasingChar() {
        System.out.println("sortList");

        SpecList instance = new SpecList();
        instance.add('c');
        instance.add('a');
        instance.add('d');
        
        int count = 0; // dogru olan sonuclari saymak icin 
        boolean expResult = true;
        boolean result;
        List a = instance.sortList("decreasing");
        for (int i = 0; i < a.size(); i++) {
            if(i == 0){
                if(a.get(0).equals('d'))
                    count++;
            }
            else if(i == 1){
                if(a.get(1).equals('c'))
                    count++;
            }
            else if(i == 2){
                if(a.get(2).equals('a'))
                    count++;     
            }
        }
        if(count == 3) // instance ın size ı 
            result = true;
        else
            result = false;
        
        assertEquals(expResult, result);
    }
    /**
     * Char icin SpecList Testi
     * Increasing 
     * Test of sortList method, of class SpecList.
     */
    @Test
    public void testSortListIncreasingChar() {
        System.out.println("sortList");

        SpecList instance = new SpecList();
        instance.add('c');
        instance.add('a');
        instance.add('d');
        
        int count = 0; // dogru olan sonuclari saymak icin 
        boolean expResult = true;
        boolean result;
        List a = instance.sortList("increasing");
        for (int i = 0; i < a.size(); i++) {
            if(i == 0){
                if(a.get(0).equals('a'))
                    count++;
            }
            else if(i == 1){
                if(a.get(1).equals('c'))
                    count++;
            }
            else if(i == 2){
                if(a.get(2).equals('d'))
                    count++;     
            }
        }
        if(count == 3) // instance ın size ı 
            result = true;
        else
            result = false;
        
        assertEquals(expResult, result);
    }
    
    // STRING ICIN TEST
    
    /**
     * String icin addAllAtHead Testi
     * Test of addAllAtHead method, of class SpecList.
     */
    @Test
    public void testAddAllAtHeadString() {
        System.out.println("addAllAtHead");
        Collection c = new LinkedList<>();
        c.add("zehra");
        c.add("onur");
        SpecList instance = new SpecList();
        instance.add("kitap");
        instance.add("balik");
        instance.add("onur");
        boolean expResult = true;
        boolean result = instance.addAllAtHead(c);
        assertEquals(expResult, result);
    }

    /**
     * String icin getIntersectList Testi
     * Test of getIntersectList method, of class SpecList.
     */
    @Test
    public void testGetIntersectListString() {
        System.out.println("getIntersectList");
        Collection c = new LinkedList<>();
        c.add("zehra");
        c.add("onur");
        SpecList instance = new SpecList();
        instance.add("kitap");
        instance.add("balik");
        instance.add("onur");
        
        boolean expResult = true;
        boolean result;
        List a = instance.getIntersectList(c);
        if(a.get(0).equals("onur"))    // iki listenin intersecti 10 olması gerekiyor
            result = true;
        else
            result = false;
        assertEquals(expResult, result);
    }

    /**
     * String icin SpecList Testi
     * Descreasing
     * Test of sortList method, of class SpecList.
     */
    @Test
    public void testSortListDescreasingString() {
        System.out.println("sortList");

        SpecList instance = new SpecList();
        instance.add("kitap");
        instance.add("balik");
        instance.add("onur");
        
        int count = 0; // dogru olan sonuclari saymak icin 
        boolean expResult = true;
        boolean result;
        List a = instance.sortList("decreasing");
        for (int i = 0; i < a.size(); i++) {
            if(i == 0){
                if(a.get(0).equals("onur"))
                    count++;
            }
            else if(i == 1){
                if(a.get(1).equals("kitap"))
                    count++;
            }
            else if(i == 2){
                if(a.get(2).equals("balik"))
                    count++;     
            }
        }
        if(count == 3) // instance ın size ı 
            result = true;
        else
            result = false;
        
        assertEquals(expResult, result);
    }
    /**
     * String icin SpecList Testi
     * Increasing 
     * Test of sortList method, of class SpecList.
     */
    @Test
    public void testSortListIncreasingString() {
        System.out.println("sortList");

        SpecList instance = new SpecList();
        instance.add("balik");
        instance.add("onur");
        instance.add("kitap");
        
        int count = 0; // dogru olan sonuclari saymak icin 
        boolean expResult = true;
        boolean result;
        List a = instance.sortList("increasing");
        for (int i = 0; i < a.size(); i++) {
            if(i == 0){
                if(a.get(0).equals("balik"))
                    count++;
            }
            else if(i == 1){
                if(a.get(1).equals("kitap"))
                    count++;
            }
            else if(i == 2){
                if(a.get(2).equals("onur"))
                    count++;     
            }
        }
        if(count == 3) // instance ın size ı 
            result = true;
        else
            result = false;
        
        assertEquals(expResult, result);
    }
    
}
