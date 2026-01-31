public class BinaryTest {
    public static void main(String[] args) {
        
       
        int n1 = 0b1010; 
        
       
        int n2 = 1010;
        
        // 3. 八进制：以 0 开头 (这个最容易搞混！)
        int n3 = 01010;
        
        // 4. 十六进制：以 0x 开头 (x = hex)
        int n4 = 0x23A;
        
        System.out.println("n1 (二进制 0b1010) = " + n1);
        System.out.println("n2 (十进制 1010)   = " + n2);
        System.out.println("n3 (八进制 01010)  = " + n3);
        System.out.println("n4 (十六进制 0x23A) = " + n4);
    }
}