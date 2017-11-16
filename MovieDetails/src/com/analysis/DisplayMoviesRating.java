package com.analysis;

import java.io.*;

public class DisplayMoviesRating {
	public static void main(String[] args) {

		try {
				
			FileReader fr = new FileReader("D:\\Eclipse JAVA Project\\MovieDetails\\WebContent\\moviedetail.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			int count = 0;
			
			while(line != null)
			{
				String a = line;
				String[] str = a.split(", ");
				int rating = Integer.parseInt(str[3]);
				
				if(rating == 4)
				{
					count++;
				}
				line = br.readLine();
			}
			
			System.out.println("The total movies with rating 4 are : "+count);
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
}
}
