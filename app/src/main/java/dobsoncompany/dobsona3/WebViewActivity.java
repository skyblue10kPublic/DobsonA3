package dobsoncompany.dobsona3;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class WebViewActivity extends AppCompatActivity {

    private Button btnClose;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        btnClose = (Button) findViewById(R.id.buttonCloseWebView);
        webView = (WebView) findViewById(R.id.webViewControl);

        btnClose.setOnClickListener(btnCloseWebView);
        Intent i = getIntent();
        String url = i.getStringExtra("url");

        // Some workaround for cahe miss issue in kitkat 4.4
        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);

        webView.loadUrl(url);

}
    private final View.OnClickListener btnCloseWebView = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}
