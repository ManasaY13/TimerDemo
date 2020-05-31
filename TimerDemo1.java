import java.util.Timer;
import java.util.TimerTask;
import java.util.*;

public class TimerDemo1{
    public static void main(String []args){ 
        TimerDemo1 td=new TimerDemo1();
        
        td.runTimer();

    }
    int i=0;
    Timer timer=new Timer();
    TimerTask task=new TimerTask(){
    
        @Override
        public void run() {
            String time=getTime(i);
            System.out.println(time);
            i++;
        }
    };
    public void runTimer(){
        timer.schedule(task, 0,1000);
    }
    static String getTime(int sec){
        int hr = 0;
        int remHr = 0;
        int mins = 0;
        int secs= 0;
    
        if (sec >= 3600)    
        {
            hr = sec / 3600;               
            remHr = sec % 3600;        
            if (remHr >= 60)  
            {
                mins = remHr / 60;
                secs = remHr % 60;
            }
            else
            {                       
                secs = remHr;
            }
        }
       
        else if (sec >= 60)                
        {
            hr = 0;               
            mins = sec / 60;
            secs = sec % 60;
        }
       
        else if (sec < 60)
        {
            hr = 0;
            mins = 0;
            secs = sec;
        }
    
        
        String shr=" ";
        String smin; 
        String ssecs; 
    
        if(secs < 10)
            ssecs = "0" + Integer.toString(secs);
        else
            ssecs =Integer.toString(secs);
       
        if(mins < 10)
            smin = "0" + Integer.toString(mins);
       else
           smin = Integer.toString(mins);
        
        if(hr< 10)
            shr = "0" + Integer.toString(hr);
          else
              ssecs = Integer.toString(hr);
            
            
        String time = shr + ":" + smin + ":" + ssecs;
        return time;
    }
    
    
    
    }


    






