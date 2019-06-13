
/**
 * A Java Program that finds correct genes in a gene sequence  
 * 
 * @author Tabish
 * @version (May 20, 2019)
 */
public class Part1 {

String findSimpleGene(String dna){
    int start = dna.indexOf("ATG");
    int stop = dna.indexOf("TAA");
    
    String res = "";
    
    if(start == -1){
        res ="";
    }
    
    if(stop == -1){
        res = "";
    }
    
    if( ((start+3-stop) % 3) == 0 ){
        res = "It's a valid DNA sample " + dna.substring(start, stop+3);
    }
    
    
    System.out.println(res);
    return res; 
}


void testSimpleGene(){
    String dna1 = "ATGAAATTTCCCTAA";
    System.out.println(dna1);
    String gene1 = findSimpleGene(dna1);
    
    String dna2 = "ATGAAATTTCCCTAC";
    System.out.println(dna2);
    String gene2 = findSimpleGene(dna2);
    
    String dna3 = "AAATTTCCCTAA";
    System.out.println(dna3);
    String gene3 = findSimpleGene(dna3);
    
    String dna4 = "AAATTTCCC";
    System.out.println(dna4);
    String gene4 = findSimpleGene(dna4);
    
    String dna5 = "ATGAAATTTCCTAA";
    System.out.println(dna5);
    String gene5 = findSimpleGene(dna5);
}

  
}