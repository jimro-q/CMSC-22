package rule30ii;


import java.util.*;
public class Rule30II {    
    public static int THREAD_COUNT = 10;
    public static int charsPerThread;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long startTime = System.currentTimeMillis();
        String first = "";
        String next = "";
        int min = 0, max;
        
        
        
        
        for(int i = 0; i < x; i++)
        {
          if(i == x/2)
          first += '1';
          else
          first += '0';
        }  
        System.out.println(first);
        
        if(x < THREAD_COUNT){
            THREAD_COUNT = x;
        }
        
        DigitDeterminator[] workers = new DigitDeterminator[THREAD_COUNT];
        charsPerThread = x / THREAD_COUNT;
        max = charsPerThread - 1;
        
        for(int i = 0; i < x - 1; i++){
            
            for(int j = 0; j < THREAD_COUNT; j++){
                if(j == THREAD_COUNT - 1){
                    max = x - 1;
                }       
                workers[j] = new DigitDeterminator(min, max, first);
                min = max + 1;
                max = min + charsPerThread - 1;
            }
            
            for(int j = 0; j < THREAD_COUNT; j++){
                workers[j].run();
            }
            
           for (int j = 0; j < THREAD_COUNT; j++) {
            while (workers[j].isAlive()) {
                try {
                    workers[j].join();
                } catch (InterruptedException e) {
                    System.err.println("thread interrupted: " + e.getMessage());
                }
            }
        }
           
           
            
            for(int j = 0; j < THREAD_COUNT; j++){
                next += workers[j].getAns();
            }
            
            System.out.println(next);
            
            first = next;
            next = "";
            
            min = 0;
            max = charsPerThread - 1;
            
        }
        
       
        
        
        
        
        
        
        
        
        System.out.println("time consumed in ms: " + (System.currentTimeMillis() - startTime));
        
    }
    
}
    

