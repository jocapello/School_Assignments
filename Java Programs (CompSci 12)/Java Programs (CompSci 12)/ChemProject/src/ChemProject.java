import java.util.Scanner;

public class ChemProject
{	
	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);

		String[] Equations={"Ba3N2 + H2O → Ba(OH)2 + NH3",
				"3 CaCl2 + 2 Na3PO4 → Ca3(PO4)2 + 6 NaCl",
				"4 FeS + 7 O2 → 2 Fe2O3 + 4 SO2",
				"PCl5 + 4 H2O → H3PO4 + 5 HCl",
				"2 As + 6 NaOH → 2 Na3AsO3 + 3 H2",
				"3 Hg(OH)2 + 2 H3PO4 → Hg3(PO4)2 + 6 H2O",
				"12 HClO4 + P4O10 → 4 H3PO4 + 6 Cl2O7",
				"8 CO + 17 H2 → C8H18 + 8 H2O",
				"10 KClO3 + 3 P4 → 3 P4O10 + 10 KCl",
				"SnO2 + 2 H2 → Sn + 2 H2O",
				"3 KOH + H3PO4 → K3PO4 + 3 H2O",
				"2 KNO3 + H2CO3 → K2CO3 + 2 HNO3",
				"Na3PO4 + 3 HCl → 3 NaCl + H3PO4",
				"TiCl4 + 2 H2O → TiO2 + 4 HCl",
				"C2H6O + 3 O2 → 2 CO2 + 3 H2O",
				"2 Fe + 6 HC2H3O2 → 2 Fe(C2H3O2)3 + 3 H2",
				"4 NH3 + 5 O2 → 4 NO + 6 H2O",
				"B2Br6 + 6 HNO3 → 2 B(NO3)3 + 6 HBr"};
		String[]Answers= {"1 6 3 2"};
		String num = input.nextLine();
		System.out.println(Equations[0]);
		if (num==Answers[0]) {
			System.out.println("nice");
		}
		else {
			System.out.println("you suck");
		}
	}}