package com.analysis;

import java.io.*;

public class CategoryWiseTransactions {
public static void main(String[] args) {
		
		try {
			
			FileReader  fr = new FileReader("D:\\Eclipse JAVA Project\\CustomerTransactionDetails\\WebContent\\transaction.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			int count4 = 0;
			
			while(line != null)
			{
				if(line.contains("Appeareals"))
				{
					count1++;
				}
				if(line.contains("Home Appliances"))
				{
					count2++;
				}
				if(line.contains("Sports"))
				{
					count3++;
				}
				if(line.contains("Kitchen Appliances"))
				{
					count4++;
				}
				
				line = br.readLine();
			}
			System.out.println("Product Category Appeareals wise total Transactions are  : "+count1);
			System.out.println("Product Category Home Appliances wise total Transactions are  : "+count2);
			System.out.println("Product Category Sports wise total Transactions are  : "+count3);
			System.out.println("Product Category Kitchen Appliances wise total Transactions are  : "+count4);
			br.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

}
}
