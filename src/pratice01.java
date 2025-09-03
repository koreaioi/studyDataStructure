public class pratice01 {
    public static void main(String[] args) {
        stringTest();
        stringBuilderTest();
    }

    public static void stringTest(){

        String result = "";
        long start = System.currentTimeMillis();

        for(int i = 0 ; i < 1000; i++){
            for(int j = 0 ; j < 3; j++){
                result += "test";
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("String exec time : " + (end - start));
    }

    public static void stringBuilderTest(){

        long start = System.currentTimeMillis();

        for(int i = 0 ; i < 1000; i++){
            for(int j = 0 ; j < 3; j++){
                StringBuilder result = new StringBuilder();
                result.append("test");
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("String builder exec time : " + (end - start));
    }
}
