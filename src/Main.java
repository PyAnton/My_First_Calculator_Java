import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static String [] arab = {"10","1","2","3","4","5","6","7","8","9"};
    private static String [] rome = {"X","I","II","III","IV","V","VI","VII","VIII","IX"};
    private static String [] romeChare = {"X","I","V"};

    public static void main(String[] args) {
        System.out.println("Hello, I Calculator!");
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Enter expression or q to exit :"); String s = in.nextLine();
            if (Objects.equals(s, "q")){System.exit(0);}
            System.out.println(calc(s));

        }
    }
    public static String calc(String input){

        opper opp = new opper();

        String[] parts = input.split(" ");
        if (parts.length!=3){exception( "//формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");}
        opp.val1 = parts[0];
        opp.val2 = parts[1];
        opp.val3 = parts[2];
        isFormat(opp);
        if(opp.IsRome){
            int a = convertToArab(opp.val1);
            int b = convertToArab(opp.val3);

            int c = 0;
            if (opp.val2.charAt(0) == '+'){
                c = a+b;
            }
            else if(opp.val2.charAt(0) == '-'){
                if(a<b){exception("//в римской системе нет отрицательных чисел");}
                c = a-b;
            }
            else if(opp.val2.charAt(0) == '*'){
                c = a*b;
            }
            else if(opp.val2.charAt(0) == '/'){
                if(b==0){exception("//Делить на 0 нельзя");}
                c = a/b;
            }

            return convertToRome(c);
        }
        else{
            int a = Integer.parseInt(opp.val1);
            int b = Integer.parseInt(opp.val3);
            if(a>10||b>10){exception("//Число не может быть больше 10!");}
            int c = 0;
            if (opp.val2.charAt(0) == '+'){
                c = a+b;
            }
            else if(opp.val2.charAt(0) == '-'){
                c = a-b;
            }
            else if(opp.val2.charAt(0) == '*'){
                c = a*b;
            }
            else if(opp.val2.charAt(0) == '/'){
                if(b==0){exception("//Делить на 0 нельзя");}
                c = a/b;
            }
            return String.valueOf(c);
        }

    }
    private static void isFormat(opper opp){

        if((isArab(opp.val1)&&isRome(opp.val3))||(isRome(opp.val1)&&isArab(opp.val3))){exception("//используются одновременно разные системы счисления");}
        if(!opp.val2.equals("+")&&!opp.val2.equals("-")&&!opp.val2.equals("*")&&!opp.val2.equals("/")){exception("//Не правильный знак операции");}
        if(isRome(opp.val1)){
            opp.IsRome=true;
            if(opp.val1.length()>4||opp.val2.length()>1||opp.val3.length()>4){exception("//Ограничение по длине числа");}
        }
        else{
            opp.IsRome=false;
            if(opp.val1.length()>2||opp.val2.length()>1||opp.val3.length()>2){exception("//Ограничение по длине числа");}
        }

    }
    private static boolean isRome(String input){



        for(int i=0;i<romeChare.length;i++){
            if(input.contains(romeChare[i])){
                return true;
            }
        }
        return false;
    }
    private static boolean isArab(String input){
        for(int i=0;i<arab.length;i++){
            if(input.equals(arab[i])){
                return true;
            }
        }
        return false;
    }
    private static int convertToArab(String input){
        for(int i =0; i<rome.length;i++){
            if (input.equals(rome[i])){
                if(i==0){return 10;}
                return i;
            }
        }
        exception("//Римское число должно быть не больше X");
        return -1;
    }
    public static String convertToRome(int input){
        String s = "";
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }
    private static void exception(String input){
        System.out.printf("throws Exception "+input);
        System.exit(0);
    }

}