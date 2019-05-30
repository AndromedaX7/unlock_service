package com.zhhl.unlock.client;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.github.library.listener.OnRecyclerItemClickListener;
import com.zhhl.unlock.R;

import java.util.ArrayList;

/**
 * 订单列表
 * Created by czy on 2019/5/30 8:34.
 */
public class OrderListActivity extends BaseActivity {

    private RecyclerView recyclerView;
    private OrderListAdapter adapter;
    private ArrayList<Data> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);
        setTitleStr("订单列表");
        setData();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(OrderListActivity.this));
        adapter = new OrderListAdapter(OrderListActivity.this,mData);
        adapter.openLoadAnimation(false);
        adapter.setOnRecyclerItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent;
                switch (mData.get(position).getState()){
                    case "待评价":
                        intent = new Intent(OrderListActivity.this,EvaluationServiceActivity.class);
                        startActivity(intent);
                        break;
                    case "已评价":
                        intent = new Intent(OrderListActivity.this,EvaluationServiceFinishActivity.class);
                        startActivity(intent);
                        break;
                }

            }
        });

        recyclerView.setAdapter(adapter);

    }

    private void setData(){
        mData = new ArrayList<>();
        Data data1 = new Data();
        data1.setName("龙首壹号院");
        data1.setDate("2019-04-20");
        data1.setAddress("长春市超达大路芳草街 18栋 三门 1803室内");
        data1.setState("待评价");
        mData.add(data1);
        Data data2 = new Data();
        data2.setName("龙首壹号院");
        data2.setDate("2019-04-20");
        data2.setAddress("长春市超达大路芳草街 18栋 三门 1803室内");
        data2.setState("已评价");
        mData.add(data2);
        Data data3 = new Data();
        data3.setName("龙首壹号院");
        data3.setDate("2019-04-20");
        data3.setAddress("长春市超达大路芳草街 18栋 三门 1803室内");
        data3.setState("已评价");
        mData.add(data3);

    }



    public class Data {
        private String name;
        private String date;
        private String address;
        private String state;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
