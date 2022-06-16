package com.my_testing.MyTesting.check;

public class MyTest {

    //Method for compare two strings

    public Boolean compareString(String str1,String str2){
        return str1.equalsIgnoreCase(str2);
    }

    //Method for concate two string

    public String concatString(String st1,String st2){
        return st1.concat( st2);
    }


    //Adding 1 each element  to an array and assign to new array
    //compare two array elements

    public int[] addElement(int [] number){
        int length = number.length;
        int [] newOutput= new int[length];
        for (int i=0;i<length;i++){
            newOutput[i]=number[i]+1;
        }
        return newOutput;
    }

    //check performance
    public void performance(){
        for (int j=0;j<1000000000;j++){

        }
        System.out.println("*** /Finish/ ****");
    }

    //Exception test
    public void exception(int number){
        int result=10/number;
        System.out.println("Result is "+result);
    }
}

