package sample.com.databindingrecyclerview.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sample.com.databindingrecyclerview.R;
import sample.com.databindingrecyclerview.adapter.AnnouncementAdapter;
import sample.com.databindingrecyclerview.data.AnnouncementItem;
import sample.com.databindingrecyclerview.rest.DataManager;
import sample.com.databindingrecyclerview.rest.DataManagerInterface;
import sample.com.databindingrecyclerview.universal.ApplicationUtil;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<AnnouncementItem> announcementList = new ArrayList<AnnouncementItem>();
    private ProgressDialog mProgressDialog;
    private AnnouncementAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupRecyclerView();

        DataManagerInterface apiService = DataManager.loadData().create(DataManagerInterface.class);

        Call<List<AnnouncementItem>> call = apiService.getAnnouncementList("Promotions_ipad.htm",
                "Common.Announcements", "News", "EMC", "News", "J");
        showProgressDialog(true);
        call.enqueue(new Callback<List<AnnouncementItem>>() {
            @Override
            public void onResponse(Call<List<AnnouncementItem>> call, Response<List<AnnouncementItem>> response) {
                showProgressDialog(false);
                announcementList.addAll(response.body());
                mAdapter.notifyDataSetChanged();
                Log.d("", "Number of Announcement received: " + announcementList.size());
            }

            @Override
            public void onFailure(Call<List<AnnouncementItem>> call, Throwable t) {
                showProgressDialog(false);
                Log.e("", t.toString());
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * setupRecyclerView - Method to initialize RecyclerView, setting LayoutManager, Divider and Adapter
     */
    private void setupRecyclerView() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        mAdapter = new AnnouncementAdapter(getApplicationContext(), announcementList, new AnnouncementAdapter.CustomItemClickListener() {
            @Override
            public void onItemClick(AnnouncementItem item) {
                Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
                intent.putExtra(ApplicationUtil.getInstance().TAG_DETAILS, item.getAnnouncementHtml().getValue());
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(mAdapter);
    }

    /**
     * showProgressDialog - Method to show/hide ProgressDialog
     *
     * @param flag
     */
    private void showProgressDialog(boolean flag) {
        if (flag) {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setIndeterminate(true);
            mProgressDialog.setMessage("Loading Data...");
            mProgressDialog.setCanceledOnTouchOutside(false);
            mProgressDialog.show();
        } else {
            if (mProgressDialog.isShowing()) {
                mProgressDialog.dismiss();
            }
        }
    }
}
