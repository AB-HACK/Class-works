public class roots{
    public static void main(String [] agrs){

        System.out.println("no square ......");
        for(int i = 1; i <=10; i++){
            System.out.println(i + "\t\t" + sq(i) + "\t\t\t" + sqroot(i) + "\t\t\t" + cube(i) + cuberoot(i) );
        }
    }

    static int sq(int i){
        return i*i;
    }

    static double sqroot(int i){
        return Math.sqrt(i);
    }

    static int cube(int i){
        return i*i*i;
    }

    static double cuberoot(int i){
        return Math.cbrt(i);
    }
}


final class numbers {

    private static final String b = null;
    private static final String c = null;
    private static final String input = null;

    public static void main(String[] args) {
        System.out.println("enter a, b, c");
        float a= input.rootFloat() b= input.rootFloat() c= input.rootFloat();
        float d = disc(a, b, c);
        if(d==0){
            double R1 = Roots(a, b, c);
            System.out.println("Root =" + R1);
        }
        if (d < 0){
            System.out.println("complex roots");
        }
        if(d > 0){
            double R2 = Root2(a,b,c);
            double R3 = root3(a,b,c);
            System.out.println();
        }

        //Method for discriminant
        static float disc( float a, float b, float c){
            return b*b-4*a*c;
        }

        //Method for root 1
        static double Root1(float a, float b, float c){
            return(b*b)/(2*a);
        }

        //Method for root 2
        static double root2(float a, float b, float c){
            return(-b + Math.sqrt(disc(a,b,c)))/(2*a);
        }

        //Method for root 3
        static double root3(float a, float b, float c){
            return(-b + Math.sqrt(disc(a,b,c)))/(2*a);
        }

    }
}
