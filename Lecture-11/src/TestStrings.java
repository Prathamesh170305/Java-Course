public class TestStrings {
    public static void main(String[] args){
        String name="ASAkshita";
        int len=name.length();
        char c=name.charAt(len-1);
        System.out.println((c));
        String name2="ASAkshitaa";
        System.out.println(name.equals((name2)));

        int i=name2.compareTo(name);
        System.out.println((i));

        String sud="Amar Panchal";
        String substr=sud.substring(5,8);
        System.out.println(substr);
    }
}
