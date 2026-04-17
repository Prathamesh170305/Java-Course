public class Main {
    public static void main(String[]args){
        int a=1;
        boolean isPassed=true;
        char c='a';
        String name="Vipul"; //seq of chars
        System.out.println(name);

        Student stud=new Student();
        stud.name="Prthamesh";
        System.out.println(stud.name);
        Student aaa=new Student();
        aaa.name="Prathamesh";
        System.out.println(aaa.name==stud.name);
        String g="gg";
        String e="gg";
        System.out.println(g==e);
        String m=new String("Ram");
        String n=new String("Ram");

        System.out.println(m==n);
    }
}
