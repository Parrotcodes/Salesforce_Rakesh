package Week2.keyWords;

import java.io.IOException;

public class ThrowsKey {
    public static void ZeroError(int n) throws IOException{
        if(n == 0){
            throw new IOException("zeros not allowed");
        }
        System.out.println("Integer values allowed");
    }
    public static void main(String[] args) {
        try {
            ZeroError(8);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
