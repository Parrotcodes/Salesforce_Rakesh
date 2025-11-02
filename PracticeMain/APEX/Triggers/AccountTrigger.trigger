Trigger AccountTrigger on Account(Before Update){
    System.debug('is updating before is delete');
  if(Trigger.isDelete){
    System.debug(Trigger.isDelete);
}
    System.debug('is delete after');
}