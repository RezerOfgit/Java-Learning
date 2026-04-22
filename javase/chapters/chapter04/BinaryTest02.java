public class BinaryTest02 {
    public static void main(String[] args) {
        
        // 1. 二进制：以 0b 开头 (b = binary)
        int n1 = 0b11; 
        
        // 2. 十进制：咱们平常写的，啥都不加
        int n2 = 11;
        
        // 3. 八进制：以 0 开头 (这个最容易搞混！)
        int n3 = 011;
        
        // 4. 十六进制：以 0x 开头 (x = hex)
        int n4 = 0x11;
        
        System.out.println("n1 (二进制 0b11) = " + n1);
        System.out.println("n2 (十进制 11)   = " + n2);
        System.out.println("n3 (八进制 011)  = " + n3);
        System.out.println("n4 (十六进制 0x11) = " + n4);
    }
}