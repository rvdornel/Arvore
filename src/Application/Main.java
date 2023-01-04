/**
 * 
 */
package Application;

import java.util.Random;

import Tree.Tree;

/**
 * @author Home
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree arv = new Tree();
		Random rand = new Random();
		for (int i=0;i<10;i++)
			arv.insere(rand.nextInt(10));
		arv.posordem();
	}

}
