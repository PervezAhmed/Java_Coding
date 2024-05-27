import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.*;
public class TwoVariable {
    public static void main(String[] args) {
        LinkedHashSet<String> h=new LinkedHashSet<>();
        System.out.println("enter your string:");
        Scanner sc=new Scanner(System.in);
        String[] a=sc.nextLine().split("\\s");
        for(String s:a){
            h.add(s);
        }
        System.out.println(h);
        sc.close();
        Iterator<String> i=h.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
    }
}

       
