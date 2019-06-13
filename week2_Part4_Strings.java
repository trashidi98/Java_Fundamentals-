
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part4 {

    
    public String lastPart(String stringa, String stringb){
    int startOfAindx = stringb.indexOf(stringa); //returns index of where 
    //string a is in string b 
    
    String last = "";
    
    if(startOfAindx > -1){
    
    int lengthOfA = stringa.length(); //returns length of String a
    
    
    
    int indxAfterA = startOfAindx + lengthOfA; //returns index right 
    //one letter after a 
    
   
    
    last = stringb.substring(indxAfterA);
    // if you feed .substring(int onevar), the method returns the whole string 
    //after "onevar" index 
    }
    
    else {
    last = stringb;  
    }
    return last; 
    }

    public void testLastPart(){
    System.out.println("TEST 1 an in banana"); 
    String test1 = lastPart("an", "banana");
    System.out.println(test1); 
    
    System.out.println("TEST 2 zoo in forest");
    String test2 = lastPart("zoo", "forest"); 
    System.out.println(test2); 
    
    
    
    
    }

}
