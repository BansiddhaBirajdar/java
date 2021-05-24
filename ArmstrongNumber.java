
import java.lang.Math;
class ArmstrongNumber {
    public static void main(String[] args) {
        int sum=0;
        int no=153;
        int temp=no;
        int length=Integer.toString(no).length();
        while(temp>0){
            sum+=Math.pow((temp%10), length);
            temp/=10;
        }
        if(sum==no)
        System.out.printf("Number %d  is Armstrong Number %d",no,no);
        else
        System.out.printf("Number %d is Not Armstrong Number %d",no,no);
        
    }
}
