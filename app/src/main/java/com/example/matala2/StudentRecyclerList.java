package com.example.matala2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.matala2.model.Model;
import com.example.matala2.model.Student;

import java.util.List;

public class StudentRecyclerList extends AppCompatActivity {
    List<Student> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_recycler_list);

         data = Model.instance().getAllStudents();
        RecyclerView list = findViewById(R.id.studentrecycler_list);
        list.setHasFixedSize(true);

        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new StudentRecyclerAdapter());
    }
    class StudentViewHolder extends RecyclerView.ViewHolder{
        TextView nameTv;
        TextView idTv;
        CheckBox cb;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
             nameTv = itemView.findViewById(R.id.studentlistrow_name_tv);
             idTv = itemView.findViewById(R.id.studentlistrow_id_tv);
             cb = itemView.findViewById(R.id.studentlistrow_cb);
            cb.setOnClickListener((new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    int pos = (int)cb.getTag();
                    Student st = data.get(pos);
                    st.cb = cb.isChecked();
                }
            }));
        }

        public void bind(Student st, int pos) {
            cb.setTag(pos);
            cb.setChecked(st.getCb());
            nameTv.setText(st.getName());
            idTv.setText(st.getId());
        }
    }
    class StudentRecyclerAdapter extends RecyclerView.Adapter<StudentViewHolder>{

        @NonNull
        @Override
        public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = getLayoutInflater().inflate(R.layout.student_list_row, parent,false);

            return new StudentViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
            Student st = data.get(position);
            holder.bind(st, position);

        }

        @Override
        public int getItemCount() {
            return data.size();
        }
    }
}