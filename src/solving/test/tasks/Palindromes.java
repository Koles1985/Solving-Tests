/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solving.test.tasks;

/**
 *
 * @author Koles
 */
public class Palindromes {
    public void calc() {
		String before;
		StringBuilder sb;
		String after;
		int count = 0;
		for(int i = 10000; i < 100000; i++) {
			before = Integer.toString(i);
			sb = new StringBuilder(before);
			after = sb.reverse().toString();
			if(before.equals(after))
				count++;
		}
		System.out.println(count + " палиндромов пятизначного числа");
	}

}
