
package Controller;

import java.util.*;

public class Observable {
    

    private ArrayList <Observer> list=new ArrayList<>();

    public void add(Observer ob) {
        list.add(ob);
    }   

    public void updateBtn(int value) {
        list.forEach((t)->{
            t.warStrength(value);
        });
    }
    
    public void sendMsg(String msg){
       list.forEach(data->{
           data.updateMsg(msg);
           
       });
    }

    public void selectedCheckBox(boolean value) {
         list.forEach(data->{
           data.areaMsg(value);
           
       });
    }    

    public void sendPvtMsg(String msgPvt) {
    list.forEach(data->{
           data.updatePvtMsg(msgPvt);
           
       });
    }

    
    
}
