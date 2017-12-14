package sample.com.databindingrecyclerview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import sample.com.databindingrecyclerview.R;
import sample.com.databindingrecyclerview.universal.ApplicationUtil;

public class DetailsActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        String htmlString = getIntent().getStringExtra(ApplicationUtil.getInstance().TAG_DETAILS);
        setupWebView(htmlString);
    }

    private void setupWebView(String htmlString) {
        webView = findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadDataWithBaseURL("", htmlString, "text/html", "UTF-8", "");
    }
}
