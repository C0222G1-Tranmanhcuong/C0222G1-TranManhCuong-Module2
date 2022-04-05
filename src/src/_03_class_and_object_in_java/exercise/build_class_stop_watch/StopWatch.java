package _03_class_and_object_in_java.exercise.build_class_stop_watch;

public class StopWatch {
    private double startTime;
    private double endTime;
    public StopWatch(){

    }

    public double getStartTime() {
       return  startTime;
    }
    public double getEndTime() {
        return endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return  (endTime - startTime);
    }
}
