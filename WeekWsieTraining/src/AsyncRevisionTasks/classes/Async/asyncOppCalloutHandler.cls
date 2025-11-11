public class asyncOppCalloutHandler {
    
    @future(callout=true)
    public static void NotifyToOustideSysem(List<Id> ids){
        List<Opportunity> opps = [select id, name, Amount from Opportunity where id In :ids];
        Http h = new Http();
        
        for(Opportunity o: opps){
            HttpRequest req = new HttpRequest();
            req.setEndPoint('http://api.demo.com/test');
            req.setMethod('post');
            req.setHeader('Cotent-Type','application/json');
            req.setBody(JSON.serialize(o));
            
            h.send(req);
        }
    }

}