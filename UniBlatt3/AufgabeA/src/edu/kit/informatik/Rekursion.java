package edu.kit.informatik;

import java.util.ArrayList;

public class Rekursion {
    private static ArrayList<Integer> lookupTable = new ArrayList<>();
    private static int n,a,b;

    public static void main(String[] args){

        n = getUserInput("Please enter n:", false);
        a = getUserInput("Please enter a:", true);
        b = getUserInput("Please enter b:", true);


        for(int i = 0; i <= n; i++){
            lookupTable.add(calculate(i));
        }

        print();
    }

    private static void print(){
        String result = "";
        for(int i = 0; i < lookupTable.size(); i++){
            result += lookupTable.get(i);
            if(i<n){
                result+=",";
            }
        }
        System.out.println(result);
    }

    private static int calculate(int i){
        if(i < 3){
            return 1;
        }
        return a * lookupTable.get(i-2) + b * lookupTable.get(i-3);
    }


    private static int getUserInput(String message, boolean allowNegative){
        Terminal.printLine(message);
        String userInput = Terminal.readLine();
        try{
            int integer = Integer.parseInt(userInput);
            if(integer < 0 && !allowNegative){
                throw new Exception();
            }
            return integer;
        }catch (Exception e){
            Terminal.printLine("Error,\n" + userInput + " is not valid.");
        }
        System.exit(0);
        return 0;
    }
}
