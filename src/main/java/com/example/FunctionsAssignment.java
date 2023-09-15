package com.example;

public class FunctionsAssignment {

    // TODO: Implement a method that accepts two integers as parameters and returns their sum
    public int sum(int a, int b) {
        return a + b;
    }

    // TODO: Implement a method that accepts a string and returns its reverse
    public String reverseString(String input) {
        int length = input.length();
        StringBuilder reversed = new StringBuilder(length);
        for (int i = length - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    // TODO: Implement a method to return a greeting message of the format: "Hello, John!"
    public String greeting(String name) {
        return "Hello, " + name + "!";
    }

    // TODO: Implement a method that accepts an array of integers and returns the maximum value
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // TODO: Implement a method that accepts a string and returns true if it is a palindrome, false otherwise
    public boolean isPalindrome(String str) {
        int left=0;
        int right=str.length()-1;
        while (left<right) {
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right --;
            }
        return true;
        }

    // TODO: Implement a method to find the longest word in a string
    public String findLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    // TODO: Implement a method to calculate the average of an array of numbers
    public double calculateAverage(int[] nums) {
        int sum=0;
        for (int num: nums) {
            sum +=num;
        }
        return (double) sum/nums.length;
    }

    // TODO: Implement a method to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        for (int i = 2; i < num; i++) {
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
