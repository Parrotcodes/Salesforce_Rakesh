public class week9AllActivePlanServices {

    public static void fetchAllServicePlans() {

        // Fetch all Plans (Products) linked to each Service (Opportunity)
        List<OpportunityLineItem> servicePlans = [
            SELECT
                Opportunity.Id,
                Opportunity.Name,
                Opportunity.Account.Name,
                PricebookEntry.Product2.Id,
                PricebookEntry.Product2.Name,
                PricebookEntry.Product2.ProductCode,
                PricebookEntry.Pricebook2.Name,
                PricebookEntry.UnitPrice,
                Quantity,
                TotalPrice
            FROM OpportunityLineItem
            WHERE Opportunity.Id != NULL
            ORDER BY Opportunity.Name
        ];

        // Display results in debug logs
        System.debug('===== All Service Plans =====');
        for (OpportunityLineItem oli : servicePlans) {
            System.debug(
                'Service (Opportunity): ' + oli.Opportunity.Name +
                ' | Account: ' + oli.Opportunity.Account.Name +
                ' | Plan: ' + oli.PricebookEntry.Product2.Name +
                ' | Pricebook: ' + oli.PricebookEntry.Pricebook2.Name +
                ' | Unit Price: ' + oli.PricebookEntry.UnitPrice +
                ' | Qty: ' + oli.Quantity +
                ' | Total: ' + oli.TotalPrice
            );
        }
    }
}