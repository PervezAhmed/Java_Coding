
public class StringClass {
    public static void main(String args[]){
        String s1="Hai";
        String s2="Bye";
        String s3="hai";
        System.out.println(s1.compareToIgnoreCase(s3));
        System.out.println(s1.concat(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.endsWith("i"));
    }
}
