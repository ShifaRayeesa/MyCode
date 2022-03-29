public class Frown {
    public static void main(String[] args)
    {
        int i,j,curve=3,n=11;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if((i==0 || i==n-1) && j>=curve && j<(n-curve) || (i+j==curve) || (j-i==(n-1-curve)))
                {
                    System.out.print(" * ");
                }
               else if((i==0 || j==0 || j==10) && i>=curve && i<(n-curve) || (i+j==2*curve+n)  || (i-j==(n-1-curve)))
                {
                    System.out.print(" * ");
                }
               else if(i==3 && (j==i || j==2*i+1) )
                {
                    System.out.print("<@>");
                }
               else if(i==j && n/2==i)
                {
                    System.out.print(" /\\");
                }
               else if(i==7 && j>3 && j<(n-1-3))
                {
                    if(j==5)
                        System.out.print(" - ");
                    else
                        System.out.print(" _ ");
                }
               else if(i==8 && (j==3 || j==7))
                {
                    if(j==3)
                        System.out.print(" ~ ");
                    else if(j==7)
                        System.out.print(" ~ ");
                }
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
