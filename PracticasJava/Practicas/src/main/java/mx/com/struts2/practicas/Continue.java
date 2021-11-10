package mx.com.struts2.practicas;

public class Continue {

    public static void main(String[] args) {
        boolean bandera = true;
        byte index = 0;
        
        while(bandera) {
            index++;
            for(int i = 0; i < 10; i++) {
                if(i == 2) {
                    continue;
                }
                System.out.println("i " + i);
            }
            bandera = false;
            System.out.println("Index: " + index);
        }
        
    }
    
}
