
/**
 * Write a description of Part3 here.
 * 
 * @author Tabish 
 * @version 1.1
 */
public class Part3 {

    public boolean twoOccurrences(String stringa, String stringb) { 
    int frst_index = stringb.indexOf(stringa);
    int scnd_index = stringb.indexOf(stringa, frst_index+1); 
    //^^scnd index is the index of string "a" in "b" but the search begins 
    //starting after the frst_index, i.e. the first occurence 
    boolean ans = false; 
    
    if( (frst_index > -1) && (scnd_index > -1) ){
        //i.e. IF the String/char "a" actually exists in string "b" AND 
        //second index also exists THEN 
        ans = true; 
    }
    
    else{
    System.out.println("No double occurence and therefor... \n");
    }
   
    return ans; 
    }
    
    public void twoOccurencesTest(){
    System.out.println("Is 'by' in 'A story by Abby Long'?");
    boolean test1 =  twoOccurrences("by", "A story by Abby Long");
    System.out.println(test1); 
    
    System.out.println("Is 'a' in 'banana'?");
    boolean test2 =  twoOccurrences("a", "banana");
    System.out.println(test2); 
    
    System.out.println("Is 'atg' in 'ctgtatgta'?");
    boolean test3 =  twoOccurrences("atg", "ctgtatgta");
    System.out.println(test3);
    }
}
