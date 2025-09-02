package Week3.FinalTask;

import java.util.Comparator;

class PlanNameComparator implements Comparator<ISPPlans> {
    @Override
    public int compare(ISPPlans name1, ISPPlans name2) {
        return name1.getName().compareTo(name2.getName());
    }
}
