    package DFS_BFS_levelup;
    import java.util.Scanner;

    public class dfs_01 {
        static int[] arr;
        static boolean[] ch;
        static int n;
        static int sum1=0, sum2 = 0;

        public static void DFS(int L, String str) {
            //ch[index] = false 인상황
            if (L == n) {
                sum1 = 0;
                sum2=0;
                Calculate(str);
            }else {
                String str1 = (str + "0");
                String str2 = (str + "1");
                DFS(L + 1,str1);
                DFS(L + 1,str2);
            }
        }


        public static void Calculate(String str) {



            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    sum1 += arr[i];
                }else{
                    sum2 += arr[i];
                }
            }
            if(sum1 == sum2) {
                System.out.println("YES");
                System.exit(0);
            }
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            arr = new int[n];
            ch = new boolean[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();


            DFS(0, "");

            System.out.println("NO");
        }
    }
