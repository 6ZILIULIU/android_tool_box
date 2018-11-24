package liuzi;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


public final class LogMsg extends AppCompatActivity{
    public final static int LONG = 1;
    public final static int SHORT = 0;

    public static void show(Context context, String s,int delay){
        Toast.makeText(context, s, delay).show();
    }
}
