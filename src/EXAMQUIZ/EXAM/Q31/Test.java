package EXAMQUIZ.EXAM.Q31;

abstract class Log{
    abstract long count();
    abstract Object get();
}


class CommunicationLog extends Log{
    int count(){ 
        return 100;
    }

    String get(){
        return "COM-LOG";
    }

}

public class Test {
    public static void main(String[] args) {
        Log log = new CommunicationLog();
        System.out.println(log.count());
        System.out.println(log);
    }
}
