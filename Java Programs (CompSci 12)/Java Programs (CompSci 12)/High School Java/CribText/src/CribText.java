import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Random;
class CribText
{
	static int Draw,Draw2,Total=0,Turn,CribNum=0,CIDNUM=0;
	static int [ ] Value = {1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10,
			1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10,0,0};
	static int [ ] Value2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,
			1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,0,0};
	static int [] PlayerHand= {0,0,0,0,0,0}, CompHand= {0,0,0,0,0,0};
	static String [] PlayerCardType= {"","","","","",""}, CompCardType= {"","","","","",""}, CribType= {"","","",""},CardsInCrib={"","","","","","","",""};
	static int [] Crib= {0,0,0,0}, PlayedCards= {0,0,0,0,0,0,0,0};


	public static void main(String []args) {
		int Game=1;


		int PDRAW,CDRAW;
		RandomDraw();
		System.out.println("Player drew "+Value[Draw]);
		PDRAW=Value[Draw];
		RandomDraw();
		System.out.println("Computer drew "+Value[Draw]);
		CDRAW=Value[Draw];
		if (CDRAW<PDRAW) {
			System.out.println("Computer goes first ");
			Turn=0;
		}
		else {
			System.out.println("Player goes first");
			Turn=1;
		}

		for (int i=0;i<6;i++) { // Get all of the cards for each hand
			RandomDraw();
			CreateHands();
			PlayerHand[i]=Draw;
			NamePCards(Draw,i);
			CompHand[i]=Draw2;
			NameCCards(Draw2,i);
		}
		for (int i=0;i<6;i++) { // Wait until after cards are given suits before sorting 
			PlayerHand[i]=Value[PlayerHand[i]];
			CompHand[i]=Value[CompHand[i]];
		}
		Throw(); // Make up the crib
		FlipCard();

		Play();

	}
	public static void CheckMeth() {
		if (PlayedCards[7]>0) {
			System.out.println();
			System.out.println();
			System.out.println("Out of cards!!!!!!!");
			for (int i=0;i<8;i++) {
				System.out.print(PlayedCards[i]+CardsInCrib[i]+" ");
			}
			System.out.println();

		}
	}
	public static void Play() {
		CheckMeth();
		Scanner input = new Scanner (System.in);
		if (Turn==1) {
			for (int i=0;i<6;i++) {
				System.out.print(PlayerHand[i]+PlayerCardType[i]+"  ");
			}
			System.out.println();
			for (int i=0;i<4;i++) {
				System.out.print(Crib[i]+"  ");
			}
			System.out.println();
			System.out.println();
			System.out.println("Type in the position of the card you'd like to play  ");
			int Card=input.nextInt();
			if (PlayerHand[Card]==0) {
				Play();
			}
			else {
				CardsInCrib[CIDNUM]=PlayerCardType[Card];
				PlayedCards[CIDNUM]=PlayerHand[Card];
				CIDNUM++;
				Total=Total+PlayerHand[Card];
				System.out.println("Selected card: "+PlayerHand[Card]+PlayerCardType[Card]);
				PlayerHand[Card]=0;
				PlayerCardType[Card]=" ";
				Turn=0;
				Play();
			}
		}
		else {
			CompPlay();
			Turn=1;
			Play();
		}
	}


	public static void CompPlay() {
//		System.out.println();
//
//		for (int i=0;i<6;i++) {
//			System.out.print(CompHand[i]+CompCardType[i]+"  ");
//		}
//		System.out.println();

		CheckMeth();
		int num=(int)(Math.random( )* 6);
		if (CompHand[0] == 0 && CompHand[1]==0 && CompHand[2]==0 && CompHand[3]==0 && CompHand[4]==0 && CompHand[5]==0) {
			System.out.println("NOPE ");
		}
		if (CompHand[num]==0) {
			CompPlay();
		}
		else {
			System.out.println("The card the comp plays is "+CompHand[num]+CompCardType[num]);
			Total=Total+CompHand[num];
			CardsInCrib[CIDNUM]=CompCardType[num];
			PlayedCards[CIDNUM]=CompHand[num];
			CIDNUM++;
			CompHand[num]=0;
			System.out.println("The new total is "+Total);
			System.out.println();
			System.out.println();
		}
	}


	public static void FlipCard() {
		int Flip=(int)(Math.random( )* 52);
		if (Value2[Flip]==0) {
			FlipCard();
		}
		Flip=Value2[Flip];
		Value2[Flip]=0;
		NameFlipped(Flip);
		System.out.println("The card that is flipped is "+Flipped);
	}


	public static void Throw() {
		Scanner input = new Scanner (System.in);
		// Pick the cards to throw
		for (int i=0;i<6;i++) {
			System.out.print(PlayerHand[i]+PlayerCardType[i]+"  ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Select the two cards you would like to throw ( Type the place of the card ) ");
		System.out.println();
		int num1=input.nextInt();
		int num2=input.nextInt();
		if (num2==num1) {
			System.out.println("Do not select the same card twice");
			Throw();
		}
		Crib[0]=PlayerHand[num1];
		CribType[0]=PlayerCardType[num1];
		Crib[1]=PlayerHand[num2];
		CribType[1]=PlayerCardType[num2];

		PlayerHand[num1]=0;
		PlayerCardType[num1]="";
		PlayerHand[num2]=0;
		PlayerCardType[num2]="";

		// Cards for the comp to throw
		int Rthrow=(int)(Math.random( )* 6);
		int Rthrow2=(int)(Math.random( )* 6);
		Crib[2]=CompHand[Rthrow];
		Crib[3]=CompHand[Rthrow2];
		CompHand[Rthrow]=0;
		CompCardType[Rthrow]="";
		CompHand[Rthrow2]=0;
		CompCardType[Rthrow2]="";

		System.out.println();
		//		System.out.println();
		//		for (int i=0;i<4;i++) {
		//			System.out.print(Crib[i]+" ");
		//		}

	}
	static String Flipped="";
	public static void NameFlipped(int Flip) {
		if (Flip<13) {
			Flipped=Flip+" Clubs";
		}
		else if (Flip<26) {
			Flipped=Flip+" Diamonds";
		}
		else if (Flip<39) {
			Flipped=Flip+" Hearts";
		}
		else if (Flip<52) {
			Flipped=Flip+" Spades";
		}
	}
	public static void NamePCards(int Num,int i) {
		if (Draw<13) {
			PlayerCardType[i]=" Clubs";
		}
		else if (Draw<26) {
			PlayerCardType[i]=" Diamonds";
		}
		else if (Draw<39) {
			PlayerCardType[i]=" Hearts";
		}
		else if (Draw<52) {
			PlayerCardType[i]=" Spades";
		}
	}
	public static void NameCCards(int Num,int i) {
		if (Draw2<13) {
			CompCardType[i]=" Clubs";
		}
		else if (Draw2<26) {
			CompCardType[i]=" Diamonds";
		}
		else if (Draw2<39) {
			CompCardType[i]=" Hearts";
		}
		else if (Draw2<52) {
			CompCardType[i]=" Spades";
		}
	}
	public static void CreateHands(){
		if (Value2[Draw]!=0 && Value2[Draw2]!=0) {
			Value2[Draw]=0;
		}
		else {
			RandomDraw();
		}


	}
	public static void RandomDraw() {
		Draw=(int)(Math.random( )* 53);
		Draw2=(int)(Math.random( )* 53);

	}
//	public static void PointTracker(int CheckNext) {
//		//		System.out.println("In points");
//
//		// After play plays
//		if (RunThrough==100) {
//			PIP=PIP+Value[RandomCards[InPlay]];
//			// if everything adds to 31, resets
//			if (PIP==31) {
//
//				Points=Points+2;
//				System.out.println("31 P");
//				for (int i=0;i<6;i++) {
//					if (RandomCompCards[i]==100) {
//						CardBacks[i]=1;
//					}
//					if (RandomCards[i]==100) {
//						CardBacks[i+6]=1;
//					}
//				}
//				DisplayBackCard();
//				DrawBack=1;
//				PIP=0;
//			}
//			// for 15 
//			if (PIP==15) {
//				Points=Points+2;
//				System.out.println("PP 15");
//			}
//
//			// pair
//			if ((CardsPlayed[0]==CardsPlayed[1]) && CardsPlayed[1]!=0 || (CardsPlayed[1]==CardsPlayed[2]) && CardsPlayed[2]!=0
//					|| (CardsPlayed[2]==CardsPlayed[3]) && CardsPlayed[3]!=0 || (CardsPlayed[3]==CardsPlayed[4]) && CardsPlayed[4]!=0
//					|| (CardsPlayed[4]==CardsPlayed[5]) && CardsPlayed[5]!=0 || (CardsPlayed[5]==CardsPlayed[6]) && CardsPlayed[6]!=0
//					|| (CardsPlayed[6]==CardsPlayed[7]) && CardsPlayed[7]!=0) {
//				Points=Points+2;
//			}
//			// 3 in a row
//			if ((CardsPlayed[0]==CardsPlayed[1] && CardsPlayed[1]==CardsPlayed[2]) && CardsPlayed[2]!=0
//					|| (CardsPlayed[1]==CardsPlayed[2] && CardsPlayed[2]==CardsPlayed[3]) && CardsPlayed[3]!=0
//					|| (CardsPlayed[2]==CardsPlayed[3] && CardsPlayed[3]==CardsPlayed[4]) && CardsPlayed[4]!=0
//					|| (CardsPlayed[3]==CardsPlayed[4] && CardsPlayed[4]==CardsPlayed[5]) && CardsPlayed[5]!=0
//					|| (CardsPlayed[4]==CardsPlayed[5] && CardsPlayed[5]==CardsPlayed[6]) && CardsPlayed[6]!=0
//					|| (CardsPlayed[5]==CardsPlayed[6] && CardsPlayed[6]==CardsPlayed[7]) && CardsPlayed[7]!=0) {
//				Points=Points+6;
//			}
//			// 4 in a row
//			if ((CardsPlayed[0]==CardsPlayed[1] && CardsPlayed[1]==CardsPlayed[2] && CardsPlayed[2]==CardsPlayed[3]) && CardsPlayed[3]!=0 ||
//					(CardsPlayed[1]==CardsPlayed[2] && CardsPlayed[2]==CardsPlayed[3] && CardsPlayed[3]==CardsPlayed[4]) && CardsPlayed[4]!=0 ||
//					(CardsPlayed[2]==CardsPlayed[3] && CardsPlayed[3]==CardsPlayed[4] && CardsPlayed[4]==CardsPlayed[5]) && CardsPlayed[5]!=0 ||
//					(CardsPlayed[3]==CardsPlayed[4] && CardsPlayed[4]==CardsPlayed[5] && CardsPlayed[5]==CardsPlayed[6]) && CardsPlayed[6]!=0 ||
//					(CardsPlayed[4]==CardsPlayed[5] && CardsPlayed[5]==CardsPlayed[6] && CardsPlayed[6]==CardsPlayed[7]) && CardsPlayed[7]!=0) {
//				Points=Points+12;
//			}
//
//			int temp;
//
//			for (int i=0; i<7; i++) // compare the number in the front of the list with
//			{                   // every number after it                      
//				for (int j2=i+1; j2<8; j2++)
//				{
//					if (CardsPlayed[i]<CardsPlayed[j2]) //if the number at the front is 
//					{//swap                  // larger, swap the numbers
//						temp=CardsPlayed[i];
//						CardsPlayed[i]=CardsPlayed[j2];
//						CardsPlayed[j2]=temp;
//					}//end of if
//				}}
//			for (int i=0;i<8;i++) {
//				System.out.println("Played "+CardsPlayed[i]);
//			}
//			// run of 5
//			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1
//					&& Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+5;}
//			else {
//				// run of 4
//				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1) {Points=Points+4;}
//				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+4;}
//				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[4]]-1) {Points=Points+4;}
//				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[4]]-1) {Points=Points+4;}
//				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+4;}
//				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+4;}
//				if (Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+4;}
//			}
//			// run of 3
//			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1) {Points=Points+3;}
//			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1) {Points=Points+3;}
//			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[4]]-1) {Points=Points+3;}
//			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[4]]-1) {Points=Points+3;}
//			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+3;}
//			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[3]]-1) {Points=Points+3;}
//			if (Value2[CardsPlayed[1]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+3;}
//			if (Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1) {Points=Points+3;}
//			if (Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+3;}
//
//
//
//		}
//		else {
//			if (X!=7) 
//			{
//				PIP=PIP+Value[RandomCompCards[X]];
//			}
//
//			// if everything adds to 31, resets
//			if (PIP==31) {
//
//				ComputerPoints=ComputerPoints+2;
//				System.out.println("31 P");
//				DisplayBackCard();
//				DrawBack=1;
//				PIP=0;
//			}
//			// for 15 
//			if (PIP==15) {
//
//				ComputerPoints=ComputerPoints+2;
//				System.out.println("PP 15");
//
//			}
//
//			// pair
//			if ((CardsPlayed[0]==CardsPlayed[1]) && CardsPlayed[1]!=0 || (CardsPlayed[1]==CardsPlayed[2]) && CardsPlayed[2]!=0
//					|| (CardsPlayed[2]==CardsPlayed[3]) && CardsPlayed[3]!=0 || (CardsPlayed[3]==CardsPlayed[4]) && CardsPlayed[4]!=0
//					|| (CardsPlayed[4]==CardsPlayed[5]) && CardsPlayed[5]!=0 || (CardsPlayed[5]==CardsPlayed[6]) && CardsPlayed[6]!=0
//					|| (CardsPlayed[6]==CardsPlayed[7]) && CardsPlayed[7]!=0) {
//				ComputerPoints=ComputerPoints+2;
//			}
//			// 3 in a row
//			if ((CardsPlayed[0]==CardsPlayed[1] && CardsPlayed[1]==CardsPlayed[2]) && CardsPlayed[2]!=0
//					|| (CardsPlayed[1]==CardsPlayed[2] && CardsPlayed[2]==CardsPlayed[3]) && CardsPlayed[3]!=0
//					|| (CardsPlayed[2]==CardsPlayed[3] && CardsPlayed[3]==CardsPlayed[4]) && CardsPlayed[4]!=0
//					|| (CardsPlayed[3]==CardsPlayed[4] && CardsPlayed[4]==CardsPlayed[5]) && CardsPlayed[5]!=0
//					|| (CardsPlayed[4]==CardsPlayed[5] && CardsPlayed[5]==CardsPlayed[6]) && CardsPlayed[6]!=0
//					|| (CardsPlayed[5]==CardsPlayed[6] && CardsPlayed[6]==CardsPlayed[7]) && CardsPlayed[7]!=0) {
//				ComputerPoints=ComputerPoints+6;
//			}
//			// 4 in a row
//			if ((CardsPlayed[0]==CardsPlayed[1] && CardsPlayed[1]==CardsPlayed[2] && CardsPlayed[2]==CardsPlayed[3]) && CardsPlayed[3]!=0 ||
//					(CardsPlayed[1]==CardsPlayed[2] && CardsPlayed[2]==CardsPlayed[3] && CardsPlayed[3]==CardsPlayed[4]) && CardsPlayed[4]!=0 ||
//					(CardsPlayed[2]==CardsPlayed[3] && CardsPlayed[3]==CardsPlayed[4] && CardsPlayed[4]==CardsPlayed[5]) && CardsPlayed[5]!=0 ||
//					(CardsPlayed[3]==CardsPlayed[4] && CardsPlayed[4]==CardsPlayed[5] && CardsPlayed[5]==CardsPlayed[6]) && CardsPlayed[6]!=0 ||
//					(CardsPlayed[4]==CardsPlayed[5] && CardsPlayed[5]==CardsPlayed[6] && CardsPlayed[6]==CardsPlayed[7]) && CardsPlayed[7]!=0) {
//				ComputerPoints=ComputerPoints+12;
//			}
//
//			int temp;
//
//			for (int i=0; i<7; i++) // compare the number in the front of the list with
//			{                   // every number after it                      
//				for (int j2=i+1; j2<8; j2++)
//				{
//					if (CardsPlayed[i]<CardsPlayed[j2]) //if the number at the front is 
//					{//swap                  // larger, swap the numbers
//						temp=CardsPlayed[i];
//						CardsPlayed[i]=CardsPlayed[j2];
//						CardsPlayed[j2]=temp;
//					}//end of if
//				}}
//			for (int i=0;i<8;i++) {
//				System.out.println(CardsPlayed[i]);
//			}
//			// runs means it will only count a run for the highest ammount possible instead of all 
//			int Runs=0;
//			// run of 5
//			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1
//					&& Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {ComputerPoints=ComputerPoints+5;}
//			else { Runs++; }
//
//			if (Runs==1) {
//				// run of 4
//				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1) {ComputerPoints=ComputerPoints+4;}
//				if (Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {ComputerPoints=ComputerPoints+4;}
//			}
//			else { Runs++;}
//
//			if (Runs==3) {
//				// run of 3
//				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1) {ComputerPoints=ComputerPoints+3;}
//				if (Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1) {ComputerPoints=ComputerPoints+3;}
//				if (Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {ComputerPoints=ComputerPoints+3;}
//			}
//		}
//	}
}