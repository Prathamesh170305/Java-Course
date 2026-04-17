public class Main {
    public static void main(String[] args){
        //declaration
//        int[] arr={1,2,3};
//        int[] arr2=new int[10];
//        for(int i=0;i<arr2.length;i++){
//            System.out.println(arr2[i]);
//        }
//        for(int i:arr){
//            System.out.println(i);
//        }

        //2-d array
        int[][] arr=new int[3][3];
        int[][] nums={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.println(nums[i][j]);
            }
        }
    }
}
