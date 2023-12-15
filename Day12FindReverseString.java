/* I/P: Prasad Dhame
 * O/P: emahD DasarP
 * 
 */
package main1;

public class Day12FindReverseString {
	public static void main(String[] args) {
		
		String ab="Prasad Dhame";
		
		StringBuilder PD = new StringBuilder();
		
		PD.append(ab);
		PD.reverse();
		
		System.out.println(PD);
		
		/*---------------------------------------------*/
		
		char[] chararr=ab.toCharArray();
		for(int i=chararr.length-1;i>0;i--) {
			System.out.println(chararr[i]);
		}
		
	}
	

}
