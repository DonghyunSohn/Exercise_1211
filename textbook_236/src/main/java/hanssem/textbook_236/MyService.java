package hanssem.textbook_236;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;


public class MyService extends Service implements Runnable {

    public static final String TAG = "MyService";

    private int count = 0;

    public void onCreate() {
        super.onCreate();

        Thread myThread = new Thread(this);
        myThread.start();
    }

    public void run() {
        while(true) {
            try {
                Log.i(TAG, "my service called #" + count);
                count++;

                Thread.sleep(5000);
            } catch(Exception ex) {
                Log.e(TAG, ex.toString());
            }
        }

    }

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

}