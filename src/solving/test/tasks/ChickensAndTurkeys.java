/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solving.test.tasks;

/**
 *
 * @author Koles
 */
public class ChickensAndTurkeys {
    int chickens = 0;
	int[] numOfChickens = new int[3];
	public void calc() {
		for(int i = 1; i < 10; i++) {
			int x = (int)Math.pow(i, 2);
			if((x % 10) == i) {
				numOfChickens[chickens] = i;
				chickens++;
				
			}				
		}
		System.out.println("Количество курочек = " + chickens + ".");
		for(int i = 0; i < numOfChickens.length; i++) {
			System.out.println("Номер " + (i + 1) + " курочки = " + 
							numOfChickens[i]);
		}
	}
    
}
