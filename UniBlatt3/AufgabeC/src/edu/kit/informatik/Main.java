package edu.kit.informatik;


import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    private static String[] colors;
    public static void main(String[] args){
        colors = getColors(args[0]);

        String userInput;
        String[] userInputSplit;
        int correct;
        for(int i = 1; i <= 10; i++){
            try{
                Terminal.printLine("Versuch " + i + ":");
                userInput = Terminal.readLine();

                switch (userInput){
                    case "quit":
                        Terminal.printLine("here");
                        i=10;
                }

                userInputSplit = userInput.split(" ");
                if(userInputSplit.length != 4) throw new Exception("please enter a valid input");

                correct = getNumberOfCorrectColors(userInputSplit);

            }catch (Exception e){
                i--;
                Terminal.printLine("Error,\n" + e.getMessage());
            }
        }
    }


    private static String[] getColors(String path){
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            return br.readLine().split(",");
        }catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        return null;
    }
    private static boolean findColor(String color){
        for(int i = 0; i < colors.length; i++){
            if(colors[i]==color)
                return true;
        }
        return false;
    }
    private static int getNumberOfCorrectColors(String[] userInput){
        int correctColors = 0;
        for(int i = 0; i < userInput.length; i++){
            if(findColor(userInput[i])){
                correctColors++;
            }
        }
        return correctColors;
    }
}
