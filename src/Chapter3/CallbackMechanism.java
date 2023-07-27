package Chapter3;

import java.awt.*;
import java.beans.EventHandler;

public class CallbackMechanism {
    public static void main(String[] args) {

//        Button button = new Button(new ButtonClickHandler());
//        button.click();
//        button.click();
//        button.click();
//    }
//}
//
//class ButtonClickHandler implements EventHandler{
//
//    public void execute(){
//
//        System.out.println("Кнопка нажата!");
//    }
//}
//
//interface EventHandler{
//
//    void execute();
//}
//
//class Button{
//
//    EventHandler handler;
//    Button(EventHandler action){
//
//        this.handler=action;
//    }
//    public void click(){
//
//        handler.execute();
//    }
//}

        Button tvButton = new Button(new EventHandler(){

            private boolean on = false;
            public void execute(){

                if(on) {
                    System.out.println("Телевизор выключен..");
                    on=false;
                }
                else {
                    System.out.println("Телевизор включен!");
                    on=true;
                }
            }
        });

        Button printButton = new Button(new EventHandler(){

            public void execute(){

                System.out.println("Запущена печать на принтере...");
            }
        });

        tvButton.click();
        printButton.click();
        tvButton.click();
    }
}