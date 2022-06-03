package com.razvan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ActivitySelection {

    private final List<Activity> allActivities;

    public ActivitySelection(List<Activity> allActivities) {
        this.allActivities = List.copyOf(allActivities);
    }
    
    public List<Activity> select() {

        List<Activity> activitiesSortedByEnd = allActivities.stream()
            .sorted(Comparator.comparingInt(Activity::getEnd))
            .collect(Collectors.toList());

        List<Activity> activitiesSortedByEnd2 = allActivities.stream()
            .sorted((Activity a1, Activity a2) -> a1.getEnd() - a2.getEnd())
            .collect(Collectors.toList());

        List<Activity> activitiesSortedByEnd3 = allActivities.stream()
            .sorted((Activity a1, Activity a2) -> {
                if (a1.getEnd() == a2.getEnd()) {
                    return 0;
                }
                if (a1.getEnd() < a2.getEnd()) {
                    return -1;
                } else {
                    return 1;
                }
            })
            .collect(Collectors.toList());

        System.out.println(activitiesSortedByEnd);
        System.out.println(activitiesSortedByEnd2);
        System.out.println(activitiesSortedByEnd3);

        Activity reference = activitiesSortedByEnd.get(0);
        List<Activity> result = new ArrayList<>();

        result.add(reference);

        for (Activity activity : activitiesSortedByEnd) {
            if (activity.getStart() >= reference.getEnd()) {
                result.add(activity);
                reference = activity;
            }
        }

        return result;
    }
}
