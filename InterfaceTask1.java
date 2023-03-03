interface camera{
    void click();
    void record();
}

interface MusicPlayer{
    void play();
    void stop();
}


class Phone{
    void call(){
        System.out.println("Calling!!");
    }
    void sms(){
        System.out.println("Sending Sms!!");
    }
}


class SmartPhone extends Phone implements MusicPlayer , camera{
    void call(){
        super.call();
    }
    void sms(){
        super.sms();
    }

    public void click(){
        System.out.println("Clicked!!");
    }
    public void record(){
        System.out.println("Recording!!");
    }

    public void play(){
        System.out.println("Music is Playing!!");
    }
    public void stop(){
        System.out.println("Stop Music!!");
    }
}


public class InterfaceTask1 {
    public static void main(String args[]){
        SmartPhone sp = new SmartPhone();
        sp.click();
        sp.record();
        sp.play();
        sp.stop();
        sp.sms();
        sp.call();
    }
}
