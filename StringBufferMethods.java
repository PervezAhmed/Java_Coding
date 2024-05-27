/*class StringBufferMethods  {
    public static void main(String[] args)  {
    StringBuffer sb = new StringBuffer("java");
    System.out.println(sb.append("program"));
    System.out.println(sb.insert(0, "core"));
    System.out.println(sb.delete(4,8));
    System.out.println(sb.append("test"));
    System.out.println(sb.replace(4,8 ,"frog"));
    System.out.println(sb.substring (7).concat("example"));
    System.out.println(sb.substring (4).replace ('e', 'n').toUpperCase());
    System.out.println(sb.charAt (8));
    }
}
*/

class StringBufferMethods  {
    public static void main(String[] args)  {
        StringBuffer sb = new StringBuffer("java");
        System.out.println(sb.append("program").insert(0, "core").delete(4,8) .append("test").replace(4,8 ,"frog").substring (7).concat("example") .substring (4).replace ('e', 'n').toUpperCase ().charAt (8));
    }
}
    