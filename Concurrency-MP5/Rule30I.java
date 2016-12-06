import java.util.*;
public class Rule30I {
            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long startTime = System.currentTimeMillis();
        String first = "";
        String next = "";
        
        
        for(int i = 0; i < x; i++)
        {
          if(i == x/2)
          first += '1';
          else
          first += '0';
        }  
        System.out.println(first);
        
        char s;
        
        for(int i = 0; i < x - 1 ; i++){
            for(int j = 0; j < x; j++){
                s = DigitDeterm(first, j);
                next += s;
                System.out.print(s);
                
            }
            first = next;
            next = "";
            System.out.println();
        }
        
        System.out.println("time consumed in ms: " + (System.currentTimeMillis() - startTime));
            
        }
        
        public static char DigitDeterm(String first, int x){
        char ans = '0';
        
        if(x == 0){
        if(first.charAt(x) == '1' && first.charAt(x + 1) == '1')
            ans = '1';
        if(first.charAt(x) == '1' &&  first.charAt(x + 1) != '1')
            ans = '1';
        if(first.charAt(x) != '1' && first.charAt(x + 1) == '1')
            ans = '1';  
        }
        
        else if(x == first.length() - 1 ){
        if(first.charAt(x - 1) == '1' && first.charAt(x) != '1')
            ans = '1';
        if(first.charAt(x - 1) != '1' && first.charAt(x) == '1')
            ans = '1';
        }
        
        else{
        if(first.charAt(x - 1) == '1' && first.charAt(x) != '1' && first.charAt(x + 1) != '1')
            ans = '1';
        if(first.charAt(x - 1) != '1' && first.charAt(x) == '1' && first.charAt(x + 1) == '1')
            ans = '1';
        if(first.charAt(x - 1) != '1' && first.charAt(x) == '1' &&  first.charAt(x + 1) != '1')
            ans = '1';
        if(first.charAt(x - 1) != '1' && first.charAt(x) != '1' && first.charAt(x + 1) == '1')
            ans = '1';  
        }
        
        return ans;
    }
        
        
        
        
        
        
    }
    

