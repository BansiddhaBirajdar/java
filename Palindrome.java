
public class Palindrome{

     public static void main(String []args){
        int ino=100;
        int temp=ino;
        int r=0;
        while(temp>0){
            r=r*10+(temp%10);
            temp/=10;
        }
        if(ino==r){
            System.out.printf("%d Number Is Palindrome",ino);
        }
        else{
            System.out.printf("%d Number Is Not Palindrome\n",ino);
        }

     }
}
