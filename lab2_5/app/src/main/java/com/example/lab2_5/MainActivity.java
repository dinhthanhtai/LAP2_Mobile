package com.example.lab2_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editId,editName;
    Button btnNhap;
    CheckBox checkBox;
    ListView lvNhanvien;
    ArrayList<Employee> arrEmployee=new ArrayList<Employee>();
    ArrayAdapter<Employee> adapter=null;
    //Khai báo 1 employee object
    Employee employee=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNhap=(Button) findViewById(R.id.btnNhap);
        editId=(EditText) findViewById(R.id.editMa);
        editName=(EditText) findViewById(R.id.editTen);
        checkBox=(CheckBox) findViewById(R.id.checked);

        lvNhanvien=(ListView) findViewById(R.id.lvnhanvien);
        arrEmployee=new ArrayList<Employee>();
        //Khởi tạo đối tượng adapter và gán Data source
        adapter=new EmployeeAdapter(
                this,
                R.layout.item_employee,// lấy custom layout
                arrEmployee/*thiết lập data source*/);
        lvNhanvien.setAdapter(adapter);//gán Adapter vào Lisview

        btnNhap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                xulyNhap();
            }
        });
    }
    //gọi hàm xử lý nhập thông tin nhân viên
    public void xulyNhap()
    {
        String ma=editId.getText()+"";
        String ten=editName.getText()+"";
        Boolean ismanager = false;

        if(checkBox.isChecked())
            ismanager =true;
        //Tạo một employee
        Employee emp= new Employee();
        emp.setId(ma);
        emp.setName(ten);
        emp.setIsmanager(ismanager);
        //Đưa vào danh sách
        arrEmployee.add(emp);
        //gọi hàm cập nhật giao diện
        adapter.notifyDataSetChanged();
        //Sau khi update thì xóa trắng dữ liệu và cho editma focus

    }
    //hàm xử lý xóa
}