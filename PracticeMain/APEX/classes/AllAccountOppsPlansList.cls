public class AllAccountOppsPlansList {

    // Static method to fetch and display all Accounts, Opportunities, and Plans
    public static void fetchAllAccountPlans() {

        // Fetch all OpportunityLineItems linked to Accounts
        List<OpportunityLineItem> allPlans = [
            SELECT 
                Opportunity.Account.Id,
                Opportunity.Account.Name,
                Opportunity.Id,
                Opportunity.Name,
                Opportunity.StageName,
                PricebookEntry.Pricebook2.Name,
                PricebookEntry.Product2.Id,
                PricebookEntry.Product2.Name,
                PricebookEntry.Product2.ProductCode,
                PricebookEntry.Product2.IsActive,
                PricebookEntry.UnitPrice,
                Quantity,
                TotalPrice
            FROM OpportunityLineItem
            WHERE Opportunity.AccountId != NULL
            ORDER BY Opportunity.Account.Name, Opportunity.Name
        ];
        
        // Map to store Account → List of Plan Details
        Map<Id, List<String>> accountPlansMap = new Map<Id, List<String>>();
        Map<Id, String> accountNames = new Map<Id, String>();
        
        // Loop through each OpportunityLineItem
        for (OpportunityLineItem oli : allPlans) {
            Id accId = oli.Opportunity.Account.Id;
            String accName = oli.Opportunity.Account.Name;
        
            String planDetails = 
                'Opportunity: ' + oli.Opportunity.Name + 
                ' | Stage: ' + oli.Opportunity.StageName + 
                ' | Pricebook: ' + oli.PricebookEntry.Pricebook2.Name + 
                ' | Plan: ' + oli.PricebookEntry.Product2.Name + 
                ' | Active: ' + oli.PricebookEntry.Product2.IsActive + 
                ' | UnitPrice: ' + oli.PricebookEntry.UnitPrice + 
                ' | Total: ' + oli.TotalPrice;
        
            if (!accountPlansMap.containsKey(accId)) {
                accountPlansMap.put(accId, new List<String>());
                accountNames.put(accId, accName);
            }
        
            accountPlansMap.get(accId).add(planDetails);
        }
        
        // 🧾 Print Results Grouped by Account
        for (Id accId : accountPlansMap.keySet()) {
            System.debug('====================================');
            System.debug('Account: ' + accountNames.get(accId));
            System.debug('------------------------------------');
            for (String detail : accountPlansMap.get(accId)) {
                System.debug(detail);
            }
        }
    }
}