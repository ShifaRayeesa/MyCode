public class Smiley {
    public static void main(String[] args)
    {
        int i,j,n=5;
        System.out.println();
        System.out.println();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 && (j==i+1 || j==n-2))
                {
                    System.out.print("-$-");
                }
                else if(i==j && i==(n/2))
                {
                    System.out.print(" ^");
                }
                else if(i==n-2)
                {
                    if(j==0)
                        System.out.print(" : ");
                    else if(j==n-1)
                        System.out.print(": ");
                    else
                        System.out.print("  ");
                }
                else if(i==n-1)
                {
                    if(j>0 && j<n-1)
                    System.out.print("~");
                    else if(j==0)
                    System.out.print("  ' ");
                    else System.out.print(" '");
                }
                else
                {
                        System.out.print("  ");
                }
                }
            System.out.println();
            }

        }
    }

