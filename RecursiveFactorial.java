class  RecursiveFactorial  {
    public static void main(String[] args)  {
        RecursiveFactorial f = new RecursiveFactorial();
        for(int i=1;i<=10;i++)  {
            int res = f.fact(i);
            System.out.println(i+" ! = "+res);
        }
    }
    int fact(int n)  {
        if(n==1)
            return 1;
        return (n * fact(n-1));
    }
}
