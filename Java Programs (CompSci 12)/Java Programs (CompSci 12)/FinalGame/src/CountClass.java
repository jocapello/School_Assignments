package src;

import java.util.Arrays;

public class CountClass {
	public static void CountCrib(int [] Value, int [] Crib, int FlippedCard, int [] RandomCompCards2, int [] RandomCards2, 
			int [] Value2, int [] RandomCompCards, int [] RandomCards) {
		int X=0,j=0,j1=0;
		int [] Crib1 = {0,0,0,0,0};

		for (int i=0;i<4;i++) {
			Crib1[i]=Crib[i];
		}
		Crib1[4]=FlippedCard;
		int num=1;

		if (num==1) {
			// 2 cards add to 15
			if (Value[Crib1[0]]+Value[Crib1[1]]==15) {X=X+2;}
			if (Value[Crib1[0]]+Value[Crib1[2]]==15) {X=X+2;}
			if (Value[Crib1[0]]+Value[Crib1[3]]==15) {X=X+2;}
			if (Value[Crib1[0]]+Value[Crib1[4]]==15) {X=X+2;}
			if (Value[Crib1[1]]+Value[Crib1[2]]==15) {X=X+2;}
			if (Value[Crib1[1]]+Value[Crib1[3]]==15) {X=X+2;}
			if (Value[Crib1[1]]+Value[Crib1[4]]==15) {X=X+2;}
			if (Value[Crib1[2]]+Value[Crib1[3]]==15) {X=X+2;}
			if (Value[Crib1[2]]+Value[Crib1[4]]==15) {X=X+2;}
			if (Value[Crib1[3]]+Value[Crib1[4]]==15) {X=X+2;}

			// 3 cards add to 15
			if (Value[Crib1[0]]+Value[Crib1[1]]+Value[Crib1[2]]==15) {X=X+2;}
			if (Value[Crib1[0]]+Value[Crib1[1]]+Value[Crib1[3]]==15) {X=X+2;}
			if (Value[Crib1[0]]+Value[Crib1[1]]+Value[Crib1[4]]==15) {X=X+2;}
			if (Value[Crib1[0]]+Value[Crib1[2]]+Value[Crib1[3]]==15) {X=X+2;}
			if (Value[Crib1[0]]+Value[Crib1[2]]+Value[Crib1[4]]==15) {X=X+2;}
			if (Value[Crib1[0]]+Value[Crib1[3]]+Value[Crib1[4]]==15) {X=X+2;}
			if (Value[Crib1[1]]+Value[Crib1[2]]+Value[Crib1[3]]==15) {X=X+2;}
			if (Value[Crib1[1]]+Value[Crib1[2]]+Value[Crib1[4]]==15) {X=X+2;}
			if (Value[Crib1[1]]+Value[Crib1[3]]+Value[Crib1[4]]==15) {X=X+2;}
			if (Value[Crib1[2]]+Value[Crib1[3]]+Value[Crib1[4]]==15) {X=X+2;}

			// 4 cards add to 15
			if (Value[Crib1[0]]+Value[Crib1[1]]+Value[Crib1[2]]+Value[Crib1[3]]==15) {X=X+2;}
			if (Value[Crib1[0]]+Value[Crib1[1]]+Value[Crib1[2]]+Value[Crib1[4]]==15) {X=X+2;}
			if (Value[Crib1[0]]+Value[Crib1[1]]+Value[Crib1[3]]+Value[Crib1[4]]==15) {X=X+2;}
			if (Value[Crib1[0]]+Value[Crib1[2]]+Value[Crib1[3]]+Value[Crib1[4]]==15) {X=X+2;}
			if (Value[Crib1[0]]+Value[Crib1[1]]+Value[Crib1[3]]+Value[Crib1[4]]==15) {X=X+2;}

			// 5 cards add to 15
			if (Value[Crib1[0]]+Value[Crib1[1]]+Value[Crib1[2]]+Value[Crib1[3]]+Value[Crib1[4]]==15) {X=X+2;}
			System.out.println(X);
			num++;
		}
		if (num==2) {
			int Pair=0;
			if (Pair==0) {
			// for 4 of a kind
			if (Value2[Crib1[0]]==Value2[Crib1[1]] && Value2[Crib1[2]]==Value2[Crib1[3]] && Value2[Crib1[0]]==Value2[Crib1[1]]) {X=X+12;}
			if (Value2[Crib1[0]]==Value2[Crib1[1]] && Value2[Crib1[2]]==Value2[Crib1[4]] && Value2[Crib1[1]]==Value2[Crib1[2]]) {X=X+12;}
			if (Value2[Crib1[0]]==Value2[Crib1[1]] && Value2[Crib1[3]]==Value2[Crib1[4]] && Value2[Crib1[1]]==Value2[Crib1[3]]) {X=X+12;}
			if (Value2[Crib1[0]]==Value2[Crib1[2]] && Value2[Crib1[3]]==Value2[Crib1[4]] && Value2[Crib1[2]]==Value2[Crib1[3]]) {X=X+12;}
			if (Value2[Crib1[1]]==Value2[Crib1[2]] && Value2[Crib1[3]]==Value2[Crib1[4]] && Value2[Crib1[2]]==Value2[Crib1[3]]) {X=X+12;}
			}
			else { Pair++; }
			
			if (Pair==1) {
			// for 3 of a kind
			if (Value2[Crib1[0]]==Value2[Crib1[1]] && Value2[Crib1[1]]==Value2[Crib1[2]]) {X=X+6;}
			if (Value2[Crib1[0]]==Value2[Crib1[1]] && Value2[Crib1[1]]==Value2[Crib1[3]]) {X=X+6;}
			if (Value2[Crib1[0]]==Value2[Crib1[1]] && Value2[Crib1[1]]==Value2[Crib1[4]]) {X=X+6;}
			if (Value2[Crib1[0]]==Value2[Crib1[2]] && Value2[Crib1[1]]==Value2[Crib1[3]]) {X=X+6;}
			if (Value2[Crib1[0]]==Value2[Crib1[2]] && Value2[Crib1[0]]==Value2[Crib1[4]]) {X=X+6;}
			if (Value2[Crib1[0]]==Value2[Crib1[3]] && Value2[Crib1[0]]==Value2[Crib1[4]]) {X=X+6;}
			if (Value2[Crib1[1]]==Value2[Crib1[2]] && Value2[Crib1[1]]==Value2[Crib1[3]]) {X=X+6;}
			if (Value2[Crib1[1]]==Value2[Crib1[2]] && Value2[Crib1[1]]==Value2[Crib1[4]]) {X=X+6;}
			if (Value2[Crib1[1]]==Value2[Crib1[3]] && Value2[Crib1[1]]==Value2[Crib1[4]]) {X=X+6;}
			if (Value2[Crib1[2]]==Value2[Crib1[3]] && Value2[Crib1[2]]==Value2[Crib1[4]]) {X=X+6;}
			}
			else { Pair++; }
			
			if (Pair==2) {
			// for pairs
			if (Value2[Crib1[0]]==Value2[Crib1[1]]) {X=X+2;}
			if (Value2[Crib1[0]]==Value2[Crib1[2]]) {X=X+2;}
			if (Value2[Crib1[0]]==Value2[Crib1[3]]) {X=X+2;}
			if (Value2[Crib1[0]]==Value2[Crib1[4]]) {X=X+2;}
			if (Value2[Crib1[1]]==Value2[Crib1[2]]) {X=X+2;}
			if (Value2[Crib1[1]]==Value2[Crib1[3]]) {X=X+2;}
			if (Value2[Crib1[1]]==Value2[Crib1[4]]) {X=X+2;}
			if (Value2[Crib1[2]]==Value2[Crib1[3]]) {X=X+2;}
			if (Value2[Crib1[2]]==Value2[Crib1[4]]) {X=X+2;}
			if (Value2[Crib1[3]]==Value2[Crib1[4]]) {X=X+2;}
			}
			System.out.println("pair "+X);
			num++;
		}
		if (num==3) {
			// flush
			if ((Crib1[0]>0 && Crib1[0]<=13) && (Crib1[1]>0 && Crib1[1]<=13) &&  
					(Crib1[2]>0 && Crib1[2]<=13) &&  (Crib1[3]>0 && Crib1[3]<=13) && 
					(Crib1[4]>0 && Crib1[4]<=13) ) {X=X+5;}

			if ((Crib1[0]>13 && Crib1[0]<=26) && (Crib1[1]>13 && Crib1[1]<=26) &&  
					(Crib1[2]>13 && Crib1[2]<=26) &&  (Crib1[3]>13 && Crib1[3]<=26) && 
					(Crib1[4]>13 && Crib1[4]<=26) ) {X=X+5;}

			if ((Crib1[0]>26 && Crib1[0]<=39) && (Crib1[1]>26 && Crib1[1]<=39) &&  
					(Crib1[2]>26 && Crib1[2]<=39) &&  (Crib1[3]>26 && Crib1[3]<=39) && 
					(Crib1[4]>26 && Crib1[4]<=39) ) {X=X+5;}

			if ((Crib1[0]>39 && Crib1[0]<=52) && (Crib1[1]>39 && Crib1[1]<=52) &&  
					(Crib1[2]>39 && Crib1[2]<=52) &&  (Crib1[3]>39 && Crib1[3]<=52) && 
					(Crib1[4]>39 && Crib1[4]<=52) ) {X=X+5;}
			System.out.println("flush "+X);
			num++;
		}

		if (num==4) {
			int temp;

			for (int i=0; i<4; i++) // compare the number in the front of the list with
			{                   // every number after it                      
				for (int j2=i+1; j2<5; j2++)
				{
					if (Value2[Crib1[i]]<Value2[Crib1[j2]]) //if the number at the front is 
					{//swap                  // larger, swap the numbers
						temp=Value2[Crib1[i]];
						Value2[Crib1[i]]=Value2[Crib1[j2]];
						Value2[Crib1[j2]]=temp;
					}//end of if
				}}
			int Run=0;

			// run of 5
			if (Value2[Crib1[0]]==Value2[Crib1[1]]+1 && Value2[Crib1[1]]==Value2[Crib1[2]]+1 && Value2[Crib1[2]]==Value2[Crib1[3]]+1
					&& Value2[Crib1[3]]==Value2[Crib1[4]]+1) {X=X+5;}
			else { Run++; }

			if (Run==1) {
				// run of 4
				if (Value2[Crib1[0]]==Value2[Crib1[1]]+1 && Value2[Crib1[1]]==Value2[Crib1[2]]+1 && Value2[Crib1[2]]==Value2[Crib1[3]]+1) {X=X+4;}
				if (Value2[Crib1[0]]==Value2[Crib1[1]]+1 && Value2[Crib1[1]]==Value2[Crib1[3]]+1 && Value2[Crib1[3]]==Value2[Crib1[4]]+1) {X=X+4;}
				if (Value2[Crib1[0]]==Value2[Crib1[1]]+1 && Value2[Crib1[1]]==Value2[Crib1[2]]+1 && Value2[Crib1[2]]==Value2[Crib1[4]]+1) {X=X+4;}
				if (Value2[Crib1[0]]==Value2[Crib1[1]]+1 && Value2[Crib1[1]]==Value2[Crib1[2]]+1 && Value2[Crib1[2]]==Value2[Crib1[4]]+1) {X=X+4;}
				if (Value2[Crib1[0]]==Value2[Crib1[2]]+1 && Value2[Crib1[2]]==Value2[Crib1[3]]+1 && Value2[Crib1[3]]==Value2[Crib1[4]]+1) {X=X+4;}
				if (Value2[Crib1[0]]==Value2[Crib1[1]]+1 && Value2[Crib1[1]]==Value2[Crib1[3]]+1 && Value2[Crib1[3]]==Value2[Crib1[4]]+1) {X=X+4;}
				if (Value2[Crib1[1]]==Value2[Crib1[2]]+1 && Value2[Crib1[2]]==Value2[Crib1[3]]+1 && Value2[Crib1[3]]==Value2[Crib1[4]]+1) {X=X+4;}
			}
			else { Run++; }

			if (Run==2) {
				// run of 3
				if (Value2[Crib1[0]]==Value2[Crib1[1]]+1 && Value2[Crib1[1]]==Value2[Crib1[2]]+1) {X=X+3;}
				if (Value2[Crib1[0]]==Value2[Crib1[2]]+1 && Value2[Crib1[2]]==Value2[Crib1[3]]+1) {X=X+3;}
				if (Value2[Crib1[0]]==Value2[Crib1[1]]+1 && Value2[Crib1[1]]==Value2[Crib1[4]]+1) {X=X+3;}
				if (Value2[Crib1[0]]==Value2[Crib1[2]]+1 && Value2[Crib1[2]]==Value2[Crib1[4]]+1) {X=X+3;}
				if (Value2[Crib1[0]]==Value2[Crib1[3]]+1 && Value2[Crib1[3]]==Value2[Crib1[4]]+1) {X=X+3;}
				if (Value2[Crib1[0]]==Value2[Crib1[1]]+1 && Value2[Crib1[1]]==Value2[Crib1[3]]+1) {X=X+3;}
				if (Value2[Crib1[1]]==Value2[Crib1[3]]+1 && Value2[Crib1[3]]==Value2[Crib1[4]]+1) {X=X+3;}
				if (Value2[Crib1[1]]==Value2[Crib1[2]]+1 && Value2[Crib1[2]]==Value2[Crib1[3]]+1) {X=X+3;}
				if (Value2[Crib1[2]]==Value2[Crib1[3]]+1 && Value2[Crib1[3]]==Value2[Crib1[4]]+1) {X=X+3;}
			}
			
			System.out.println("run "+X);
			num++;
		}
		for (int i=0;i<5;i++) {
			System.out.println(Value2[Crib1[i]]+"       ssss");}
		System.out.println("There are these many points "+X);
	}



	public static void CountHand(int [] Value, int [] Crib, int FlippedCard, int [] RandomCompCards2, int [] RandomCards2, 
			int [] Value2, int [] RandomCompCards, int [] RandomCards, int [] Hand1, int [] Hand2, int num2) {
		int X=0,j=0,j1=0,num1=1;

		// hand changes from comp to player depending on whos counting
		Hand2[4]=FlippedCard;
		Hand1[4]=FlippedCard;
		boolean YN,XD;
		String HandS = "Hand";
		HandS=HandS+num2;
		int [] Hand = {0,0,0,0,0};

		// changes between comp hand and player hand using a string to detect which is being counted
		YN=HandS.startsWith("Hand1");
		if (YN==true) {
			for (int i=0;i<4;i++) {
				Hand[i]=Hand1[i];
			}
			Hand[4]=Value2[FlippedCard];
		}
		XD=HandS.startsWith("Hand2");
		if (XD==true) {
			for (int i=0;i<4;i++) {
				Hand[i]=Hand2[i];
			}
			Hand[4]=Value2[FlippedCard];
		}

		int num=1;

		if (num==1) {
			// 2 cards add to 15
			if (Value[Hand[0]]+Value[Hand[1]]==15) {X=X+2;}
			if (Value[Hand[0]]+Value[Hand[2]]==15) {X=X+2;}
			if (Value[Hand[0]]+Value[Hand[3]]==15) {X=X+2;}
			if (Value[Hand[0]]+Value[Hand[4]]==15) {X=X+2;}
			if (Value[Hand[1]]+Value[Hand[2]]==15) {X=X+2;}
			if (Value[Hand[1]]+Value[Hand[3]]==15) {X=X+2;}
			if (Value[Hand[1]]+Value[Hand[4]]==15) {X=X+2;}
			if (Value[Hand[2]]+Value[Hand[3]]==15) {X=X+2;}
			if (Value[Hand[2]]+Value[Hand[4]]==15) {X=X+2;}
			if (Value[Hand[3]]+Value[Hand[4]]==15) {X=X+2;}

			// 3 cards add to 15
			if (Value[Hand[0]]+Value[Hand[1]]+Value[Hand[2]]==15) {X=X+2;}
			if (Value[Hand[0]]+Value[Hand[1]]+Value[Hand[3]]==15) {X=X+2;}
			if (Value[Hand[0]]+Value[Hand[1]]+Value[Hand[4]]==15) {X=X+2;}
			if (Value[Hand[0]]+Value[Hand[2]]+Value[Hand[3]]==15) {X=X+2;}
			if (Value[Hand[0]]+Value[Hand[2]]+Value[Hand[4]]==15) {X=X+2;}
			if (Value[Hand[0]]+Value[Hand[3]]+Value[Hand[4]]==15) {X=X+2;}
			if (Value[Hand[1]]+Value[Hand[2]]+Value[Hand[3]]==15) {X=X+2;}
			if (Value[Hand[1]]+Value[Hand[2]]+Value[Hand[4]]==15) {X=X+2;}
			if (Value[Hand[1]]+Value[Hand[3]]+Value[Hand[4]]==15) {X=X+2;}
			if (Value[Hand[2]]+Value[Hand[3]]+Value[Hand[4]]==15) {X=X+2;}

			// 4 cards add to 15
			if (Value[Hand[0]]+Value[Hand[1]]+Value[Hand[2]]+Value[Hand[3]]==15) {X=X+2;}
			if (Value[Hand[0]]+Value[Hand[1]]+Value[Hand[2]]+Value[Hand[4]]==15) {X=X+2;}
			if (Value[Hand[0]]+Value[Hand[1]]+Value[Hand[3]]+Value[Hand[4]]==15) {X=X+2;}
			if (Value[Hand[0]]+Value[Hand[2]]+Value[Hand[3]]+Value[Hand[4]]==15) {X=X+2;}
			if (Value[Hand[0]]+Value[Hand[1]]+Value[Hand[3]]+Value[Hand[4]]==15) {X=X+2;}

			// 5 cards add to 15
			if (Value[Hand[0]]+Value[Hand[1]]+Value[Hand[2]]+Value[Hand[3]]+Value[Hand[4]]==15) {X=X+2;}
			System.out.println(X);
			num++;
		}
		if (num==2) {
			int Pair=0;
			if (Pair==0) {
			// for 4 of a kind
			if (Value2[Hand[0]]==Value2[Hand[1]] && Value2[Hand[2]]==Value2[Hand[3]] && Value2[Hand[0]]==Value2[Hand[1]]) {X=X+12;}
			if (Value2[Hand[0]]==Value2[Hand[1]] && Value2[Hand[2]]==Value2[Hand[4]] && Value2[Hand[1]]==Value2[Hand[2]]) {X=X+12;}
			if (Value2[Hand[0]]==Value2[Hand[1]] && Value2[Hand[3]]==Value2[Hand[4]] && Value2[Hand[1]]==Value2[Hand[3]]) {X=X+12;}
			if (Value2[Hand[0]]==Value2[Hand[2]] && Value2[Hand[3]]==Value2[Hand[4]] && Value2[Hand[2]]==Value2[Hand[3]]) {X=X+12;}
			if (Value2[Hand[1]]==Value2[Hand[2]] && Value2[Hand[3]]==Value2[Hand[4]] && Value2[Hand[2]]==Value2[Hand[3]]) {X=X+12;}
			}
			else { Pair++; }
			
			if (Pair==1) {
			// for 3 of a kind
			if (Value2[Hand[0]]==Value2[Hand[1]] && Value2[Hand[1]]==Value2[Hand[2]]) {X=X+6;}
			if (Value2[Hand[0]]==Value2[Hand[1]] && Value2[Hand[1]]==Value2[Hand[3]]) {X=X+6;}
			if (Value2[Hand[0]]==Value2[Hand[1]] && Value2[Hand[1]]==Value2[Hand[4]]) {X=X+6;}
			if (Value2[Hand[0]]==Value2[Hand[2]] && Value2[Hand[1]]==Value2[Hand[3]]) {X=X+6;}
			if (Value2[Hand[0]]==Value2[Hand[2]] && Value2[Hand[0]]==Value2[Hand[4]]) {X=X+6;}
			if (Value2[Hand[0]]==Value2[Hand[3]] && Value2[Hand[0]]==Value2[Hand[4]]) {X=X+6;}
			if (Value2[Hand[1]]==Value2[Hand[2]] && Value2[Hand[1]]==Value2[Hand[3]]) {X=X+6;}
			if (Value2[Hand[1]]==Value2[Hand[2]] && Value2[Hand[1]]==Value2[Hand[4]]) {X=X+6;}
			if (Value2[Hand[1]]==Value2[Hand[3]] && Value2[Hand[1]]==Value2[Hand[4]]) {X=X+6;}
			if (Value2[Hand[2]]==Value2[Hand[3]] && Value2[Hand[2]]==Value2[Hand[4]]) {X=X+6;}
			}
			else { Pair++; }
			
			if (Pair==2) {
			// for pairs
			if (Value2[Hand[0]]==Value2[Hand[1]]) {X=X+2;}
			if (Value2[Hand[0]]==Value2[Hand[2]]) {X=X+2;}
			if (Value2[Hand[0]]==Value2[Hand[3]]) {X=X+2;}
			if (Value2[Hand[0]]==Value2[Hand[4]]) {X=X+2;}
			if (Value2[Hand[1]]==Value2[Hand[2]]) {X=X+2;}
			if (Value2[Hand[1]]==Value2[Hand[3]]) {X=X+2;}
			if (Value2[Hand[1]]==Value2[Hand[4]]) {X=X+2;}
			if (Value2[Hand[2]]==Value2[Hand[3]]) {X=X+2;}
			if (Value2[Hand[2]]==Value2[Hand[4]]) {X=X+2;}
			if (Value2[Hand[3]]==Value2[Hand[4]]) {X=X+2;}
			}



			System.out.println("pair "+X);
			num++;
		}
		if (num==3) {
			int Flush=0;
			if (Flush==0) {
			// flush of all 5 cards
			if ((Hand[0]>0 && Hand[0]<=13) && (Hand[1]>0 && Hand[1]<=13) &&  
					(Hand[2]>0 && Hand[2]<=13) &&  (Hand[3]>0 && Hand[3]<=13) && 
					(Hand[4]>0 && Hand[4]<=13) ) {X=X+5;}

			if ((Hand[0]>13 && Hand[0]<=26) && (Hand[1]>13 && Hand[1]<=26) &&  
					(Hand[2]>13 && Hand[2]<=26) &&  (Hand[3]>13 && Hand[3]<=26) && 
					(Hand[4]>13 && Hand[4]<=26) ) {X=X+5;}

			if ((Hand[0]>26 && Hand[0]<=39) && (Hand[1]>26 && Hand[1]<=39) &&  
					(Hand[2]>26 && Hand[2]<=39) &&  (Hand[3]>26 && Hand[3]<=39) && 
					(Hand[4]>26 && Hand[4]<=39) ) {X=X+5;}

			if ((Hand[0]>39 && Hand[0]<=52) && (Hand[1]>39 && Hand[1]<=52) &&  
					(Hand[2]>39 && Hand[2]<=52) &&  (Hand[3]>39 && Hand[3]<=52) && 
					(Hand[4]>39 && Hand[4]<=52) ) {X=X+5;}
			}
			else { Flush++; }
			
			if (Flush==1) {
			// flush of all cards in hand
			if ((Hand[0]>0 && Hand[0]<=13) && (Hand[1]>0 && Hand[1]<=13) &&  
					(Hand[2]>0 && Hand[2]<=13) &&  (Hand[3]>0 && Hand[3]<=13)) {X=X+4;}

			if ((Hand[0]>13 && Hand[0]<=26) && (Hand[1]>13 && Hand[1]<=26) &&  
					(Hand[2]>13 && Hand[2]<=26) &&  (Hand[3]>13 && Hand[3]<=26)) {X=X+4;}

			if ((Hand[0]>26 && Hand[0]<=39) && (Hand[1]>26 && Hand[1]<=39) &&  
					(Hand[2]>26 && Hand[2]<=39) &&  (Hand[3]>26 && Hand[3]<=39)) {X=X+4;}

			if ((Hand[0]>39 && Hand[0]<=52) && (Hand[1]>39 && Hand[1]<=52) &&  
					(Hand[2]>39 && Hand[2]<=52) &&  (Hand[3]>39 && Hand[3]<=52)) {X=X+4;}
			}

			System.out.println("flush "+X);
			num++;
		}

		if (num==4) {
			int temp;

			for (int i=0; i<4; i++) // compare the number in the front of the list with
			{                   // every number after it                      
				for (int j2=i+1; j2<5; j2++)
				{
					if (Value2[Hand[i]]<Value2[Hand[j2]]) //if the number at the front is 
					{//swap                  // larger, swap the numbers
						temp=Hand[i];
						Value2[Hand[i]]=Value2[Hand[j2]];
						Value2[Hand[j2]]=temp;
					}//end of if
				}}

			for (int i=0;i<5;i++) {
				System.out.println(Value2[Hand[i]]+"       ssss");
			System.out.println(Hand[i]+"       kkui");}

			int Run=0;

			// run of 5
			if (Value2[Hand[0]]==Value2[Hand[1]]+1 && Value2[Hand[1]]==Value2[Hand[2]]+1 && Value2[Hand[2]]==Value2[Hand[3]]+1
					&& Value2[Hand[3]]==Value2[Hand[4]]+1) {X=X+5;}
			else { Run++; }

			if (Run==1) {
				// run of 4
				if (Value2[Hand[0]]==Value2[Hand[1]]+1 && Value2[Hand[1]]==Value2[Hand[2]]+1 && Value2[Hand[2]]==Value2[Hand[3]]+1) {X=X+4;}
				if (Value2[Hand[0]]==Value2[Hand[1]]+1 && Value2[Hand[1]]==Value2[Hand[3]]+1 && Value2[Hand[3]]==Value2[Hand[4]]+1) {X=X+4;}
				if (Value2[Hand[0]]==Value2[Hand[1]]+1 && Value2[Hand[1]]==Value2[Hand[2]]+1 && Value2[Hand[2]]==Value2[Hand[4]]+1) {X=X+4;}
				if (Value2[Hand[0]]==Value2[Hand[1]]+1 && Value2[Hand[1]]==Value2[Hand[2]]+1 && Value2[Hand[2]]==Value2[Hand[4]]+1) {X=X+4;}
				if (Value2[Hand[0]]==Value2[Hand[2]]+1 && Value2[Hand[2]]==Value2[Hand[3]]+1 && Value2[Hand[3]]==Value2[Hand[4]]+1) {X=X+4;}
				if (Value2[Hand[0]]==Value2[Hand[1]]+1 && Value2[Hand[1]]==Value2[Hand[3]]+1 && Value2[Hand[3]]==Value2[Hand[4]]+1) {X=X+4;}
				if (Value2[Hand[1]]==Value2[Hand[2]]+1 && Value2[Hand[2]]==Value2[Hand[3]]+1 && Value2[Hand[3]]==Value2[Hand[4]]+1) {X=X+4;}
			}
			else { Run++; }

			if (Run==2) {
				// run of 3
				if (Value2[Hand[0]]==Value2[Hand[1]]+1 && Value2[Hand[1]]==Value2[Hand[2]]+1) {X=X+3;}
				if (Value2[Hand[0]]==Value2[Hand[2]]+1 && Value2[Hand[2]]==Value2[Hand[3]]+1) {X=X+3;}
				if (Value2[Hand[0]]==Value2[Hand[1]]+1 && Value2[Hand[1]]==Value2[Hand[4]]+1) {X=X+3;}
				if (Value2[Hand[0]]==Value2[Hand[2]]+1 && Value2[Hand[2]]==Value2[Hand[4]]+1) {X=X+3;}
				if (Value2[Hand[0]]==Value2[Hand[3]]+1 && Value2[Hand[3]]==Value2[Hand[4]]+1) {X=X+3;}
				if (Value2[Hand[0]]==Value2[Hand[1]]+1 && Value2[Hand[1]]==Value2[Hand[3]]+1) {X=X+3;}
				if (Value2[Hand[1]]==Value2[Hand[3]]+1 && Value2[Hand[3]]==Value2[Hand[4]]+1) {X=X+3;}
				if (Value2[Hand[1]]==Value2[Hand[2]]+1 && Value2[Hand[2]]==Value2[Hand[3]]+1) {X=X+3;}
				if (Value2[Hand[2]]==Value2[Hand[3]]+1 && Value2[Hand[3]]==Value2[Hand[4]]+1) {X=X+3;}
			}


			System.out.println("run "+X);
			num++;
		}

		for (int i=0;i<5;i++) {
			System.out.println(num2+"   "+Hand[i]);
		}
		num=0;
		System.out.println("There are these many points "+X);
	}
}
