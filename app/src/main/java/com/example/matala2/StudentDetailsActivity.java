package com.example.matala2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.matala2.model.Model;
import com.example.matala2.model.Student;

public class StudentDetailsActivity extends AppCompatActivity {
    Student st;
    TextView nameTv;
    TextView idTv;
    TextView phoneTv;
    TextView addressTv;
    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
    }

    @Override
    protected void onStart() {
        super.onStart();

        if(st==null || st.id.equals(Model.instance().getAllStudents().get((int)getIntent().getExtras().get("index")).id)){
            st= Model.instance().getAllStudents().get((int)getIntent().getExtras().get("index"));
        }
        nameTv = findViewById(R.id.studentdetails_name_tv);
        idTv = findViewById(R.id.studentdetails_id_tv);
        phoneTv = findViewById(R.id.studentdetails_phone_tv);
        addressTv = findViewById(R.id.studentdetails_address_tv);
        cb = findViewById(R.id.editstudent_cb);
        Button editBtn = findViewById(R.id.studentdetails_edit_btn);

        nameTv.setText(st.name);
        idTv.setText(st.id);
        phoneTv.setText(st.phone.length()>0 ? st.phone : "unkown");
        addressTv.setText(st.address.length()>0 ? st.address : "unkown");
        cb.setChecked(st.cb);

        editBtn.setOnClickListener(view->{
            Intent intent = new Intent(this,EditStudentActivity.class);
            intent.putExtra("student",(int)getIntent().getExtras().get("index"));
            startActivity(intent);
        });
    }
}