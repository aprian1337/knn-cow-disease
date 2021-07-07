public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        int []tes = { 0,0,1,0,1,0,1,1,0,0,0,0,0,0,1,0,1,0,0,0,0 };
        System.out.println(main.diagnoseDisease(tes));
    }

    public String diagnoseDisease(int[] gejala) {
        Calculation calc = new Calculation(gejala);
        return calc.startCalculation();
    }
}
