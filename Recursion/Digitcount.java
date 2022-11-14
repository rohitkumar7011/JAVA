public class Digitcount{
    static void countdigit(int num, int count){
        if(num==0){
            System.out.println(count);
            return ;

        }
        num=num/10;
        count=count+1;
        countdigit(num, count); 
        
    }
public static void main(String[] args) {
    int num=12345;
    int count=0;
    countdigit(num, count);
   

    
}
}