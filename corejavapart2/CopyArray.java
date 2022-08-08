package corejavapart2;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = {12,15, 17}; 
		 
        // define an array copyArray to copy contents of intArray
        int copyArray[] = new int[intArray.length]; 
 
        // copy contents of intArray to copyArray
        for (int i=0; i<intArray.length; i++) 
           copyArray[i] = intArray[i]; 
 
        // update element of copyArray 
        copyArray[1]++; 
 
        //print both arrays
        System.out.println("intArray[] elements:"); 
        for (int i=0; i<intArray.length; i++) 
            System.out.print(intArray[i] + " "); 
 
        System.out.println("\n\ncopyArray[] elements:"); 
        for (int i=0; i<copyArray.length; i++) 
        	System.out.print(copyArray[i] + " ");
         

	}

}
