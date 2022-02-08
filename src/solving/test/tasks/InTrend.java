/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solving.test.tasks;

/**
 *
 * @author Koles
 */
public class InTrend {
	public int getNumberInTrend() {
		int count = 0;
		
		for(int units = 0; units < 10; units++) {
			if((units % 2) != 0)
				count++;
		}
		
		return (int)Math.pow(count, 4);
	}
}
