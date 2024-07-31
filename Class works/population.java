public class population {
    public static void main(String[] args) {
        int XYZMax = 15000;
        int currentNum = 9000;
        double growthRate = 0.05;
        int years = 0;

        
        while(currentNum < XYZMax ){
            int popPerYear = (int) (currentNum * growthRate);
            currentNum += popPerYear;
            years++;
            System.out.printf("Population after year %d = %d \n", years, currentNum );
        }

        System.out.printf("It will take %d years for the population to exceed the capacity of %d students.\n", years, XYZMax);
    }
    
}


// public class population {
//     public static void main(String[] args) {
//         int XYZMax = 15000;
//         int currentNum = 9000;
//         double growthRate = 0.05;
//         int years = 0;


//         while(currentNum < XYZMax ){
//             int popPerYear = (int) (currentNum * growthRate);
//             currentNum += popPerYear;
//             years++;
//         }

//         System.out.printf("It will take %d years for the population to exceed the capacity of %d students.\n", years, XYZMax);

//         years = 0;
//         currentNum = 9000;
        
//         while(currentNum < XYZMax ){
//             int popPerYear = (int) (currentNum * growthRate);
//             currentNum += popPerYear;
//             years++;
//             System.out.printf("Population after year %d = %d \n", years, currentNum);
//         }
//     }
    
// }

