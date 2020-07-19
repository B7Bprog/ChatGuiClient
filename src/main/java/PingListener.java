import javafx.concurrent.Task;

public class PingListener extends Task {


    @Override
    protected Object call() throws Exception {
        //int counter = 12;

        while (true) {
            System.out.println("pingTest is now: " + GuiMessageReceiver.pingTest);
                System.out.println("TriggerCount is now: " + GuiMessageReceiver.triggerCount);
            Thread.sleep(100);

            if (GuiMessageReceiver.pingTest.equals("*** Connection check - LIVE ***")) {

                GuiMessageReceiver.triggerCount += 1;


            } else {

            }

        }


    }
}
