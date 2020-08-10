public class Runheartrate {
    public static void main(String[] args) {
        Heartrate hr=new Heartrate("wxy","abc",23,02,2000);
        int age=hr.Age();
        System.out.println(age+"  is age");
        double maxhr=hr.MaxHeartrate();
        System.out.println(maxhr+ " Max Heartrate");
        double thr=hr.TargetHeartrate();
        System.out.println(thr+" Target Heartrate");
    }
}
