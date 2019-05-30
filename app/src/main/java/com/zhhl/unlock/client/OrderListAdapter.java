package com.zhhl.unlock.client;

import android.content.Context;
import android.graphics.Color;

import com.github.library.BaseRecyclerAdapter;
import com.github.library.BaseViewHolder;
import com.zhhl.unlock.R;

import java.util.ArrayList;

/**
 * Created by czy on 2019/5/30 8:48.
 */
public class OrderListAdapter extends BaseRecyclerAdapter<OrderListActivity.Data> {

    public OrderListAdapter(Context context,ArrayList<OrderListActivity.Data> mData){
        super(context,mData,R.layout.item_order_list);
    }

    @Override
    protected void convert(BaseViewHolder helper, OrderListActivity.Data item) {
        helper.setText(R.id.name,item.getName());
        helper.setText(R.id.data,item.getDate());
        helper.setText(R.id.address,item.getAddress());
        helper.setText(R.id.state,item.getState());
        switch (item.getState()){
            case "待评价":
                helper.setTextColor(R.id.state, Color.parseColor("#990033"));
                break;
            case "已评价":
                helper.setTextColor(R.id.state,Color.parseColor("#008000"));
                break;
        }
    }
}
