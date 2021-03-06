package cn.linhome.lib.selectionmanager;

import android.view.View;
import android.view.View.OnClickListener;

public class FSelectViewManager<T extends View> extends FSelectManager<T>
{
    private OnClickListener mOnClickListener = new OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            performClick((T) v);
        }
    };

    @Override
    protected void onInitItem(T item)
    {
        super.onInitItem(item);
        item.setOnClickListener(mOnClickListener);
        item.setSelected(false);
    }

    @Override
    protected void onNormal(T item)
    {
        super.onNormal(item);
        item.setSelected(false);
    }

    @Override
    protected void onSelected(T item)
    {
        super.onSelected(item);
        item.setSelected(true);
    }
}
