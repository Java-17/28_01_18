package com.sheygam.java_17_28_01_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MyAdapter.ItemClickListener {

    private RecyclerView myList;
    private MyAdapter adapter;
    private Button addBtn, removeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new MyAdapter(this);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        myList = findViewById(R.id.my_list);
        myList.setLayoutManager(manager);
        myList.setAdapter(adapter);
        RecyclerView.ItemDecoration divider =
                new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        myList.addItemDecoration(divider);
        addBtn = findViewById(R.id.add_btn);
        removeBtn = findViewById(R.id.remove_btn);
        addBtn.setOnClickListener(this);
        removeBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.add_btn){
            adapter.addPerson();
        }else if(view.getId() == R.id.remove_btn){
            adapter.removePerson();
        }
    }

    @Override
    public void onItemClick(Person person, int position) {
        Toast.makeText(this, person.getName() + " " + position, Toast.LENGTH_SHORT).show();
    }
}
