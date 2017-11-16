package com.analysis;
import java.io.*;

public class CustomerTotalTransactions {
	public static void main(String[] args) {
		
		try {
			
			FileReader  fr = new FileReader("D:\\Eclipse JAVA Project\\CustomerTransactionDetails\\WebContent\\transaction.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			
			int C1 = 0;
			int C2 = 0;
			int C3 = 0;
			int C4 = 0;
			int C5 = 0;
			int C6 = 0;
			int C7 = 0;
			
			while(line != null)
			{
				if(line.contains("C1"))
				{
					C1++;
				}
				if(line.contains("C2"))
				{
					C2++;
				}
				if(line.contains("C3"))
				{
					C3++;
				}
				if(line.contains("C4"))
				{
					C4++;
				}
				if(line.contains("C5"))
				{
					C5++;
				}
				if(line.contains("C6"))
				{
					C6++;
				}if(line.contains("C7"))
				{
					C7++;
				}
				line = br.readLine();
			}
			System.out.println("Total Transcations of Shreyas Purohit : "+C1);
			System.out.println("Total Transcations of  Shwetali Pawar : "+C2);
			System.out.println("Total Transcations of Pooja Purohit : "+C3);
			System.out.println("Total Transcations of Chinmay Agarkar : "+C4);
			System.out.println("Total Transcations of Ashwini Khadilkar : "+C5);
			System.out.println("Total Transcations of Magesh Hazare : "+C6);
			System.out.println("Total Transcations of Niyaz Ahamad : "+C7);
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
