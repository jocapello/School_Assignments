import java.util.*;
import java.io.*;

public class KnapSack{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
	
		String line;
		while((line=br.readLine())!=null) {
			
			
			// read the input
			// split string by space 
			String[] split = line.split(" ");
			// intValue lets you do it bc without theres an error
			int capacity = Double.valueOf(split[0]).intValue();
			int n = Integer.valueOf(split[1]);
			int [] values = new int[n];
			int []weights = new int[n];
			for (int i=0; i<n;i++) {
				split = br.readLine().split(" ");
				values[i]=Integer.valueOf(split[0]);
				weights[i]=Integer.valueOf(split[1]);
			}
			// compute the asnwer thru list of integers
			List<Integer>indexes = KnapSack (values,weights,n,capacity);
			
			// output answer
			System.out.println(indexes.size());
			for (int i=0;i<indexes.size(); i++) {
				System.out.print(" ");
				System.out.print(indexes.get(i));
			}
			System.out.println();
		}
	}
	// return list of ints
	static List<Integer> KnapSack(int []values, int[] weights, int n, int capacity){
	int [][] bestValue = new int[n+1][capacity+1];
	for (int i=1; i<=n; i++) {
		int itemIndex=i-1;
		for (int j=0;j<=capacity;j++) {
			int totalWeight = j + weights[itemIndex];
			int totalValue = bestValue[i-1][j]+values[itemIndex];
			// including the item
			if (totalWeight<=capacity)
				bestValue[i][totalWeight] = Math.max(totalValue, bestValue[i][totalWeight]);
			// not including item
			bestValue[i][j] = Math.max(bestValue[i][j],bestValue[i-1][j]);
		}
	}
	List<Integer>itemsChosen=new ArrayList<Integer>();
	int column = capacity;
	for (int i=n;i>0;i--) {
		if (bestValue[i][column] != bestValue[i-1][column]) {
			int itemIndex = i-1;
			itemsChosen.add(itemIndex);
			column-=weights[itemIndex];
			
		}
	}
	return itemsChosen;
	}
}