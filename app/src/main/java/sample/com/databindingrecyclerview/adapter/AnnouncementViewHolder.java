package sample.com.databindingrecyclerview.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by anfer on 12-Dec-17.
 */

public class AnnouncementViewHolder extends RecyclerView.ViewHolder  {
    private ViewDataBinding bindings;
    public AnnouncementViewHolder(View itemView) {
        super(itemView);
        bindings = DataBindingUtil.bind(itemView);
    }
    public ViewDataBinding getBindings(){
        return bindings;
    }

}
