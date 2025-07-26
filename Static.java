public class Static {

    static void testMethod(){
        System.out.println("Entered static !!!");
    }
    public  static  void  main(String abc[]){
        Test test = new Test();
        test.maths = 100;
        test.examDate= "10Jan";

        Test test1 = new Test();
        test1.maths = 100;
        test1.examDate= "11Jan";

        Test.callMethod();
        testMethod();
    }
}

