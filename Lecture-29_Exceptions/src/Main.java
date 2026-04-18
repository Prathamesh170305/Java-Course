public class Main {
    public static void main(String[] args){
        int[] numerators={10,20,30,40,50};
        int[] denominators={1,2,0,4,5};
        for(int i=0;i<5;i++){
            System.out.println(divide(numerators[i],denominators[i]));
        }
        System.out.println("done");
    }
    public static int divide(int a , int b){
        try{
            return a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
            return -1;
        }
        finally{
            System.out.println("Bye");
        }
    }
}
