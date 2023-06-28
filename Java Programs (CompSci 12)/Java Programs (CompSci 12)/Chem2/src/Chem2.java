import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class Chem2 {

	public static void main(String args[]) {
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
		for (int i=0;i<4;i++) {
			System.out.println(intArray[i]);
		}
		NUM=intArray[0];
		for (int i=0; i<4;i++) {
			if (NUM.contains("(")) {
				InsideBrack=NUM.split("\\(");
			}}
		System.out.println("("+InsideBrack[1]);
		sender(0, intArray);
	}
	public static void sender(int i,String []intArray) {
				for (i=0; i<4;i++) {
					if (intArray[i].contains("1)")) {
						LowerCase(intArray, i);
					}	if (intArray[i].contains("2)")) { 
						LowerCase(intArray, i);
					}	if (intArray[i].contains("3)")) {
						LowerCase(intArray, i);
					}	if (intArray[i].contains("4)")) {
						LowerCase(intArray, i);
					}	if (intArray[i].contains("5)")) {
						LowerCase(intArray, i);
					}	if (intArray[i].contains("6)")) {
						LowerCase(intArray, i);
					}	if (intArray[i].contains("7)")) {
						LowerCase(intArray, i);
					}	if (intArray[i].contains("8)")) {
						LowerCase(intArray, i);
					}	if (intArray[i].contains("9)")) {
						LowerCase(intArray, i);
					}}
	}
	public static void LowerCase(String intArray[],int i) {
		System.out.println();
		if (intArray[i].contains("Ac")){			System.out.println("1"); 
		}
		else if (intArray[i].contains("Al")){			System.out.println("2"); 
		}
		else if (intArray[i].contains("Am")){			System.out.println("3"); 
		}
		else if (intArray[i].contains("Ar")){			System.out.println("4"); 
		}
		else if (intArray[i].contains("As")){			System.out.println("5"); 
		}
		else if (intArray[i].contains("At")){			System.out.println("6"); 
		}
		else if (intArray[i].contains("Au")){			System.out.println("7"); 
		}
		else if (intArray[i].contains("B")){			System.out.println("8"); 
		}
		else if (intArray[i].contains("Ba")){			System.out.println("9"); 
		}
		else if (intArray[i].contains("Be")){			System.out.println("10"); 
		}
		else if (intArray[i].contains("Bh")){			System.out.println("11"); 
		}
		else if (intArray[i].contains("Bi")){			System.out.println("12"); 
		}
		else if (intArray[i].contains("Bk")){			System.out.println("13"); 
		}
		else if (intArray[i].contains("Br")){			System.out.println("14"); 
		}
		else if (intArray[i].contains("C")){			System.out.println("15"); 
		}
		else if (intArray[i].contains("Ca")){			System.out.println("16"); 
		}
		else if (intArray[i].contains("Cd")){			System.out.println("17"); 
		}
		else if (intArray[i].contains("Ce")){			System.out.println("18"); 
		}
		else if (intArray[i].contains("Cf")){			System.out.println("19"); 
		}
		else if (intArray[i].contains("Cl")){			System.out.println("20"); 
		}
		else if (intArray[i].contains("Cm")){			System.out.println("21"); 
		}
		else if (intArray[i].contains("Cn")){			System.out.println("22"); 
		}
		else if (intArray[i].contains("Co")){			System.out.println("23"); 
		}
		else if (intArray[i].contains("Cr")){			System.out.println("24"); 
		}
		else if (intArray[i].contains("Cs")){			System.out.println("25"); 
		}
		else if (intArray[i].contains("Cu")){			System.out.println("26"); 
		}
		else if (intArray[i].contains("Dd")){			System.out.println("27"); 
		}
		else if (intArray[i].contains("Ds")){			System.out.println("28"); 
		}
		else if (intArray[i].contains("Dy")){			System.out.println("29"); 
		}
		else if (intArray[i].contains("Er")){			System.out.println("30"); 
		}
		else if (intArray[i].contains("Es")){			System.out.println("31"); 
		}
		else if (intArray[i].contains("Eu")){			System.out.println("32"); 
		}
		else if (intArray[i].contains("F")){			System.out.println("33"); 
		}
		else if (intArray[i].contains("Fe")){			System.out.println("34"); 
		}
		else if (intArray[i].contains("Fl")){			System.out.println("35"); 
		}
		else if (intArray[i].contains("Fm")){			System.out.println("36"); 
		}
		else if (intArray[i].contains("Fr")){			System.out.println("37"); 
		}
		else if (intArray[i].contains("Ga")){			System.out.println("38"); 
		}
		else if (intArray[i].contains("Gd")){			System.out.println("39"); 
		}
		else if (intArray[i].contains("Ge")){			System.out.println("40"); 
		}
		else if (intArray[i].contains("H")){			System.out.println("41"); 
		}
		else if (intArray[i].contains("He")){			System.out.println("42"); 
		}
		else if (intArray[i].contains("Hf")){			System.out.println("43"); 
		}
		else if (intArray[i].contains("Hg")){			System.out.println("44"); 
		}
		else if (intArray[i].contains("Ho")){			System.out.println("45"); 
		}
		else if (intArray[i].contains("Hs")){			System.out.println("46"); 
		}
		else if (intArray[i].contains("I")){			System.out.println("47"); 
		}
		else if (intArray[i].contains("In")){			System.out.println("48"); 
		}
		else if (intArray[i].contains("Ir")){			System.out.println("49"); 
		}
		else if (intArray[i].contains("K")){			System.out.println("50"); 
		}
		else if (intArray[i].contains("Kr")){			System.out.println("51"); 
		}
		else if (intArray[i].contains("La")){			System.out.println("52"); 
		}
		else if (intArray[i].contains("Li")){			System.out.println("53"); 
		}
		else if (intArray[i].contains("Lr")){			System.out.println("54"); 
		}
		else if (intArray[i].contains("Lu")){			System.out.println("55"); 
		}
		else if (intArray[i].contains("Lv")){			System.out.println("56"); 
		}
		else if (intArray[i].contains("Md")){			System.out.println("57"); 
		}
		else if (intArray[i].contains("Mg")){			System.out.println("58"); 
		}
		else if (intArray[i].contains("Mn")){			System.out.println("59"); 
		}
		else if (intArray[i].contains("Mo")){			System.out.println("60"); 
		}
		else if (intArray[i].contains("Mt")){			System.out.println("61"); 
		}
		else if (intArray[i].contains("N")){			System.out.println("62"); 
		}
		else if (intArray[i].contains("Na")){			System.out.println("63"); 
		}
		else if (intArray[i].contains("Nb")){			System.out.println("64"); 
		}
		else if (intArray[i].contains("Ne")){			System.out.println("65"); 
		}
		else if (intArray[i].contains("Ni")){			System.out.println("66"); 
		}
		else if (intArray[i].contains("No")){			System.out.println("67"); 
		}
		else if (intArray[i].contains("Np")){			System.out.println("68"); 
		}
		else if (intArray[i].contains("O")){			System.out.println("69"); 
		}
		else if (intArray[i].contains("Os")){			System.out.println("70"); 
		}
		else if (intArray[i].contains("P")){			System.out.println("71"); 
		}
		else if (intArray[i].contains("Pa")){			System.out.println("72"); 
		}
		else if (intArray[i].contains("Pb")){			System.out.println("73"); 
		}
		else if (intArray[i].contains("Pd")){			System.out.println("74"); 
		}
		else if (intArray[i].contains("Pm")){			System.out.println("75"); 
		}
		else if (intArray[i].contains("Po")){			System.out.println("76"); 
		}
		else if (intArray[i].contains("Pr")){			System.out.println("77"); 
		}
		else if (intArray[i].contains("Pt")){			System.out.println("78"); 
		}
		else if (intArray[i].contains("Pu")){			System.out.println("79"); 
		}
		else if (intArray[i].contains("Ra")){			System.out.println("80"); 
		}
		else if (intArray[i].contains("Rb")){			System.out.println("81"); 
		}
		else if (intArray[i].contains("Re")){			System.out.println("82"); 
		}
		else if (intArray[i].contains("Rf")){			System.out.println("83"); 
		}
		else if (intArray[i].contains("Rg")){			System.out.println("84"); 
		}
		else if (intArray[i].contains("Rh")){			System.out.println("85"); 
		}
		else if (intArray[i].contains("Rn")){			System.out.println("86"); 
		}
		else if (intArray[i].contains("Ru")){			System.out.println("87"); 
		}
		else if (intArray[i].contains("S")){			System.out.println("88"); 
		}
		else if (intArray[i].contains("Sb")){			System.out.println("89"); 
		}
		else if (intArray[i].contains("Sc")){			System.out.println("90"); 
		}
		else if (intArray[i].contains("Se")){			System.out.println("91"); 
		}
		else if (intArray[i].contains("Sg")){			System.out.println("92"); 
		}
		else if (intArray[i].contains("Si")){			System.out.println("93"); 
		}
		else if (intArray[i].contains("Sm")){			System.out.println("94"); 
		}
		else if (intArray[i].contains("Sn")){			System.out.println("95"); 
		}
		else if (intArray[i].contains("Ta")){			System.out.println("96"); 
		}
		else if (intArray[i].contains("Tb")){			System.out.println("97"); 
		}
		else if (intArray[i].contains("Tc")){			System.out.println("98"); 
		}
		else if (intArray[i].contains("Te")){			System.out.println("99"); 
		}
		else if (intArray[i].contains("Th")){			System.out.println("100"); 
		}
		else if (intArray[i].contains("Ti")){			System.out.println("101"); 
		}
		else if (intArray[i].contains("Tl")){			System.out.println("102"); 
		}
		else if (intArray[i].contains("Tm")){			System.out.println("103"); 
		}
		else if (intArray[i].contains("U")){			System.out.println("104"); 
		}
		else if (intArray[i].contains("Uuo")){			System.out.println("105"); 
		}
		else if (intArray[i].contains("Uup")){			System.out.println("106"); 
		}
		else if (intArray[i].contains("Uus")){			System.out.println("107"); 
		}
		else if (intArray[i].contains("Uut")){			System.out.println("108"); 
		}
		else if (intArray[i].contains("V")){			System.out.println("109"); 
		}
		else if (intArray[i].contains("W")){			System.out.println("110"); 
		}
		else if (intArray[i].contains("Xe")){			System.out.println("111"); 
		}
		else if (intArray[i].contains("Y")){			System.out.println("112"); 
		}
		else if (intArray[i].contains("Yb")){			System.out.println("113"); 
		}
		else if (intArray[i].contains("Zn")){			System.out.println("114"); 
		}
		else if (intArray[i].contains("Zr")){			System.out.println("115"); 
		}

	}
}

