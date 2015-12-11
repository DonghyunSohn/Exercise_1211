package hanssem.textbook_239;


    import android.content.BroadcastReceiver;
    import android.content.Context;
    import android.content.Intent;
    import android.util.Log;
    public class MySMSBroadcastReceiver extends BroadcastReceiver {

        @Override
                public void onReceive(Context context, Intent intent) {
                    Log.d("MySMSBroadcastReceiver", "onReceive");

                    if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
                        Log.d("MySMSBroadcastReceiver", "SMS 메시지가 수신되었습니다.");

                        abortBroadcast();

                        Intent myIntent = new Intent(context, MainActivity.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(myIntent);

            }
        }
    }
