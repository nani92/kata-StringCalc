package com.nani.stringcalculator;

/**
 * Created by nataliajastrzebska on 21/03/16.
 */
public class Calculator {

    public int add(String input) {

        if (input.isEmpty()) {
            return 0;
        }

        if (input.startsWith("//")) {
            String[] splitInput = input.split("\n");
            String separator = getSeparator(splitInput[0].substring(2));

            return countOutput(splitInput[1], separator);
        } else {
            return countOutput(input, "[\n,]");
        }
    }

    private int countOutput(String input, String separator) {
        int output = 0;
        String[] inputs = input.split(separator);

        for (String singleInput : inputs) {

            if (Integer.parseInt(singleInput) > 1000) {
                continue;
            }

            output += Integer.parseInt(singleInput);
        }

        return output;
    }

    private String getSeparator(String separatorInput) {

        if (separatorInput.startsWith("[")) {
            String[] separatorsSplitted = separatorInput.split("\\[");
            String separators = "";

            for (String separator : separatorsSplitted) {
                separators += separator.substring(0, separator.length()) ;
            }

            return separators.substring(0, separators.length() - 1);
        } else {
            return separatorInput;
        }
    }
}
