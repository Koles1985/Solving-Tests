/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solving.test.tasks;

/**
 *
 * @author Koles
 */
public class DiningRoom {
    private int numOfDishes = 11;
	private int variablesDishes;
	
	public void calc() {
		//блюдо можно заказать, а можно и не заказать
		//для одного блюда 2 варианта значит для 11 блюд 
		//будет 2 в 11 степени
		variablesDishes = (int)Math.pow(2, numOfDishes);
		
		System.out.println(variablesDishes + 
				" - дней сможет так питаться новый сотрудник");
	}
    
}
