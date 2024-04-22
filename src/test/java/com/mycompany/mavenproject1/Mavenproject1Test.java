/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ACER
 */
public class Mavenproject1Test {
	private Mavenproject1 createTestSubject() {
		return new Mavenproject1();
	}    
	@Test
	public void testSum() throws Exception {
		Mavenproject1 testSubject;
		int a = 0;
		int result;
		int e = 0;
		testSubject = createTestSubject();
		result = testSubject.sum(a);
		assertEquals(e, result);
	}        
        	@Test
	public void testSum1() throws Exception {
		Mavenproject1 testSubject;
		int a = 6;
		int result;
		int e = 12;
		testSubject = createTestSubject();
		result = testSubject.sum(a);
		assertEquals(e, result);
	}  
    
}



