package hanssem.textbook_253;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView textView1;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.textView1);

    }

    public void onButton1Clicked(View v) {
        AlertDialog dialog = createDialogBox();
        dialog.show();
    }


    private AlertDialog createDialogBox(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("안내");
        builder.setMessage("종료하시겠습니까?");
        builder.setIcon(android.R.drawable.ic_dialog_alert);

        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                msg = "예 버튼이 눌렀습니다. " + Integer.toString(whichButton);
                textView1.setText(msg);
            }
        });

        builder.setNeutralButton("취소",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                msg = "취소 버튼이 눌렸습니다. " + Integer.toString(whichButton);
                textView1.setText(msg);
            }
        });

        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                msg = "아니오 버튼이 눌렸습니다. " + Integer.toString(whichButton);
                textView1.setText(msg);
            }
        });

        AlertDialog dialog = builder.create();

        return dialog;
    }
}