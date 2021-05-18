import java.io.*;
import java.util.*;
public class SmartCity {
    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }

    public static void main(String args[] ) throws Exception {

        //Write code here
        Scanner sc = new Scanner(System.in);
        String inp=sc.nextLine();
        String input[]=inp.split("[ ]+");
        int inp1= Integer.parseInt(reverseString(input[0]));
        int inp2= Integer.parseInt(reverseString(input[1]));
        System.out.println(inp1>inp2?inp1:inp2);
        sc.close();

    }
}
