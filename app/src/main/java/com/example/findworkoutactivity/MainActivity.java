package com.example.findworkoutactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindWorkOut(View view) {
        TextView workouts = findViewById(R.id.tv_workout);
        Spinner workoutType = findViewById(R.id.workout_type);
        String workout = String.valueOf(workoutType.getSelectedItem());
        List<String> workoutList = expert.getWorkouts(workout);
        StringBuilder workoutsFormatted = new StringBuilder();
        for (String work : workoutList) {
            workoutsFormatted.append(work);
        }
        workouts.setText(workoutsFormatted);

    }
}