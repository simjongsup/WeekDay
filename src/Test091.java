public class Test091

{

    public static void main(String[] args)

    {

        WeekDay wd = new WeekDay();



        wd.input();						//-- 입력 메소드 호출



        //wd.week();



        String result = wd.week();	//-- 요일 산출 메소드 호출

        wd.print(result);				//-- 출력 메소드 산출

    }

}
