package dobsoncompany.dobsona3;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnMesaCollegeGo;
    private Button btnYahooGo;
    private TextView txtViewInstruction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        btnMesaCollegeGo = (Button) findViewById(R.id.buttonGoMesa);
        btnYahooGo = (Button) findViewById(R.id.buttonGoYahoo);


        btnMesaCollegeGo.setOnClickListener(btnMesaCollegeGoListener);
        btnYahooGo.setOnClickListener(btnYahooGoListener);
    }

    private final View.OnClickListener btnMesaCollegeGoListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent i = new Intent(getApplicationContext(),WebViewActivity.class);
            i.putExtra("url","http://www.sdmesa.edu");
            startActivity(i);
        }
    };

    private final View.OnClickListener btnYahooGoListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent i = new Intent(getApplicationContext(),WebViewActivity.class);
            i.putExtra("url","http://www.yahoo.com/");
            startActivity(i);
        }
    };

    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

}
