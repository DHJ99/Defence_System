
package Model;

import Controller.Observable;
import Views.MainPage;
import Views.Helicopter; 
import Views.Submarine;
import Views.Tank;

public class Defence {

    public static void main(String[] args) {
        Observable observable=new Observable();
        
        MainPage main=new MainPage(observable);
        
        observable.add(new Tank(main ,observable));
        observable.add(new Helicopter(main, observable));
        observable.add(new Submarine(main, observable));
        
        main.setVisible(true);
            
    }
}
