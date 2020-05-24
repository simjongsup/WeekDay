import java.util.Scanner;



class WeekDay

{

    // 주요 변수 선언

    private int y, m, d;		//-- 사용자가 입력한 년, 월, 일을 담을 변수



    // 메소드 정의(입력 받기)

    void input()

    {

        Scanner sc = new Scanner(System.in);



        System.out.print("년 월 일 입력(공백구분) : ");

        y = sc.nextInt();

        m = sc.nextInt();

        d = sc.nextInt();

    }



    // 메소드 정의(요일 산출하기)★

    String week()

    {

        // 각 월의 마지막 날짜(각 월의 최대값)을 배열 형태로 구성

        int[] months = {31, 0, 31, 30, 31, 30, 31, 31 , 30, 31, 30, 31};

        // 요일명에 대한 배열 구성

        String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};

        //--날수, 루프, 요일 선언

        int nalsu, i, w;





        // 윤년에 따른 2월의 날 수 계산

        // 윤년이라면... 2월의 마지막 날짜를 29일로 설정

        // 평년이라면... 2월의 마지막 날짜를 28일로 설정

        if ((y%4==0 && y%100!=0) || y%400==0)	// 윤년이라면...

        {

            // 2월의 마지막 날짜를 29일로 설정

            months[1] = 29;

        }

        else	// 평년이라면...

        {

            months[1] = 28;

        }



        // ① 1년 1월 1일 부터 입력받은 년도의 이전 년도 12월 31일 까지의 날 수 계산

        nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;



        // 테스트

        // System.out.println(nalsu);		//--==>> 년 월 일 입력(공백구분) : 2018 2 28 \n 736694



        // ② 입력받은 월 이전 월 까지의 날 수 계산 후

        //    1번 결과에 더하는 연산

        for (i=0; i<(m-1); i++)

        {

            nalsu += months[i];

        }



        // 테스트

        // System.out.println(nalsu);		//--==>>년 월 일 입력(공백구분) : 2018 2 28 \n 736725



        nalsu += d;



        w = nalsu % 7;	// 전체 날수 % 7 = 0 → 일요일



        //테스트

        //System.out.println(w);				//--==>> 3

        //System.out.println(weekNames[w]);		//--==>> 수



        return weekNames[w];

    }



    // 메소드 정의(결과 출력하기)

    void print(String day)

    {

        System.out.printf("\n%d년 %d월 %d일 → %s요일\n", y, m, d, day);

    }

}
