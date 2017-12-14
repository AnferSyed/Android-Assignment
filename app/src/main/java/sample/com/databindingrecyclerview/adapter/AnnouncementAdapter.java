package sample.com.databindingrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import sample.com.databindingrecyclerview.BR;
import sample.com.databindingrecyclerview.R;
import sample.com.databindingrecyclerview.data.AnnouncementItem;

/**
 * Created by anfer on 12-Dec-17.
 */

public class AnnouncementAdapter extends RecyclerView.Adapter<AnnouncementViewHolder> {

    private Context context;
    private List<AnnouncementItem> announcementObjectList;

    public interface CustomItemClickListener {

        public void onItemClick(AnnouncementItem announcementItem);

    }

    CustomItemClickListener listener;

    public AnnouncementAdapter(Context context, List<AnnouncementItem> announcementObjectList, CustomItemClickListener listener) {
        this.context = context;
        this.announcementObjectList = announcementObjectList;
        this.listener = listener;
    }

    @Override
    public AnnouncementViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.announcement_item_layout, parent, false);
        final AnnouncementViewHolder mViewHolder = new AnnouncementViewHolder(view);

        view.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                listener.onItemClick(getAnnouncementItem(mViewHolder.getAdapterPosition()));

            }

        });
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(AnnouncementViewHolder holder, int position) {
        final AnnouncementItem annoucementObject = announcementObjectList.get(position);
        holder.getBindings().setVariable(BR.announcement, annoucementObject);
        holder.getBindings().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return announcementObjectList.size();
    }

    /**
     * getAnnouncementItem - Method to get the announcement item for the position.
     *
     * @param postion
     * @return
     */
    public AnnouncementItem getAnnouncementItem(int postion) {
        return announcementObjectList.get(postion);
    }
}
