/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array1demo;

/**
 *
 * @author bikrant bikram
 */
import java.util.Scanner;
public class Array1demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	String str[] = new String[10];
	Scanner s = new Scanner(System.in);

	System.out.println("enter names :");

        for(int i = 0; i < str.length; i++) 
            str[i] = s.next();
	

		for(String x : str) {
                    if(x.contains("he"))
			System.out.println(x);
	
		}

    }
}
