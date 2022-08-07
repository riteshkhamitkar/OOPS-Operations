interface Animal{
    public void sound();
    public void run();
}

class Pig implements Animal{
    
    public void sound(){
        System.out.println("My voice is great!");
    }
    
    public void run(){
        System.out.println("My speed is 100kmph");
    }
    
}

class Main{
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.sound();
        myPig.run();
    }
}

// Uses word implements to acheive abstraction
