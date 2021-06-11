import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
     public List<String> getWorkouts(String workouttypes) {
        List<String> Workout = new ArrayList<String>();

        if (workouttypes.equals("Chest")) {
            Workout.add("Bench Press");
            Workout.add("Cable Flys");
        } else if (workouttypes.equals("Triceps")) {
            Workout.add("Tricep Ext");
            Workout.add("Tricep PushDowns");
        } else if (workouttypes.equals("Shoulders")) {
            Workout.add("Shoulder Press");
        } else if (workouttypes.equals("Biceps")) {
            Workout.add("Biecep Curls");
        }
        return Workout;

    }

}