package Week3.FinalTask;

import java.util.Comparator;

class ValidityComparator implements Comparator<ISPPlans> {
    @Override
    public int compare(ISPPlans date1, ISPPlans date2) {
        return Integer.compare(date1.getValidity(),date2.getValidity());
    }
}
