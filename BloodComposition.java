import java.util.*;


public class BloodComposition {
    public static boolean isSubSequence(String s, String t) {
        char []str1= t.toCharArray();
        char []str2= s.toCharArray();
        int m=t.length();
        int n=s.length();
        int i=0,j=0;
        while(j<m && i<n){
            if(str1[j]==str2[i]){
                j++;
            }
            i++;
        }
        return j==m;
    }
    public static void main(String args[] ) throws Exception {

        //Write code here
        Scanner sc= new Scanner(System.in);
        String virus= sc.nextLine();
        int noOfPeople=sc.nextInt();
        List<String> bloodComposition= new ArrayList<>();
        for (int i=0;i<noOfPeople;i++){
            bloodComposition.add(sc.next());
        }

        for (String s:bloodComposition){

            boolean res=isSubSequence(virus,s);
            if(res)
                System.out.println("POSITIVE");
            else
                System.out.println("NEGATIVE");
        }
         sc.close();
    }

}
