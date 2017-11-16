package com.analysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayNonWorkingCitizen {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\Eclipse JAVA Project\\CitizenDetails\\WebContent\\citizen.txt");
		
		BufferedReader br  = new BufferedReader(fr);
		
		String line = br.readLine();
		
		int count1 = 0;
		
		while( line != null)
		{
			String a =  line;
			String[] str = line.split(", ");
			
			String workingStatus = str[10];
			
			if(workingStatus.equals("No"))
			{
				count1++;
			}
			line = br.readLine();
		}
		System.out.println("The total Non Working Citizens are : "+count1);
	}

}
