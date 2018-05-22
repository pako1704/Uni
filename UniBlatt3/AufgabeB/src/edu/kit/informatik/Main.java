package edu.kit.informatik;

public class Main {
    public static void main(String[] args){
        boolean loop = true;
        String userInput;
        String[] inputSplit;

        while(loop){
            try{
                userInput = Terminal.readLine();
                inputSplit = userInput.split(" ");

                switch (inputSplit[0]){
                    case "approximation":
                        if(inputSplit.length == 1)
                            throw new Exception("this command needs at least one parameter.");
                        approximation(Integer.parseInt(inputSplit[1]));
                        break;
                    case "quit":
                        loop=false;
                        break;
                    default:
                        throw new Exception("the command \"" + inputSplit[0] + "\" is not valid.");
                }

            }catch (Exception e){
                Terminal.printLine("Error,\n" + e.getMessage());
            }
        }
    }
    private static void approximation(int n) throws Exception{
        if(n < 0) throw new Exception("n has to be positive.");

        double lastResult = 1;
        double currentResult;
        double combinedResult = 0;

        for(int i = 0; i <=n; i++){
            if(i == 0){
                combinedResult++;
                continue;
            }

            currentResult = lastResult*i;
            lastResult = currentResult;
            combinedResult+=1/currentResult;
        }

        Terminal.printLine(combinedResult);
    }
}
