import edu.duke.*;  


/**
 * Write a description of Part5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part5 {
    
public String findYoutubeLink() { 
    int count = 0; 
    int index; 
    int frst_index;
    int scnd_index;
    String url = ""; 
    URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html"); 
    for(String s : ur.words()) {
        index = s.toLowerCase().indexOf("youtube.com");
        if(index > -1) {
                count++;
                frst_index = s.indexOf("\"");
                scnd_index = s.lastIndexOf("\"");
                System.out.println("Link " + count + " " + s.substring(frst_index+1, scnd_index));
        }
              
    
    }
    return "";
}
    
public void findYoutLinkTest(){
findYoutubeLink(); 
}

}