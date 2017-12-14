package sample.com.databindingrecyclerview.universal;

import android.app.Application;

/**
 * Created by anfer on 12-Dec-17.
 */

public class ApplicationUtil extends Application {

    private static ApplicationUtil instance;

    /**
     * BASE_URL
     */
    public static final String BASE_URL = "http://94.56.199.34/";

    /**
     * TAG_DETAILS
     */
    public static final String TAG_DETAILS = "DETAILS_DATA";

    public static ApplicationUtil getInstance() {
        return instance == null ?
                (instance = new ApplicationUtil()) :
                instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
