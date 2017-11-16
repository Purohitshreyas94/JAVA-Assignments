package com.analysis;

import java.io.*;

public class DisplayCustomerTravelling {
public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("D:\\Eclipse JAVA Project\\CustomerDetails\\WebContent\\customer.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			int count=0;
			
			while(line != null)
			{
				if(line.contains("Travelling"))
				{
					count++;
				}
				line = br.readLine();
			}
			System.out.println("The total customer who like Travelling = "+count);
			br.close();
			
		} catch (Exception e) {
			System.out.println("File not found Exception");
		}
	}


}
