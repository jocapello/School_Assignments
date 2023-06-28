import java.util.Scanner;
class Assignment2A
{
	static int [ ] Value2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,
			1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,0,0};
	static int [ ] Value = {1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10,
			1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10,0,0};

	// for displaying the ones played after you finish a round 
	static int [] CardBacks = {0,0,0,0,0,0,0,0,0,0,0,0};
	//(int) (Math.random()*2+1);

	// 6th num is for a 0 point turn, 7th num is for no move
	// track the originals 


	// track the changes
	static int [] RandomCards2={0,0,0,0,0,0,52,0};
	static int [] RandomCompCards2={0,0,0,0,0,0,52,0};

	static int [ ]  Numbered = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,
			27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
	static int [ ]  Numbered2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,
			27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};

	static int [] RandomCards={9,10,11,12,21,22,52,0};
	static int [] RandomCompCards={0,13,26,40,39,1,52,0};
	static int [] Crib = {9,10,26,40};

	
	public static void main(String[] args) {
	



	public void Hand(int [] Value, int [] Crib, int FlippedCard, int [] Value2,int [] Numbered,int [] RandomCompCards, int [] RandomCards) {
		System.out.println("Counts the crib");
		int X=0,num1=1;
		int Hand [] = null;
		// num1=1 is player
		if (num1==1) {
			Hand = new int [] {RandomCards[0],RandomCards[1],RandomCards[2],RandomCards[3],FlippedCard};
		}
		// num1=2 is comp
		if (num1==2) {
			Hand = new int [] {RandomCompCards[0],RandomCompCards[1],RandomCompCards[2],RandomCompCards[3],FlippedCard};
		}
		// 2 cards that add to 15
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

		// 3 cards that add to 15
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

		// 4 cards that add to 15
		if (Value[Hand[0]]+Value[Hand[1]]+Value[Hand[2]]+Value[Hand[3]]==15) {X=X+2;}
		if (Value[Hand[0]]+Value[Hand[1]]+Value[Hand[2]]+Value[Hand[4]]==15) {X=X+2;}
		if (Value[Hand[0]]+Value[Hand[1]]+Value[Hand[3]]+Value[Hand[4]]==15) {X=X+2;}
		if (Value[Hand[0]]+Value[Hand[2]]+Value[Hand[3]]+Value[Hand[4]]==15) {X=X+2;}
		if (Value[Hand[1]]+Value[Hand[2]]+Value[Hand[3]]+Value[Hand[4]]==15) {X=X+2;}

		// 5 cards that add to 15
		if (Value[Hand[0]]+Value[Hand[1]]+Value[Hand[2]]+Value[Hand[3]]+Value[Hand[4]]==15) {X=X+2;}

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

		// for 4 of a kind
		if (Value2[Hand[0]]==Value2[Hand[1]] && Value2[Hand[2]]==Value2[Hand[3]] && Value2[Hand[0]]==Value2[Hand[1]]) {X=X+12;}
		if (Value2[Hand[0]]==Value2[Hand[1]] && Value2[Hand[2]]==Value2[Hand[4]] && Value2[Hand[1]]==Value2[Hand[2]]) {X=X+12;}
		if (Value2[Hand[0]]==Value2[Hand[1]] && Value2[Hand[3]]==Value2[Hand[4]] && Value2[Hand[1]]==Value2[Hand[3]]) {X=X+12;}
		if (Value2[Hand[0]]==Value2[Hand[2]] && Value2[Hand[3]]==Value2[Hand[4]] && Value2[Hand[2]]==Value2[Hand[3]]) {X=X+12;}
		if (Value2[Hand[1]]==Value2[Hand[2]] && Value2[Hand[3]]==Value2[Hand[4]] && Value2[Hand[2]]==Value2[Hand[3]]) {X=X+12;}

		// flush of 5
		if ((Numbered[Hand[0]]>0 && Numbered[Hand[0]]<=13) && (Numbered[Hand[1]]>0 && Numbered[Hand[1]]<=13) &&  
				(Numbered[Hand[2]]>0 && Numbered[Hand[2]]<=13) &&  (Numbered[Hand[3]]>0 && Numbered[Hand[3]]<=13) && 
				(Numbered[Hand[4]]>0 && Numbered[Hand[4]]<=13) ) {X=X+5;}

		if ((Numbered[Hand[0]]>13 && Numbered[Hand[0]]<=26) && (Numbered[Hand[1]]>13 && Numbered[Hand[1]]<=26) &&  
				(Numbered[Hand[2]]>13 && Numbered[Hand[2]]<=26) &&  (Numbered[Hand[3]]>13 && Numbered[Hand[3]]<=26) && 
				(Numbered[Hand[4]]>13 && Numbered[Hand[4]]<=26) ) {X=X+5;}

		if ((Numbered[Hand[0]]>26 && Numbered[Hand[0]]<=39) && (Numbered[Hand[1]]>26 && Numbered[Hand[1]]<=39) &&  
				(Numbered[Hand[2]]>26 && Numbered[Hand[2]]<=39) &&  (Numbered[Hand[3]]>26 && Numbered[Hand[3]]<=39) && 
				(Numbered[Hand[4]]>26 && Numbered[Hand[4]]<=39) ) {X=X+5;}

		if ((Numbered[Hand[0]]>39 && Numbered[Hand[0]]<=52) && (Numbered[Hand[1]]>39 && Numbered[Hand[1]]<=52) &&  
				(Numbered[Hand[2]]>39 && Numbered[Hand[2]]<=52) &&  (Numbered[Hand[3]]>39 && Numbered[Hand[3]]<=52) && 
				(Numbered[Hand[4]]>39 && Numbered[Hand[4]]<=52) ) {X=X+5;}
		else {
			// flush of hand or 4
			if ((Numbered[Hand[0]]>0 && Numbered[Hand[0]]<=13) && (Numbered[Hand[1]]>0 && Numbered[Hand[1]]<=13) &&  
					(Numbered[Hand[2]]>0 && Numbered[Hand[2]]<=13) &&  (Numbered[Hand[3]]>0 && Numbered[Hand[3]]<=13)) {X=X+4;}

			if ((Numbered[Hand[0]]>13 && Numbered[Hand[0]]<=26) && (Numbered[Hand[1]]>13 && Numbered[Hand[1]]<=26) &&  
					(Numbered[Hand[2]]>13 && Numbered[Hand[2]]<=26) &&  (Numbered[Hand[3]]>13 && Numbered[Hand[3]]<=26)) {X=X+4;}

			if ((Numbered[Hand[0]]>26 && Numbered[Hand[0]]<=39) && (Numbered[Hand[1]]>26 && Numbered[Hand[1]]<=39) &&  
					(Numbered[Hand[2]]>26 && Numbered[Hand[2]]<=39) &&  (Numbered[Hand[3]]>26 && Numbered[Hand[3]]<=39)) {X=X+4;}

			if ((Numbered[Hand[0]]>39 && Numbered[Hand[0]]<=52) && (Numbered[Hand[1]]>39 && Numbered[Hand[1]]<=52) &&  
					(Numbered[Hand[2]]>39 && Numbered[Hand[2]]<=52) &&  (Numbered[Hand[3]]>39 && Numbered[Hand[3]]<=52)) {X=X+4;}
		}
		// order the values of the crib
		int [] TotalCrib = {Value2[Hand[0]],Value2[Hand[1]],Value2[Hand[2]],Value2[Hand[3]],Value2[Hand[4]]};
		int Temp=0;
		for (int i=0; i<4; i++) // compare the number in the front of the list with
		{                   // every number after it                      
			for (int j=i+1; j<5; j++)
			{
				if (TotalCrib[i]<TotalCrib[j]) //if the number at the front is 
				{//swap                  // larger, swap the numbers
					Temp=TotalCrib[i];
					TotalCrib[i]=TotalCrib[j];
					TotalCrib[j]=Temp;
				}//end of i2f
			}
		}
		for (int i=0; i<5; i++)
		{
			System.out.printf("%5d",TotalCrib[i]);
		}
		// find runs of 3
		if ((TotalCrib[0]==TotalCrib[1]-1) && (TotalCrib[1]-1==TotalCrib[2]-1)) {X=X+3;}
		if ((TotalCrib[1]==TotalCrib[2]-1) && (TotalCrib[2]-1==TotalCrib[3]-1)) {X=X+3;}
		if ((TotalCrib[3]==TotalCrib[4]-1) && (TotalCrib[4]-1==TotalCrib[5]-1)) {X=X+3;}
		// find runs of 4
		if ((TotalCrib[0]==TotalCrib[1]-1) && (TotalCrib[1]-1==TotalCrib[2]-1) && (TotalCrib[2]-1==TotalCrib[3]-1)) {X=X+4;}
		if ((TotalCrib[1]==TotalCrib[2]-1) && (TotalCrib[2]-1==TotalCrib[3]-1) && (TotalCrib[3]-1==TotalCrib[4]-1)) {X=X+4;}
		// find runs of 5
		if ((TotalCrib[0]==TotalCrib[1]-1) && (TotalCrib[1]-1==TotalCrib[2]-1) && 
				(TotalCrib[2]-1==TotalCrib[3]-1) && (TotalCrib[3]-1==TotalCrib[4]-1)) {X=X+5;}

		System.out.println();
		System.out.println(X);
}
}
