class Animal{
    public void animalsound(){
        System.out.println("The animals make sound!");
    }
}

class Pig extends Animal{
    public void animalsound(){
        System.out.println("The Pig is mad like dog");
    }
}

class Horse extends Animal{
    public void animalsound(){
        System.out.println("The Horse is the fastest");
    }
}

class Main{
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Pig myPig = new Pig();
        Horse myHorse = new Horse();
        myAnimal.animalsound();
        myPig.animalsound();
        myHorse.animalsound();
    }
}
