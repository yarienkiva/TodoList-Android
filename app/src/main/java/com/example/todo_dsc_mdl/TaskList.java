package com.example.todo_dsc_mdl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class TaskList extends BaseAdapter {
    private List<Task> listTask;
    private Context context;
    private LayoutInflater inflater;

    public TaskList(List<Task> listTask, Context context) {
        this.listTask = listTask != null ?  listTask : new ArrayList<Task>();
        this.listTask.add(new Task("Créer une ToDo App", "Passer trop de temps sur un truc qui marchera qu'à peu près",
                "2021", "60", "Relax", "Bureau"));
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void addTask(Task task) {
        if (task != null) {
            this.listTask.add(task);
        }
    }

    @Override
    public int getCount() {
        return this.listTask.size();
    }

    @Override
    public Object getItem(int position) {
        return this.listTask.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            view = (View) this.inflater.inflate(R.layout.task_item, parent, false);
        } else {
            view = (View) convertView;
        }

        TextView taskLabelTextView   = (TextView) view.findViewById(R.id.taskLabelTextView);
        TextView taskDateTextView    = (TextView) view.findViewById(R.id.taskDateTextView);
        CheckBox taskConfirmCheckBox = (CheckBox) view.findViewById(R.id.taskConfirmCheckBox);

        taskLabelTextView.setText(listTask.get(position).getTaskName());
        taskDateTextView.setText(listTask.get(position).getTaskDate());
        taskConfirmCheckBox.setChecked(listTask.get(position).isTaskCompleted());

        return view;
    }
}