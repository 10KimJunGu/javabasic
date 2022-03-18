package am;


public class Exam6 {
    public static void main(String[] args) {
        
        // for(int i = 0; i <=10; i++){
        //     if(i % 2 == 0){
        //         continue;
        //     }
        //     System.out.println(i);
        // }


        // for(;;){
        //     System.out.println("hello world");
        // }
        // while(true){
        //     System.out.println("hello world");
        // }


        // int i = 0;
        // while (true){
        //     if(i ==10){
        //         break;
        //     }
        //     System.out.println("hello world");
        //     i++;
        // }


        // int i = 0;
        // do{
        //     System.out.println("hellow world");
        //     i++;
        // }while(i <= 10);




        //3 6 9 게임 100 미만의 숫자중,,,

        // 1   2   짝  4   5   짝  7   8   짝  10
        // 11  12  짝  ....

        // for (int i = 1 ; i<=100; i++){
        //     System.out.print(i + "\t");
        //     if(i % 3 == 0){
        //         System.out.print("짝");
        //     }

        // }


            for (int i =1; i <=100; i++){
                int cnt = 0; //짝의 갯수
                int x = i/10; // 12 -> 1
                int y = i%10; // 12 -> 2

                if(x % 3 ==0){
                    cnt++;
                if(y % 3 == 0)
                    cnt++;

                if(i % 10 == 0){
                    if(cnt ==2)
                        System.out.println("짝짝");
                    else if(cnt == 1)
                        System.out.println("짝");
                    else
                        System.out.println(i);
                } else{
                    if(cnt ==2)
                        System.out.println("짝짝");
                    else if(cnt == 1)
                        System.out.println("짝");
                    else
                        System.out.println(i + "\t");
                }
                
            }


        }
    }
}
