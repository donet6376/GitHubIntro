/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class A3Q7 {
    
    public void insertionSort(String[] s)
    {   
        //loop to run through each position in the array
        for(int i = 1; i < s.length; i++)
        {   
            //loop that runs pairs of strings to find where the comparison returns negative
            for(int j = i; j > 0 && s[j].compareTo(s[j - 1]) < 0; j--)
            {
                String temp = s[j]; //store the second string contents in a temporary string
                s[j] = s[j - 1]; //change the contents of the second string with the first string
                s[j - 1] = temp; //change the contents of the first string with the stored contents
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q7 test = new A3Q7();
        
        //create the array and set the strings
        String[] s = {"Bargan","Zezima","Archie","Ronan","Sparc","Mote","Lezley"};
        
        //sort the array
        test.insertionSort(s);
        
        //check if sorted by outputing strings in array order
        for(int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }
    }
}
