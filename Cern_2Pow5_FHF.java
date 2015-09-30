package com.cerner.main;
public class Cern_2Pow5_FHF {
	//prints 'cerner rocks'
	public static void main(String[] args) {
		/*5 bit codification
		Reference: http://stackoverflow.com/questions/20720098/how-does-this-print-hello-world
		 */		
		for (long l = 697054740497254563l; l > 0; l >>= 5)
		    System.out.print((char) (((l & 31 | 64) % 95) + 32));
		
	}

}
