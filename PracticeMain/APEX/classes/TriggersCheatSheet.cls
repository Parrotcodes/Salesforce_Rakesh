public class TriggersCheatSheet {
	//Trigger basic - syntax 
	
	//-------- trigger events (before & after)--------
	//before insert
	//before update
	//before delete
	//after insert
	//after update
	//after delete
	//after undelete
	
	//--------------Context Varibales---------------------- ]
	//Defn:allows the allows us access the runtime context of any trigger
	
	//trigger.new -- returns the list of records (bcz of which trigger got intiated / database execution got intiated)
	//trigger.old -- readonly
	//trigger.map
	//trigger.oldMap
	//
	//
	//Note:
	//trigger.new and trigger.old can not be used with DML operation (insert,update,delete)
    
    
}