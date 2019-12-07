给定两个数字（0-9）字符串（长度不限）求它们的乘积。
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(func(s1,s2));
    }
    
    private static String func(String s1,String s2){
        if(s1.equals("")){
            return s2;
        }if(s2.equals("")){
            return s1;
        }
        
        int[] arr=new int[s1.length()+s2.length()];
        for(int i=s1.length()-1;i>=0;i--){
            int a=s1.charAt(i)-'0';
            for(int j=s2.length()-1;j>=0;j--){
                int b=s2.charAt(j)-'0';
                int sum=arr[i+j+1]+a*b;
                arr[i+j+1]=sum%10;
                arr[i+j]+=sum/10;
            }
        }
        StringBuffer sb=new StringBuffer();
        int i=0;
        while(i<arr.length&&arr[i]==0){
            i++;
        }
        while(i<arr.length){
            sb.append(arr[i]);
            i++;
        }
        return new String(sb);
    }
}

