import java.util.*;


public class PrimeGame {
    public static boolean isPrime(Integer num){
        //simple program to check number is prime
        int flag=0;
        if(num==0||num==1){
            return false;
        }else{
            for(int i=2;i<=(num/2);i++)
                if(num%i==0){
                    flag=1;
                    break;
                }
            return flag == 0;
        }
    }
    public static int output(Integer l,Integer r){
        //if both prime
        if(isPrime(l)&& isPrime(r)){
            //both prime and equal return 0
            if(l.equals(r))
                return 0;
            //just to return positive
            else if(l>r)
                return l-r;
            else
                return r-l;
        }else  if(isPrime(l)||isPrime(r)){
            //if only 1 prime
            return 0;
        }else{
            //if both are not prime
            return -1;
        }

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        //input no of test cases
        int inp1= sc.nextInt();
        String rangeInp="";
        Scanner sc1 = new Scanner(System.in);
        // input ranges taken in hashmap<k,v>=<L,R>
        HashMap<Integer,Integer> range=new HashMap<Integer,Integer>();
        //loop for taking input range
        for (int i=0;i<inp1;i++){
            rangeInp=sc1.nextLine();
            String[] temp =rangeInp.split("[ ]+");
            range.put(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
        }
        //flag to check if previous input was -1
        int result,flag=0;
        for(Integer key:range.keySet()){
            //if previous input -1 then l+1, r-1
            if (flag==1){
                result=output(key+1,range.get(key)-1);
                flag=0;    //flag reset
            }
            else
                result=output(key,range.get(key));
            System.out.println(result);
            //if result -1 raise flag for next process
            if (result == -1)
                flag=1;
        }
        sc.close();
        sc1.close();
    }
}
