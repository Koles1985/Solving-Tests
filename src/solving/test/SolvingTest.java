/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solving.test;

import solving.test.tasks.ChickensAndTurkeys;
import solving.test.tasks.DiningRoom;
import solving.test.tasks.InTrend;
import solving.test.tasks.KindersForChildrens;
import solving.test.tasks.Palindromes;
/**
 *
 * @author Koles
 */
public class SolvingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO Auto-generated method stub
		InTrend inTrend = new InTrend();
		System.out.println("Количество чисел в тренде = " 
				 + inTrend.getNumberInTrend() + ".");
		
		System.out.println("");
		
		ChickensAndTurkeys chAndT = new ChickensAndTurkeys();
		chAndT.calc();
		
		System.out.println("");
		
		KindersForChildrens kfc = new KindersForChildrens();
		kfc.calc();
		
		System.out.println("");
		
		DiningRoom dr = new DiningRoom();
		dr.calc();
		
		System.out.println("");
		
		Palindromes pal = new Palindromes();
		pal.calc();
    }
    
}
