package com.analysis;

import java.io.*;

public class DisplayMoviesDuration {
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
				double time = Double.parseDouble(str[4]);
				
				double duration = (time / (60*60)) ;
				
				if(duration == 2.5)
				{
					count++;
				}
				line = br.readLine();
			}
			System.out.println("Total number of movies having duration 2.5 hrs are :  "+count);
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
