import java.util.Scanner;

class PhysicalExamination {

    static final int VMAX = 21;

    static class PhysicalData {
        String name;
        int height;
        double vision;

        PhysicalData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
}
        static double aveHeight(PhysicalData[] data) {
            double sum = 0;

            for (int i = 0; i < data.length; i++) {
                sum += data[i].height;
            }
            return sum / data.length;
        }

        static void aveVision(PhysicalData[] data, int[] dist) {
            int i = 0;

            for (i = 0; i < data.length; i++) {
                if (data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0)
                    ;
                dist[(int) (data[i].vision * 10)]++;
            }
        }

        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);

            PhysicalData[] x = {
                    new PhysicalData("무야호", 162, 0.3),
                    new PhysicalData("무야호1", 164, 0.9),
                    new PhysicalData("무야호2", 181, 1.0),
                    new PhysicalData("무야호2", 181, 1.0),
            };
            int[] vdist = new int[VMAX];
            System.out.println("이름     키     시력");
            System.out.println("-------------------");
            for (int i = 0; i<x.length; i++)
                System.out.printf("%-8s%3d%5.1f\n", x[i].name,x[i].height,x[i].vision);

            System.out.printf("\n평균 키: %5.1fcm\n",aveHeight(x));

            aveVision(x, vdist);
            System.out.println("\n시력분포");
            for (int i = 0;i < VMAX; i++)
                System.out.printf("%3.1f~:%2s명\n",i/10.0,"*".repeat(vdist[i]));

            stdIn.close();

        }
    
}