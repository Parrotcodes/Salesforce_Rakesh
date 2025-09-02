package Week3.FinalTask;

import java.util.Comparator;

class Typecomparator implements Comparator<ISPPlans> {
    @Override
    public int compare(ISPPlans type1, ISPPlans type2) {
        return type1.getType().compareTo(type2.getType());
    }
}

