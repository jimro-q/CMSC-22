
package rule30ii;

public class DigitDeterminator extends Thread{
    
    private static String first;
    private int min;
    private int max;
    private String ans = "";
    
    public DigitDeterminator(int min, int max, String first) {
        if (min > max || min < 0 || max < 0) {
            throw new IllegalArgumentException("Bad arguments");
        }
        this.min = min;
        this.max = max;
        this.first = first;
    }

    @Override
    public void run() {
        for(int i = min; i <= max; i++){
            ans += DigitDeterm(i);
        }
    }
    
    public static char DigitDeterm(int x){
        char ans = '0';
        
        if(x == 0){
        if(first.charAt(x + 1) == '1' && first.charAt(x) == '1')
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
    
    public String getAns(){
        return ans;
    }
    
}
