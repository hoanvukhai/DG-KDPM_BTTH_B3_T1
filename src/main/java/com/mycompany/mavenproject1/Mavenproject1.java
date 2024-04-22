/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author ACER
 */
public class Mavenproject1 {
	public int sum(int number) {
		int sum = 0;
		for(int i = 0; i <= number; i++) {
			if(i % 2 == 0) {
				sum+=i;
			}
			
		}
		return sum;
	}
}




