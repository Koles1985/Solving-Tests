/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solving.test.tasks;

/**
 *
 * @author Koles
 */
public class KindersForChildrens {
    private int childrens = 5;
	private int kinders = 36;
	private int boy;
	private int girl;
	private int differenceOfKinders = 3;
	
	public void calc() {
		int girlKinders = kinders / 2;
		int boyKinders = girlKinders;
	
		for(int i = 1; i < childrens; i++) {
			int kinderForOneGirl = girlKinders / i;
			int kinderForOneBoy = boyKinders / (childrens - i);
			if((kinderForOneBoy - kinderForOneGirl) == differenceOfKinders) {
				girl = i;
				boy = childrens - girl;
			}
		}
		System.out.println("Девочек = " + girl);
		System.out.println("Мальчиков = " + boy);
	}
}
