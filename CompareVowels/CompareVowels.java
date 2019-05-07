import java.util.Scanner;

public class CompareVowels{
    public static int counting(String s){
        String vowels = new String("aeiouAEIOU");
        int count = 0;
        for(int i = 0;i < s.length();i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                count++;
            }
        }
        //System.out.println(count); //for debug
        return count;
    }

    public static void compare(String a, String b){
        int numA = 0;
        int numB = 0;
        if(a.isEmpty()){
            System.out.println("Error: First String is Empty");
        }
        if(b.isEmpty()){
            System.out.println("Error: Second String is Empty");
        }
        if(!a.isEmpty()&&!b.isEmpty()){
            numA = counting(a);
            numB = counting(b);
            System.out.print("Result: ");
            if(numA>numB){
                System.out.println(a);
            }
            else if(numA<numB){
                System.out.println(b);
            }
            else if(numA==numB){
                System.out.println("==");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input First String: ");
        String a = sc.nextLine();
        System.out.print("Input Second String: ");
        String b = sc.nextLine();
        compare(a, b);
        sc.close();
    }
}
