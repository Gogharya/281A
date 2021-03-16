import java.util.Scanner;
class Capital{
    public static void main(String []args){
        String s;
        Scanner zico = new Scanner(System.in);
        s = zico.nextLine();
        if (Character.isLowerCase(s.charAt(0))){
            s = Character.toUpperCase(s.charAt(0))+s.substring(1,s.length());
        }
        System.out.println(s);
    }
}