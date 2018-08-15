package sg.edu.rp.c346.practicalquiz2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        //Task 1b
        Toast.makeText(context,"You have changed the wallpaper.", Toast.LENGTH_LONG).show();

        //Task 1
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        int id = preferences.getInt("id", R.id.msg1);
        if(id == R.id.msg1)
            Toast.makeText(context,"You have a good taste!", Toast.LENGTH_LONG).show();
        Toast.makeText(context,"bro,think about it twice!", Toast.LENGTH_LONG).show();
    }
}
