import java.util.Scanner;

public class lab3 {
    public static void main(String[] args){
        System.out.println("Пароль должен состоять из 8 и более символов, и должен содержать хотя бы одну маленькую, одну заглавную буквы английского алфавита и одну цифру!");
        Scanner passwd = new Scanner(System.in);
        System.out.print("Введите пароль для проверки надежности:");
        String pass = passwd.nextLine();
        String pat = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9_]).{8,}";
        if (pass.matches(pat)) {
            System.out.println("Пароль надежный");
        }
        else {
            System.out.println("Пароль не надежный");
        }
    }
}

