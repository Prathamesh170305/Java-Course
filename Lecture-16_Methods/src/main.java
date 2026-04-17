public class main {
//    accessModifier returnType methodName(parameters){
//        //method body
//    }

    public static void main(String[] args){
        int[] a={3,3,3,3};
        sumOfArray(a);
    }
    public static void sumOfArray(int[] arr){
        int res=0;
        for(int i:arr){
            res+=i;
        }
        System.out.println((res));
    }
}
