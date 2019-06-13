
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
String findSimpleGene(String dna, String startCodon, String stopCodon){
    int start = dna.indexOf(startCodon);
    int stop = dna.indexOf(stopCodon);
    String res = "";
    
    if(startCodon == "ATG"){
    
    if(start == -1){
        res ="";
    }
    
    if(stop == -1){
        res = "";
    }
    
    if( ((start+3-stop) % 3) == 0 ){
        res = "It's a valid DNA sample " + dna.substring(start, stop+3);
    }
}
    if(startCodon == "atg"){
    
    if(start == -1){
        res ="";
    }
    
    if(stop == -1){
        res = "";
    }
    
    if( ((start+3-stop) % 3) == 0 ){
        res = "It's a valid DNA sample " + dna.substring(start, stop+3);
    }

}
return res; 
}

void testSimpleGene(){
    String dna1 = "ATGAAATTTCCCTAA";
    System.out.println("TESTING " + dna1);
    String gene1 = findSimpleGene(dna1, "ATG", "TAA");
    System.out.println(gene1);
    
    String dna2 = "atgtattcacgctaa";
    System.out.println("TESTING " + dna2);
    String gene2 = findSimpleGene(dna2, "atg", "taa");
    System.out.println(gene2);
    
    
    
}

}
