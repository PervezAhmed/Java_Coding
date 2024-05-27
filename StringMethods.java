class StringMethods{
    public static void main(String[] args){
        String str = new String("core");
        System.out.println(str.concat("java").substring (4).concat("program").substring(4,8).concat("text").replace('z', 'n').toUpperCase().charAt(2));
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";
        String s4 = "hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
    }
}
