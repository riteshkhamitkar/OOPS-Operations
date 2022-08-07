class Main{
static int plus(int x, int y){
    return x+y;
}

static double plus(double x, double y){
    return x+y;
}

public static void main(String[] args){
     
    int fat =  plus(2,3);
    double mad =  plus(2.5,6.7);
    System.out.println("Int:" + fat);
    System.out.println("Double:" + mad);
}
}
