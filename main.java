public class main {

    public static void main(String[] args) {
        String x = "bruh";
        String y = "Bro";
        String temp;

        x=y;


        temp = x;
        x=y;
        y=temp;

        System.out.println("x: "+x);
        System.out.println("y:"+y); 
    }

}   