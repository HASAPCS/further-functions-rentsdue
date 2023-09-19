package com.example;

public class FunctionsAssignment {

    // TODO: Implement a method that accepts two integers as parameters and returns their sum
    public int sum(int a, int b) { 
        return a + b; //Sum of a and b
    }

    // TODO: Implement a method that accepts a string and returns its reverse
    public String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input.length()); 
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    // TODO: Implement a method to return a greeting message of the format: "Hello, John!"//
    public String greeting(String name) {
        return "Hello, " + name + "!";
    }

    // TODO: Implement a method that accepts an array of integers and returns the maximum value
    public int findMax(int[] arr) {
        int max = arr[0]; //First value is the max value
        for (int num : arr) {
            if (num > max) { //If there is a number greater than this initial number, then it is the new maximum.
                max = num;
            }
        }
        return max;
    }

    // TODO: Implement a method that accepts a string and returns true if it is a palindrome, false otherwise
    public boolean isPalindrome(String str) {
        int left=0; //Start of word
        int right=str.length()-1; //End of word
        while (left<right) { //While loop that stops at the middle of the word to reduce redundancy
            if (str.charAt(left) != str.charAt(right)){  //Checks if is not a palindrome
                return false;
            }
            left ++; //Continues on (left side)
            right --; //Continues on (right side)
            }
        return true;
        }

    // TODO: Implement a method to find the longest word in a string
    public String findLongestWord(String str) {
        String[] word_array = str.split("\\s+"); //Split on space, puts words into an array called "words" 
        //You can only put strings into this array
        String longestWord = ""; //First word
        for (String word : word_array) { //For loop that goes through every word in the array
            if (word.length() > longestWord.length()) { //Conditional that checks if the next word is longer than the current word
                longestWord = word; //If yes, then the longest word replaces the initial word
            }
        }
        return longestWord; //Returns the word
    }

    // TODO: Implement a method to calculate the average of an array of numbers
    public double calculateAverage(int[] nums) { 
        int sum=0; //Variable sums up all the numbers
        for (int num:nums){
            sum +=num; //Each number in the arry is added to the variable 'sum'
        }
        return sum/(nums.length); //Average: sum/number of numbers
    }

    // TODO: Implement a method to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) { //1 is not prime
            return false;
        }

        if (num == 2) { //2 is prime
            return true;
        }

        for (int i = 2; i < num; i++) { //for loop that divides the number by every single integer
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // TODO: Implement a method to calculate the power of a number
    public double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // TODO: Implement a method to count the occurrences of a character in a string
    public int countCharacterOccurrences(String str, char ch) {
        int count = 0; 
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)==ch) {
                count++;
            }
        }
        return count;
    }

    // TODO: Implement a method to find the largest number in an array
    public int findLargestNumber(int[] nums) {
        int max=nums[0];
        for (int num: nums){
            if (num>max) {
                max=num;
            }
        }
        return max;
    }
    // TODO: Implement a method to calculate the sum of an array
    public int calculateArraySum(int[] nums) {
        int sum=0;
        for (int num: nums){
            sum += num;
        }
        return sum;
    }
}
