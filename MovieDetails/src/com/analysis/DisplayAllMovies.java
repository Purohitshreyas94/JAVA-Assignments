package com.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayAllMovies {
	public static void main(String[] args) {

		try {
			
			FileReader fr = new FileReader("D:\\Eclipse JAVA Project\\MovieDetails\\WebContent\\moviedetail.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			int count = 0;
			
			while(line != null)
			{
				count++;
				line = br.readLine();
			}
			System.out.println("Total number of Movies Available are : "+count);
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

}
}
