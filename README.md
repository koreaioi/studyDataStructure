#알고리즘 공부를 위함






<details>
<summary>백준 1259번 </summary>
[백준1259번](src/solvedac/ac1259.java)

```java
package solvedac;
import java.util.*;


public class ac1259 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            String answer = "yes";
            if(num ==0) return;

            String str = Integer.toString(num);
            for (int i = 0; i < str.length() / 2; i++) {
                if(str.charAt(i)!= str.charAt(str.length()-i-1)) answer = "no";
            }
            System.out.println(answer);
        }

    }
}
```
</details>

<details>
<summary>DFS</summary>
    ```java
    public void DFS(int start){
        ch[start] = 1;
        sb.append(start + " ");

        for(int i = 1;i<=node;i++){
            if(arr[start][i] == 1 && ch[i]==0]) DFS(i);
        }          
    }
}


    

    
</details>


