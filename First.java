/**
 * Created by NARENDRA on 16-09-2016.
 */
import java.util.Scanner;
public class First {
    public static void main(String[] args)
    {
        int n,t,count0,count1,p=0;
        int[] a=new int[100000];
        int[] r=new int[50];
        System.out.println("enter the number of test cases");
        Scanner in=new Scanner(System.in);
                n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            t=a[i];
            count0=0;
            count1=0;
            p=0;
                    for(int j=0;t!=0;j++)
                    {
                        p++;
                        r[j]=t%10;
                        t=t/10;
                    }
            for(int k=0;k<p;k++) {
                if (r[k] == 1)
                    count1++;
                else if (r[k]==0)
                    count0++;
            }
            if((count0==1)||(count1==1))
                System.out.println("yes");
            else
                System.out.println("no");


            }
        }

    }

