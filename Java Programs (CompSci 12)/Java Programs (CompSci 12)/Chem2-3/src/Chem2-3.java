import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class Chem2 {

	public static void main(String args[], int i) {
		Scanner input = new Scanner(System.in);
		String eq;
		eq=input.nextLine();
		String[] intArray = null;
		String[] InsideBrack = null;
		String NUM;
		if (eq.contains(" ")) {
			intArray=eq.split("\\s+");
		}
		//		System.out.println(intArray[0]);
		//		System.out.println(intArray[1]);
		for (int i1=0;i1<4;i1++) {
			System.out.println(intArray[i1]);
		}
		NUM=intArray[0];
		for (int i1=0; i1<4;i1++) {
			if (NUM.contains("(")) {
				InsideBrack=NUM.split("\\(");
			}}
		System.out.println("("+InsideBrack[1]);
		sender(i, intArray);
	}
	public static void sender(int i,String []intArray) {
		int num;
				for (i=0; i<4;i++) {
					if (intArray[i].contains("1)")) {
						num=1;

						LowerCase(intArray, i,num);
						
					}	if (intArray[i].contains("2)")) {
						num=2;
						LowerCase(intArray, i,num);

					}	if (intArray[i].contains("3)")) {
						num=3;
						LowerCase(intArray, i,num);

					}	if (intArray[i].contains("4)")) {
						num=4;
						LowerCase(intArray, i,num);

					}	if (intArray[i].contains("5)")) {
						num=5;
						LowerCase(intArray, i,num);

					}	if (intArray[i].contains("6)")) {
						num=6;
						LowerCase(intArray, i,num);

					}	if (intArray[i].contains("7)")) {
						num=7;
						LowerCase(intArray, i,num);

					}	if (intArray[i].contains("8)")) {
						num=8;
						LowerCase(intArray, i,num);

					}	if (intArray[i].contains("9)")) {
						num=9;
						LowerCase(intArray, i,num);

					}}
	}
	public static void LowerCase(String intArray[],int i,int num) {
		System.out.println();
		if (intArray[i].contains("Ac")){			System.out.println("There is " +num+ " elements of "+"1"); 
		}
		else if (intArray[i].contains("Al")){			System.out.println("There is " +num+ " elements of "+"2"); 
		}
		else if (intArray[i].contains("Am")){			System.out.println("There is " +num+ " elements of "+"3"); 
		}
		else if (intArray[i].contains("Ar")){			System.out.println("There is " +num+ " elements of "+"4"); 
		}
		else if (intArray[i].contains("As")){			System.out.println("There is " +num+ " elements of "+"5"); 
		}
		else if (intArray[i].contains("At")){			System.out.println("There is " +num+ " elements of "+"6"); 
		}
		else if (intArray[i].contains("Au")){			System.out.println("There is " +num+ " elements of "+"7"); 
		}
		else if (intArray[i].contains("B")){			System.out.println("There is " +num+ " elements of "+"8"); 
		}
		else if (intArray[i].contains("Ba")){			System.out.println("There is " +num+ " elements of "+"9"); 
		}
		else if (intArray[i].contains("Be")){			System.out.println("There is " +num+ " elements of "+"10"); 
		}
		else if (intArray[i].contains("Bh")){			System.out.println("There is " +num+ " elements of "+"11"); 
		}
		else if (intArray[i].contains("Bi")){			System.out.println("There is " +num+ " elements of "+"12"); 
		}
		else if (intArray[i].contains("Bk")){			System.out.println("There is " +num+ " elements of "+"13"); 
		}
		else if (intArray[i].contains("Br")){			System.out.println("There is " +num+ " elements of "+"14"); 
		}
		else if (intArray[i].contains("C")){			System.out.println("There is " +num+ " elements of "+"15"); 
		}
		else if (intArray[i].contains("Ca")){			System.out.println("There is " +num+ " elements of "+"16"); 
		}
		else if (intArray[i].contains("Cd")){			System.out.println("There is " +num+ " elements of "+"17"); 
		}
		else if (intArray[i].contains("Ce")){			System.out.println("There is " +num+ " elements of "+"18"); 
		}
		else if (intArray[i].contains("Cf")){			System.out.println("There is " +num+ " elements of "+"19"); 
		}
		else if (intArray[i].contains("Cl")){			System.out.println("There is " +num+ " elements of "+"20"); 
		}
		else if (intArray[i].contains("Cm")){			System.out.println("There is " +num+ " elements of "+"21"); 
		}
		else if (intArray[i].contains("Cn")){			System.out.println("There is " +num+ " elements of "+"22"); 
		}
		else if (intArray[i].contains("Co")){			System.out.println("There is " +num+ " elements of "+"23"); 
		}
		else if (intArray[i].contains("Cr")){			System.out.println("There is " +num+ " elements of "+"24"); 
		}
		else if (intArray[i].contains("Cs")){			System.out.println("There is " +num+ " elements of "+"25"); 
		}
		else if (intArray[i].contains("Cu")){			System.out.println("There is " +num+ " elements of "+"26"); 
		}
		else if (intArray[i].contains("Dd")){			System.out.println("There is " +num+ " elements of "+"27"); 
		}
		else if (intArray[i].contains("Ds")){			System.out.println("There is " +num+ " elements of "+"28"); 
		}
		else if (intArray[i].contains("Dy")){			System.out.println("There is " +num+ " elements of "+"29"); 
		}
		else if (intArray[i].contains("Er")){			System.out.println("There is " +num+ " elements of "+"30"); 
		}
		else if (intArray[i].contains("Es")){			System.out.println("There is " +num+ " elements of "+"31"); 
		}
		else if (intArray[i].contains("Eu")){			System.out.println("There is " +num+ " elements of "+"32"); 
		}
		else if (intArray[i].contains("F")){			System.out.println("There is " +num+ " elements of "+"33"); 
		}
		else if (intArray[i].contains("Fe")){			System.out.println("There is " +num+ " elements of "+"34"); 
		}
		else if (intArray[i].contains("Fl")){			System.out.println("There is " +num+ " elements of "+"35"); 
		}
		else if (intArray[i].contains("Fm")){			System.out.println("There is " +num+ " elements of "+"36"); 
		}
		else if (intArray[i].contains("Fr")){			System.out.println("There is " +num+ " elements of "+"37"); 
		}
		else if (intArray[i].contains("Ga")){			System.out.println("There is " +num+ " elements of "+"38"); 
		}
		else if (intArray[i].contains("Gd")){			System.out.println("There is " +num+ " elements of "+"39"); 
		}
		else if (intArray[i].contains("Ge")){			System.out.println("There is " +num+ " elements of "+"40"); 
		}
		else if (intArray[i].contains("H")){			System.out.println("There is " +num+ " elements of "+"41"); 
		}
		else if (intArray[i].contains("He")){			System.out.println("There is " +num+ " elements of "+"42"); 
		}
		else if (intArray[i].contains("Hf")){			System.out.println("There is " +num+ " elements of "+"43"); 
		}
		else if (intArray[i].contains("Hg")){			System.out.println("There is " +num+ " elements of "+"44"); 
		}
		else if (intArray[i].contains("Ho")){			System.out.println("There is " +num+ " elements of "+"45"); 
		}
		else if (intArray[i].contains("Hs")){			System.out.println("There is " +num+ " elements of "+"46"); 
		}
		else if (intArray[i].contains("I")){			System.out.println("There is " +num+ " elements of "+"47"); 
		}
		else if (intArray[i].contains("In")){			System.out.println("There is " +num+ " elements of "+"48"); 
		}
		else if (intArray[i].contains("Ir")){			System.out.println("There is " +num+ " elements of "+"49"); 
		}
		else if (intArray[i].contains("K")){			System.out.println("There is " +num+ " elements of "+"50"); 
		}
		else if (intArray[i].contains("Kr")){			System.out.println("There is " +num+ " elements of "+"51"); 
		}
		else if (intArray[i].contains("La")){			System.out.println("There is " +num+ " elements of "+"52"); 
		}
		else if (intArray[i].contains("Li")){			System.out.println("There is " +num+ " elements of "+"53"); 
		}
		else if (intArray[i].contains("Lr")){			System.out.println("There is " +num+ " elements of "+"54"); 
		}
		else if (intArray[i].contains("Lu")){			System.out.println("There is " +num+ " elements of "+"55"); 
		}
		else if (intArray[i].contains("Lv")){			System.out.println("There is " +num+ " elements of "+"56"); 
		}
		else if (intArray[i].contains("Md")){			System.out.println("There is " +num+ " elements of "+"57"); 
		}
		else if (intArray[i].contains("Mg")){			System.out.println("There is " +num+ " elements of "+"58"); 
		}
		else if (intArray[i].contains("Mn")){			System.out.println("There is " +num+ " elements of "+"59"); 
		}
		else if (intArray[i].contains("Mo")){			System.out.println("There is " +num+ " elements of "+"60"); 
		}
		else if (intArray[i].contains("Mt")){			System.out.println("There is " +num+ " elements of "+"61"); 
		}
		else if (intArray[i].contains("N")){			System.out.println("There is " +num+ " elements of "+"62"); 
		}
		else if (intArray[i].contains("Na")){			System.out.println("There is " +num+ " elements of "+"63"); 
		}
		else if (intArray[i].contains("Nb")){			System.out.println("There is " +num+ " elements of "+"64"); 
		}
		else if (intArray[i].contains("Ne")){			System.out.println("There is " +num+ " elements of "+"65"); 
		}
		else if (intArray[i].contains("Ni")){			System.out.println("There is " +num+ " elements of "+"66"); 
		}
		else if (intArray[i].contains("No")){			System.out.println("There is " +num+ " elements of "+"67"); 
		}
		else if (intArray[i].contains("Np")){			System.out.println("There is " +num+ " elements of "+"68"); 
		}
		else if (intArray[i].contains("O")){			System.out.println("There is " +num+ " elements of "+"69"); 
		}
		else if (intArray[i].contains("Os")){			System.out.println("There is " +num+ " elements of "+"70"); 
		}
		else if (intArray[i].contains("P")){			System.out.println("There is " +num+ " elements of "+"71"); 
		}
		else if (intArray[i].contains("Pa")){			System.out.println("There is " +num+ " elements of "+"72"); 
		}
		else if (intArray[i].contains("Pb")){			System.out.println("There is " +num+ " elements of "+"73"); 
		}
		else if (intArray[i].contains("Pd")){			System.out.println("There is " +num+ " elements of "+"74"); 
		}
		else if (intArray[i].contains("Pm")){			System.out.println("There is " +num+ " elements of "+"75"); 
		}
		else if (intArray[i].contains("Po")){			System.out.println("There is " +num+ " elements of "+"76"); 
		}
		else if (intArray[i].contains("Pr")){			System.out.println("There is " +num+ " elements of "+"77"); 
		}
		else if (intArray[i].contains("Pt")){			System.out.println("There is " +num+ " elements of "+"78"); 
		}
		else if (intArray[i].contains("Pu")){			System.out.println("There is " +num+ " elements of "+"79"); 
		}
		else if (intArray[i].contains("Ra")){			System.out.println("There is " +num+ " elements of "+"80"); 
		}
		else if (intArray[i].contains("Rb")){			System.out.println("There is " +num+ " elements of "+"81"); 
		}
		else if (intArray[i].contains("Re")){			System.out.println("There is " +num+ " elements of "+"82"); 
		}
		else if (intArray[i].contains("Rf")){			System.out.println("There is " +num+ " elements of "+"83"); 
		}
		else if (intArray[i].contains("Rg")){			System.out.println("There is " +num+ " elements of "+"84"); 
		}
		else if (intArray[i].contains("Rh")){			System.out.println("There is " +num+ " elements of "+"85"); 
		}
		else if (intArray[i].contains("Rn")){			System.out.println("There is " +num+ " elements of "+"86"); 
		}
		else if (intArray[i].contains("Ru")){			System.out.println("There is " +num+ " elements of "+"87"); 
		}
		else if (intArray[i].contains("S")){			System.out.println("There is " +num+ " elements of "+"88"); 
		}
		else if (intArray[i].contains("Sb")){			System.out.println("There is " +num+ " elements of "+"89"); 
		}
		else if (intArray[i].contains("Sc")){			System.out.println("There is " +num+ " elements of "+"90"); 
		}
		else if (intArray[i].contains("Se")){			System.out.println("There is " +num+ " elements of "+"91"); 
		}
		else if (intArray[i].contains("Sg")){			System.out.println("There is " +num+ " elements of "+"92"); 
		}
		else if (intArray[i].contains("Si")){			System.out.println("There is " +num+ " elements of "+"93"); 
		}
		else if (intArray[i].contains("Sm")){			System.out.println("There is " +num+ " elements of "+"94"); 
		}
		else if (intArray[i].contains("Sn")){			System.out.println("There is " +num+ " elements of "+"95"); 
		}
		else if (intArray[i].contains("Ta")){			System.out.println("There is " +num+ " elements of "+"96"); 
		}
		else if (intArray[i].contains("Tb")){			System.out.println("There is " +num+ " elements of "+"97"); 
		}
		else if (intArray[i].contains("Tc")){			System.out.println("There is " +num+ " elements of "+"98"); 
		}
		else if (intArray[i].contains("Te")){			System.out.println("There is " +num+ " elements of "+"99"); 
		}
		else if (intArray[i].contains("Th")){			System.out.println("There is " +num+ " elements of "+"100"); 
		}
		else if (intArray[i].contains("Ti")){			System.out.println("There is " +num+ " elements of "+"101"); 
		}
		else if (intArray[i].contains("Tl")){			System.out.println("There is " +num+ " elements of "+"102"); 
		}
		else if (intArray[i].contains("Tm")){			System.out.println("There is " +num+ " elements of "+"103"); 
		}
		else if (intArray[i].contains("U")){			System.out.println("There is " +num+ " elements of "+"104"); 
		}
		else if (intArray[i].contains("Uuo")){			System.out.println("There is " +num+ " elements of "+"105"); 
		}
		else if (intArray[i].contains("Uup")){			System.out.println("There is " +num+ " elements of "+"106"); 
		}
		else if (intArray[i].contains("Uus")){			System.out.println("There is " +num+ " elements of "+"107"); 
		}
		else if (intArray[i].contains("Uut")){			System.out.println("There is " +num+ " elements of "+"108"); 
		}
		else if (intArray[i].contains("V")){			System.out.println("There is " +num+ " elements of "+"109"); 
		}
		else if (intArray[i].contains("W")){			System.out.println("There is " +num+ " elements of "+"110"); 
		}
		else if (intArray[i].contains("Xe")){			System.out.println("There is " +num+ " elements of "+"111"); 
		}
		else if (intArray[i].contains("Y")){			System.out.println("There is " +num+ " elements of "+"112"); 
		}
		else if (intArray[i].contains("Yb")){			System.out.println("There is " +num+ " elements of "+"113"); 
		}
		else if (intArray[i].contains("Zn")){			System.out.println("There is " +num+ " elements of "+"114"); 
		}
		else if (intArray[i].contains("Zr")){			System.out.println("There is " +num+ " elements of "+"115"); 
		}

	}
}

