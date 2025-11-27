class Solution {
    public String solution(String bin1, String bin2) {
        // int dec1 = Integer.parseInt(bin1, 2);
        // int dec2 = Integer.parseInt(bin2, 2);
        int dec1 = binaryToDecimal(bin1);
        int dec2 = binaryToDecimal(bin2);
        
        int sum = dec1 + dec2;
        
        // return Integer.toBinaryString(sum);
        return decimalToBinary(sum);
    }
    
    private int binaryToDecimal(String bin) {
        int decimal = 0;
        int power = 1;
        
        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) == '1') decimal += power;
            power *= 2;
        }
        
        return decimal;
    }
    
    private String decimalToBinary(int decimal) {
        if (decimal == 0) return "0";
        
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(decimal % 2);
            decimal /= 2;
        }
        
        return sb.reverse().toString();
    }
}