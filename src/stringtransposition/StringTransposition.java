
package stringtransposition;
import java.util.Scanner;

/**
 *
 * @author todyerutz @plainintricacy.wordpress.com
 */
public class StringTransposition {

   
    
    public static void main(String[] args) {

        byte bigN;
        int size = 0;
        Scanner in = new Scanner(System.in);
        do{
        System.out.println("Please enter the number of strings:");
        bigN = Byte.parseByte(in.nextLine());
        }while(bigN<0||bigN>16);
        
        String transp[] = new String[bigN];
        for(int i=0; i<bigN; i++){
            int j = i+1;
            System.out.println("Please enter string #" + j +":");
            transp[i] = in.nextLine();
            if(transp[i].length() > size){
                size = transp[i].length();
            }
        }
        
        
        for(int i=0; i<size; i++){
            String output = new String();
            for(int p=0; p<bigN; p++){
                if(transp[p].length()>i){
                    output += transp[p].charAt(i);
                }
                else{
                    output += " ";
                }
            }
            System.out.println(output);
        }
    }
    
}
