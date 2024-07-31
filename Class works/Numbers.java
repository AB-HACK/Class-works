class numMal{

     int sq(int i){
        return i*i;
    }
     double sqroot(int i){
        return Math.sqrt(i);
    }
     double cube(int i){
        return Math.pow(i, 3);
    }
     double cubeRt(int i){
        return Math.cbrt(i);
    }
}


public class Numbers {
    public static void main(String[] args) {
        numMal calc = new numMal();

        System.out.println("No\t\tNsq\t\tNSqRoot\t\tNCube\t\tNCubeRoot");
        for(int i=1; i<=5; i++){
            System.out.printf("%d\t\t %d\t\t %.2f\t\t %.2f\t\t %.2f%n", i, calc.sq(i), calc.sqroot(i), calc.cube(i), calc.cubeRt(i));
        }
    }

}
