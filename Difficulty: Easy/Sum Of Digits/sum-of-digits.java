class Solution {
    static int sumOfDigits(int n) {
        // code here
        //base condition
        if(n == 0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
        
    }
    
 
}

/*
sumOfDigits(687)
= 7 + sumOfDigits(68)
= 7 + (8 + sumOfDigits(6))
= 7 + 8 + (6 + sumOfDigits(0))
= 7 + 8 + 6 + 0
= 21
Each recursive call:

Takes last digit → n % 10

Removes last digit → n / 10

Stops when n == 0


*/
