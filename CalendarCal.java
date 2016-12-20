import java.util.Calendar;

class CalendarCal{
  public static void main(String[] args){
    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH); 
    int day = cal.get(Calendar.DAY_OF_MONTH);
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int minute = cal.get(Calendar.MINUTE);
    int second = cal.get(Calendar.SECOND);
    System.out.println("year "+year+"month "+month+1+"day " +day+"hour "+ hour+"minute "+ minute+"second "+ second);
  }
}