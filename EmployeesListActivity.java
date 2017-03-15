package com.felight.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
public class EmployeesListActivity extends AppCompatActivity {
    private ListView lvEmployees;
    private List empList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employees_list);
        lvEmployees = (ListView) findViewById(R.id.lvEmployees);
        initialize();
    }
    @Override
    protected void onStart() {
        super.onStart();
        EmployeeListAdapter adapter = new EmployeeListAdapter(this, empList);
        lvEmployees.setAdapter(adapter);
    }
    private void initialize() {
        empList = new ArrayList();
        empList.add(new Employee(1,"Jack",606060));
        empList.add(new Employee(100,"Veena",350000));
        empList.add(new Employee(100,"Hani",450000));
        empList.add(new Employee(100,"Dushyanth",3250000));
        empList.add(new Employee(100,"Saurabh",550000));
        empList.add(new Employee(100,"Madhu",250000));
        empList.add(new Employee(100,"Sumanth",650000));
        empList.add(new Employee(100,"Kavya",660000));
        empList.add(new Employee(100,"Vandana",6450000));
        empList.add(new Employee(100,"Thanu",540000));
        empList.add(new Employee(100,"Shan",4500000));
        empList.add(new Employee(100,"Amritha",3540000));
        empList.add(new Employee(100,"Anusha",543000));
        empList.add(new Employee(100,"Anish",5320000));
        empList.add(new Employee(100,"Bunty",987000));
        empList.add(new Employee(100,"Manish",867000));
        empList.add(new Employee(100,"Motu",273000));



    }
}
