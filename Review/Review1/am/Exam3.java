package am;
public class Exam3 {
    public static void main(String[] args) {
/*      
연산자 + - * /      % 홀수 짝수 배수


*/
        // int a = 3;
        // ++a;//전위형
        // System.out.println(a);  //4

        // int b = 3;
        // b++;//후위형 , 이걸 많이 씀.  b = b + 1;    b += 1;
        // System.out.println(b); //4




        

        // quiz a가 홀수인지 짝수인지 출력하세요
        //'a'는 홀수 입니다.

        // int a = 5;

        // if(a % 2 == 0){
        //     System.out.println("짝수입니다");
        // }else{
        //     System.out.println("홀수입니다");
        // }


        //quiz d가 3의배수인지를 출력하세요
        //9는 3의 배수입니다.
        // int d = 9;
        
        // if(d % 3 ==0){
        //     System.out.println(d + "는 3의 배수입니다");
        // }else{
        //     System.out.println("배수가 아닙니다");
        // }


        int q = 5;
        int w = 2;
        int e = 5;

        System.out.println(q==w);
        System.out.println(q==e);

        String str1 = new String("안녕");
        String str2 = new String("안녕");
        
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2)); // 글자를 비교할때는 ==는 쓰지말고 equals를 써라!!!!
        
        
    }
   
}
