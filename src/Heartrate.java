public class Heartrate {
    private String firstName;
    private String lastname;
    private String dateofBirth;
    private int day;
    private int month;
    private int year;
    public Heartrate(){

    }

    public Heartrate(String fn,String ln,int d,int m,int y){
        firstName=fn;
        lastname=ln;
        this.setdateofBirth(d,m,y);

    }

    public void setdateofBirth(int d,int m,int y) {
        day=d;
        month=m;
        year=y;
        dateofBirth = day+" "+month+" "+year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public int Age(){
        int age=2020-this.year;
        return age;
}
    public double MaxHeartrate(){

        double range=Age()-220;
        return range;

    }
    public double TargetHeartrate(){

        int range=(50/100)-(80/100);
        double target=range*MaxHeartrate();
        return target;
}
}