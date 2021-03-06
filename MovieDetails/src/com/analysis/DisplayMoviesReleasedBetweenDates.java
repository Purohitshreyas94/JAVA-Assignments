package com.analysis;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayMoviesReleasedBetweenDates {
	public static void main(String[] args) {

		try {
			
			FileReader fr = new FileReader("D:\\Eclipse JAVA Project\\MovieDetails\\WebContent\\moviedetail.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			
			String sDate = "15-10-13";
			String eDate = "15-10-17";
			
			Date startDate = format.parse(sDate);
			Date endDate = format.parse(eDate);
			
			int count = 0;
			while(line != null)
			{
				String a = line;
				String[] str = a.split(",");
				
				String date1 = str[2];
				
				Date dt = format.parse(date1);
				
				if(dt.before(endDate) && dt.after(startDate))
				{
					count++;
				}
				line = br.readLine();
			}
			
			System.out.println("Total movies released between two specific dates are : "+count);
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
}

	}


}
