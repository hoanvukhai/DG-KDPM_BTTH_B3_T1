/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author ACER
 */
public class Test1 {
    	private Mavenproject1 createTestSubject() {
		return new Mavenproject1();
	}    
	@Test
	public void testSum() throws Exception {
        Mavenproject1 mavenProject = new Mavenproject1();
        assertEquals(0, mavenProject.sum(0));
        assertEquals(0, mavenProject.sum(-1));
        assertEquals(0, mavenProject.sum(1));
        assertEquals(2, mavenProject.sum(2));
        assertEquals(2, mavenProject.sum(3));
        assertEquals(6, mavenProject.sum(4));
        assertEquals(12, mavenProject.sum(6));
        assertEquals(12, mavenProject.sum(7));
	}        

 
}
