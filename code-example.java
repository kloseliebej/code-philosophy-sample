//Function description: A easy problem from LeetCode.com. Reverse a given 32 bits unsigned integer.
//input: the 32 bit unsigned integer
//output: the reversed integer of the input
//Example: 1(00000000000000000000000000000001) return 2^32(10000000000000000000000000000000)
//Time Complexity: O(1)
//Space Complexity: O(1), two long type variables.

public class Function {
    public int reverseBits(int n) {
        
        //Use long type variable to do the intermediate process in case of overflow.
        long unsigned = (long)n;
        
        //Convert a signed value to an unsigned value. Integer.MAX_VALUE=2^32-1.
        if(unsigned < 0){
            unsigned = 2 * (long)Integer.MAX_VALUE + 2 + unsigned;
        }
        
        //Reverse the bits
        long result = 0L;
        for(int i = 0; i < 32; i++){
            result <<= 1;
            result += unsigned % 2;
            unsigned >>= 1;
        }
        
        return (int)result;
    }
}