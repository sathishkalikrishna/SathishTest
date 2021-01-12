package org.example;

/**
 * Hello world!
 */
public class App {

    private static int var= 0;
    private int instanceVar = 10;

    public static void main(String[] args) {
        App appObject= new App();
        appObject.instanceVar = 100;
        appObject.x();
        appObject.displayInstanceVariableValueByValue(appObject.instanceVar);
        appObject.displayInstanceVariableByReference(appObject);
        display();
        Manager mg = new Manager();
        appObject.createManager(mg);
    }

    static void display(){
       System.out.println("This is a dummy message");
    }

    void x(){

    }

    void displayInstanceVariableValueByValue(int x){
        System.out.println("X value is" + x);
    }

    void displayInstanceVariableByReference(App appObject){
        System.out.println(appObject.instanceVar);
    }

    void createManager(Manager manager){

    }


}
