public class Bitwise {
    public static void main(String[] args){
        int a=5;
        System.out.println(Integer.toBinaryString(a));
        int c=~a;
        System.out.println(c);;
        // >> right shift , << left shift 
        System.out.println((Integer.toBinaryString(c)));
    }
}
