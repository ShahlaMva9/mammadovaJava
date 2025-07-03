package org.example;

public class Task2 {
    public static boolean isValid(String sequence){
        return showCorrectVersion(sequence).equals(sequence);
    }
    public static String showCorrectVersion (String sequence){
        String[] sequencePart1=sequence.substring(0,sequence.length()/2).split("");
        String[] sequencePart2=sequence.substring(sequence.length()/2).split("");

        for (int i=0;i<sequencePart1.length;i++){
            int j=sequencePart2.length-1-i;
            if(sequencePart1[i].equals("[") & !sequencePart2[j].equals("]")){
                sequencePart2[j]="]";
            } else if (sequencePart1[i].equals("(") & !sequencePart2[j].equals(")")){
                sequencePart2[j]=")";
            } else if (sequencePart1[i].equals(")") & !sequencePart2[j].equals("(")){
                sequencePart2[j]="(";
            }
        }
        String sequence1 = String.join("", sequencePart1);
        String sequence2 = String.join("", sequencePart2);
        return  sequence1+sequence2;
    }

    public static void main(String[] args) {
        String sequence="[((())()(())]]";

        if(isValid(sequence)){
            System.out.println("The sequence is valid " + sequence);
        } else {
            System.out.println("The sequence is not valid. Correct version is "+ showCorrectVersion(sequence));
        }
    }
}
