package app.overriding_demo;

public class App {
    public static void main(String[] args) {
        FirstCls thirdCls = new FirstCls();
        thirdCls.run();        
    }
}

class FirstCls {
    public void run() {
        System.out.println("Run from First Class");
    }
}

class SecondCls extends FirstCls {
    @Override
    public void run() {
        System.out.println("Run from Second Class");
    }
}

class ThirdCls extends SecondCls {
    @Override
    public void run() {
        System.out.println("Run from Third Class");
    }    
}