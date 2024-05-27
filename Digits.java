public class Digits
{
    public static void main(String[] args) {
        int num=123;
        String st = Integer.toString(num);
        int intarr[] = new int[st.length()];
        for(int i=0;i<st.length();i++)
        {
            intarr[i] = st.charAt(i)-'0';
        }

        for(int i=0;i<intarr.length;i++)
        {
            System.out.println(intarr[i]);
        }
    }
}