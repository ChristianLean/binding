package com.example.binding;


import android.databinding.DataBindingUtil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import android.widget.Toast;

import com.example.binding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding  mBinding;
    EmployeeAdapter mEmployeeAdapter;

    public  class Presenter{
        public void onClickAddItem(View view){
            mEmployeeAdapter.add(new Employee("fuck","1",false));

        }
        public void onClickRemoveItem(View view){
            mEmployeeAdapter.remove();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        mBinding.setPresenter(new Presenter());

        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mEmployeeAdapter = new EmployeeAdapter(this);
        mBinding.recyclerView.setAdapter(mEmployeeAdapter);
        mEmployeeAdapter.setListener(new EmployeeAdapter.OnItemClickListener() {
            @Override
            public void onEmployeeClick(Employee employee) {
                Toast.makeText(MainActivity.this,employee.getFirstName(),Toast.LENGTH_LONG).show();
            }
        });
        List<Employee> demoList = new ArrayList<>();
        demoList.add(new Employee("christian","Lee",false));
        demoList.add(new Employee("christian2","Lee2",false));
        demoList.add(new Employee("christian3","Lee3",true));
        demoList.add(new Employee("christian4","Lee4",false));
        mEmployeeAdapter.addAll(demoList);
    }
}
